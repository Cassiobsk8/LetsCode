package Tecnicas.Projeto;

import java.math.BigDecimal;

public class FlightSummary
{
    long shortestFlight;
    long longestFight;
    BigDecimal cheapestFlight;
    BigDecimal mostExpensiveFlight;
    float averageTime;
    BigDecimal averagePrice;

    public FlightSummary(long shortestFlight, long longestFight, BigDecimal cheapestFlight, BigDecimal mostExpensiveFlight, float averageTime, BigDecimal averagePrice)
    {
        this.shortestFlight = shortestFlight;
        this.longestFight = longestFight;
        this.cheapestFlight = cheapestFlight;
        this.mostExpensiveFlight = mostExpensiveFlight;
        this.averageTime = averageTime;
        this.averagePrice = averagePrice;
    }

    public String toFileString()
    {
        return shortestFlight + ";" + longestFight + ";" + cheapestFlight + ";" + mostExpensiveFlight + ";" + averageTime + ";" + averagePrice;
    }
}
