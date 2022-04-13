package Tecnicas.Projeto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        // Gera uma lista de informações retiradas do arquivo
        String[] file = FileHandler.readFile("src/Tecnicas/Projeto/Entrada/flights.csv");

        //Converte a lista de informações em uma lista de objetos FlightRoute
        List<FlightRoute> flightRouteList = Arrays.stream(file).skip(1).map(FlightRoute::new).collect(Collectors.toList());

        //flightRouteList.forEach(System.out::println);

        // Cria o primeiro arquivo de saída com os dados de entrada + a duração do voo em horas
        FileHandler.writeFile("src/Tecnicas/Projeto/Saida/flights.csv", flightRouteList.stream().sorted(Comparator.comparing(FlightRoute::getOrigin).thenComparing(FlightRoute::getDestination).thenComparing(FlightRoute::getFlightDuration).thenComparing(FlightRoute::getPrice).thenComparing(FlightRoute::getAirline)).map(FlightRoute::toFileLine).toArray(String[]::new), "origin;destination;airline;departure;arrival;price;time");

        Map<String, FlightSummary> flightSummaryMap = flightRouteList.stream().sorted(Comparator.comparing(FlightRoute::getOrigin).thenComparing(FlightRoute::getDestination)).collect(Collectors.groupingBy(FlightRoute::getRoute)).entrySet().stream().map(Main::mapToSummary).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //Cria o segundo arquivo de saída com os dados ordenados
        FileHandler.writeFile("src/Tecnicas/Projeto/Saida/flightsSummary.csv", flightSummaryMap.entrySet().stream().map(e -> e.getKey() + ";" + e.getValue().toFileString()).toArray(String[]::new), "origin;destination;shortest_flight(h);longest_fight(h);cheapest_flight;most_expensive_flight;average_time;average_price");
    }

    private static Map.Entry<String, FlightSummary> mapToSummary(Map.Entry<String, List<FlightRoute>> entry)
    {
        List<FlightRoute> flights = entry.getValue();
        long shortest_flight = flights.stream().mapToLong(FlightRoute::getFlightDuration).min().getAsLong();
        long longest_fight = flights.stream().mapToLong(FlightRoute::getFlightDuration).max().getAsLong();
        BigDecimal cheapest_flight = flights.stream().map(FlightRoute::getPrice).min(Comparator.naturalOrder()).get();
        BigDecimal most_expensive_flight = flights.stream().map(FlightRoute::getPrice).max(Comparator.naturalOrder()).get();
        double average_time = flights.stream().mapToLong(FlightRoute::getFlightDuration).average().getAsDouble();
        BigDecimal average_price = average(flights.stream().map(FlightRoute::getPrice).collect(Collectors.toList()));

        return Map.entry(entry.getKey(), new FlightSummary(shortest_flight, longest_fight, cheapest_flight, most_expensive_flight, (float) average_time, average_price));
    }

    public static BigDecimal average(List<BigDecimal> bigDecimals)
    {
        BigDecimal sum = bigDecimals.stream().map(Objects::requireNonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum.divide(new BigDecimal(bigDecimals.size()), RoundingMode.HALF_UP);
    }
}
