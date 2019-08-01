import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts());
        System.out.println(airport.getTerminals());

        Aircraft aircraft = new Aircraft("New Boeing");
        System.out.println(aircraft.getModel());

        Terminal terminal = new Terminal("New Terminal");
        System.out.println(terminal.getName());
        System.out.println(terminal.getParkedAircrafts());
        terminal.addParkingAircraft(aircraft);
        System.out.println(terminal.getParkedAircrafts());
        System.out.println(terminal.getFlights());


        //terminal.addFlight(flight);

        //Flight flight = new Flight("A1", Flight.Type.ARRIVAL, 03:02, aircraft);
    }
}
