package com.bridgelabz;

import java.util.ArrayList;

public class User {
    private int userId;
    ArrayList<Ride> rideList = new ArrayList<Ride>();

    public User(int userId) {
        this.userId = userId;
    }

    public void addRideToList(Ride ride){
       rideList.add(ride);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<Ride> getRideList() {
        return rideList;
    }

    public void setRideList(ArrayList<Ride> rideList) {
        this.rideList = rideList;
    }
}
