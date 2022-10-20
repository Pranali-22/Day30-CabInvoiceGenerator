package com.bridgelabz;

public class InvoiceGenerator {

    public static final double COST_PER_KM = 10;
    public static final int COST_PER_Min = 1;
    public static final double MINIMUM_FARE = 5;
    public double calculateFare(double distance, int time){
        double totalFare = distance* COST_PER_KM + time * COST_PER_Min;
        if(totalFare<MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }

    public double calculateFare(Ride[] rides){
        double totalFare=0;
        for(Ride ride : rides)
            totalFare = totalFare+ this.calculateFare(ride.distance, ride.time);

        return totalFare;
    }

    public double calculateAverageFare(int numOfRides, double totalFare){
        double averageFare = totalFare/numOfRides;
        return averageFare;
    }

    public Object[] getRideDetails(Ride[] rides){
        Object[] temp = new Object[3];
        temp[0] = rides.length;
        temp[1] = this.calculateFare(rides);
        temp[2] = this.calculateAverageFare((Integer) temp[0], (Double)temp[1]);
        return temp;
    }
}