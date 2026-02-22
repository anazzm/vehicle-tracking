package model;

import java.time.LocalDateTime;

public class Trip {

    private String tripId;
    private String vehicleId;
    private String status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Trip(String tripId, String vehicleId) {
        this.tripId = tripId;
        this.vehicleId = vehicleId;
        this.status = "IN_PROGRESS";
        this.startTime = LocalDateTime.now();
    }

    public String getStatus() {
        return status;
    }

    public void completeTrip() {
        this.status = "COMPLETED";
        this.endTime = LocalDateTime.now();
    }

    public String getTripId() {
        return tripId;
    }

    public String getVehicleId() {
        return vehicleId;
    }
}