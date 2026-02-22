package service;

import model.Trip;
import model.Vehicle;
import model.Geofence;

public class TripService {

    private GeofenceEngine geofenceEngine;
    private Geofence officeGeofence;

    public TripService(Geofence officeGeofence) {
        this.geofenceEngine = new GeofenceEngine();
        this.officeGeofence = officeGeofence;
    }

    public void processLocationUpdate(Trip trip, Vehicle vehicle) {

        if (trip.getStatus().equals("IN_PROGRESS")) {

            boolean inside = geofenceEngine.isInsideGeofence(
                    vehicle.getLatitude(),
                    vehicle.getLongitude(),
                    officeGeofence
            );

            if (inside && vehicle.getSpeed() < 10) {
                trip.completeTrip();
                System.out.println("Trip Auto-Completed!");
            }
        }
    }
}