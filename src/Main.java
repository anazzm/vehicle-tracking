import model.*;
import service.*;

public class Main {

    public static void main(String[] args) {

        Geofence office = new Geofence(12.9716, 77.5946, 150);

        Vehicle vehicle = new Vehicle("V123");
        Trip trip = new Trip("T1", "V123");

        TripService tripService = new TripService(office);

        vehicle.updateLocation(12.9715, 77.5945, 5);

        tripService.processLocationUpdate(trip, vehicle);
    }
}