package service;

import model.Geofence;
import util.DistanceCalculator;

public class GeofenceEngine {

    public boolean isInsideGeofence(double vehicleLat,
                                    double vehicleLon,
                                    Geofence geofence) {

        double distance = DistanceCalculator.calculate(
                vehicleLat,
                vehicleLon,
                geofence.getLatitude(),
                geofence.getLongitude()
        );

        return distance <= geofence.getRadius();
    }
}