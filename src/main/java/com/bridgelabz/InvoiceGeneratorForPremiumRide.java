package com.bridgelabz;

public class InvoiceGeneratorForPremiumRide extends InvoiceGenerator{
    public static final double COST_PER_KM_PREMIUM = 15;
    public static final int COST_PER_Min_PREMIUM = 2;
    public static final double MINIMUM_FARE_PREMIUM = 20;

    @Override
    public double calculateFare(double distance, int time) {
        double totalFare = distance* COST_PER_KM_PREMIUM + time * COST_PER_Min_PREMIUM;
        if(totalFare<MINIMUM_FARE_PREMIUM)
            return MINIMUM_FARE_PREMIUM;
        return totalFare;
    }
}
