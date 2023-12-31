package com.scaler.parkinglot.model;
import java.util.List;
public class ParkingLot extends BaseModel{
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    private String address ;
    private List<ParkingFloor> parkingFloors ;
    private List<Gate> gates;

}
