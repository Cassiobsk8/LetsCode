package Tecnicas.Projeto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FlightRoute
{
    private String origin;
    private String destination;
    private String airline;
    private OffsetDateTime departure;
    private OffsetDateTime arrival;
    private BigDecimal price;

    private long flightDuration;

    public FlightRoute(String flightRoute)
    {
        String[] flightRouteSplit = flightRoute.split(";");
        if (flightRouteSplit.length != 6)
        {
            System.out.println("Invalid flight route format");
            return;
        }
        this.origin = flightRouteSplit[0];
        this.destination = flightRouteSplit[1];
        this.airline = flightRouteSplit[2];
        this.departure = OffsetDateTime.parse(flightRouteSplit[3], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss (XXX)"));
        this.arrival = OffsetDateTime.parse(flightRouteSplit[4], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss (XXX)"));
        this.price = new BigDecimal(flightRouteSplit[5]);
        this.flightDuration = departure.until(arrival, ChronoUnit.HOURS);
    }

    public String getRoute()
    {
        return this.origin + ";" + this.destination;
    }

    public String toFileLine()
    {
        return origin + ";" + destination + ";" + airline + ";" + departure.toString() + ";" + arrival.toString() + ";R$ " + price.toString() + ";" + flightDuration + " Hours";
    }

    public String getOrigin()
    {
        return origin;
    }

    public String getDestination()
    {
        return destination;
    }

    public String getAirline()
    {
        return airline;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public long getFlightDuration()
    {
        return flightDuration;
    }
}
