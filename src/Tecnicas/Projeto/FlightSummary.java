package Tecnicas.Projeto;

import java.math.BigDecimal;

public class FlightSummary
{
    long shortest_flight;
    long longest_fight;
    BigDecimal cheapest_flight;
    BigDecimal most_expensive_flight;
    float average_time;
    BigDecimal average_price;

    public FlightSummary(long shortest_flight, long longest_fight, BigDecimal cheapest_flight, BigDecimal most_expensive_flight, float average_time, BigDecimal average_price)
    {
        this.shortest_flight = shortest_flight;
        this.longest_fight = longest_fight;
        this.cheapest_flight = cheapest_flight;
        this.most_expensive_flight = most_expensive_flight;
        this.average_time = average_time;
        this.average_price = average_price;
    }

    @Override
    public String toString()
    {
        return shortest_flight + ";" + longest_fight + ";" + cheapest_flight + ";" + most_expensive_flight + ";" + average_time + ";" + average_price;
    }
}
