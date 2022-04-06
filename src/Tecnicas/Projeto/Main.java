package Tecnicas.Projeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
        FileHandler.writeFile("src/Tecnicas/Projeto/Saida/flights.csv", flightRouteList.stream().map(FlightRoute::toFileLine).toArray(String[]::new), "origin;destination;airline;departure;arrival;price;time");

        //Cria o segundo arquivo de saída com os dados ordenados
        FileHandler.writeFile("src/Tecnicas/Projeto/Saida/flights2.csv", groupAndSort(flightRouteList), "origin;destination;shortest_flight(h);longest_fight(h);cheapest_flight;most_expensive_flight;average_time;average_price");
    }

    //Group all List<FlightRoute> by origin and destination and then return shortest_flight(h);longest_fight(h);cheapest_flight;most_expensive_flight;average_time;average_price
    private static String[] groupAndSort(List<FlightRoute> flightRoutes)
    {
        //Group all List<FlightRoute> by origin and destination
        Map<String, List<FlightRoute>> groupedFlightRoutes = flightRoutes.stream().collect(Collectors.groupingBy(FlightRoute::getOrigin));

        //Create a new list to store the result
        List<String> result = new ArrayList<>();

        //For each group
        for (Map.Entry<String, List<FlightRoute>> entry : groupedFlightRoutes.entrySet())
        {
            //Get the origin and destination
            String origin = entry.getKey();
            String destination = entry.getValue().get(0).getDestination();

            //Get the shortest_flight(h);longest_fight(h);cheapest_flight;most_expensive_flight;average_time;average_price
            String[] flightRouteInfo = getFlightRouteInfo(entry.getValue());

            //Add the result to the list
            result.add(origin + ";" + destination + ";" + flightRouteInfo[0] + ";" + flightRouteInfo[1] + ";" + flightRouteInfo[2] + ";" + flightRouteInfo[3] + ";" + flightRouteInfo[4] + ";" + flightRouteInfo[5]);
        }

        //Return the list
        return result.toArray(new String[0]);
    }

    private static String[] getFlightRouteInfo(List<FlightRoute> value)
    {
        //Get the shortest_flight(h);longest_fight(h);cheapest_flight;most_expensive_flight;average_time;average_price
        String[] flightRouteInfo = new String[6];

        //Get the shortest_flight(h)
        flightRouteInfo[0] = String.valueOf(value.stream().mapToInt(FlightRoute::getDuration).min().getAsInt() / 60);

        //Get the longest_fight(h)
        flightRouteInfo[1] = String.valueOf(value.stream().mapToInt(FlightRoute::getDuration).max().getAsInt() / 60);

        //Get the cheapest_flight
        flightRouteInfo[2] = String.valueOf(value.stream().mapToDouble(FlightRoute::getPrice).min().getAsDouble());

        //Get the most_expensive_flight
        flightRouteInfo[3] = String.valueOf(value.stream().mapToDouble(FlightRoute::getPrice).max().getAsDouble());

        //Get the average_time
        flightRouteInfo[4] = String.valueOf(value.stream().mapToInt(FlightRoute::getDuration).average().getAsDouble() / 60);

        //Get the average_price
        flightRouteInfo[5] = String.valueOf(value.stream().mapToDouble(FlightRoute::getPrice).average().getAsDouble());

        return flightRouteInfo;
    }
}
