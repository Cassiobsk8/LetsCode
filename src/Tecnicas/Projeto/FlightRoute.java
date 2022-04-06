package Tecnicas.Projeto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
        this.departure = convertDate(flightRouteSplit[3]);
        this.arrival = convertDate(flightRouteSplit[4]);
        this.price = new BigDecimal(flightRouteSplit[5]);
        this.flightDuration = departure.until(arrival, ChronoUnit.HOURS);
    }

    private static OffsetDateTime convertDate(String date)
    {
        String[] dateSplit = date.split(" ");
        String[] dateSplit2 = dateSplit[0].split("/");
        String[] timeSplit = dateSplit[1].split(":");

        return OffsetDateTime.of(Integer.parseInt(dateSplit2[2]), Integer.parseInt(dateSplit2[1]), Integer.parseInt(dateSplit2[0]), Integer.parseInt(timeSplit[0]), Integer.parseInt(timeSplit[1]), Integer.parseInt(timeSplit[2]), 0, OffsetDateTime.now().getOffset());
    }

    public String toFileLine()
    {
        return origin + ";" + destination + ";" + airline + ";" + departure.toString() + ";" + arrival.toString() + ";" + price.toString() + ";" + flightDuration + " Hours";
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

    public OffsetDateTime getDeparture()
    {
        return departure;
    }

    public OffsetDateTime getArrival()
    {
        return arrival;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public long getFlightDuration()
    {
        return flightDuration;
    }

    @Override
    public String toString()
    {
        return "FlightRoute{" + "origin='" + origin + '\'' + ", destination='" + destination + '\'' + ", airline='" + airline + '\'' + ", departure=" + departure + ", arrival=" + arrival + ", price=" + price + ", time=" + flightDuration + '}';
    }
}
