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
}