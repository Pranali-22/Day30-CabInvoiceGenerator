package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;
public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnFare(){
        double distance = 3.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(35,fare,0.0);
    }

    @Test
    public void givenMinimumDistanceAndTime_ShouldReturnMinimumFare(){
        double distance = 0.2;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(5,fare,0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare(){
        Ride[] rides = {new Ride(3.0,5), new Ride(0.2,1)};
        double totalFare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(40,totalFare,0.0);
    }

    @Test
    public void givenRides_ShouldReturnRideDetails(){
        Ride[] rides = {new Ride(3.0,5), new Ride(0.2,1)};
        Object[] rideDetails = invoiceGenerator.getRideDetails(rides);
        int numOfRide = (int) rideDetails[0];
        double totalFare = (double) rideDetails[1];
        double avgFare = (double) rideDetails[2];
        Assert.assertEquals(2, numOfRide, 0);
        Assert.assertEquals(40, totalFare, 0.0);
        Assert.assertEquals(20, avgFare, 0.0);
    }
}
