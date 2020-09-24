import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double startLong, startLati, endLong, endLati, distance;

        System.out.println("Enter the latitude of the starting location: ");
        startLati = in.nextDouble();
        System.out.println("Enter the longitude of the starting location");
        startLong = in.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        endLati = in.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        endLong = in.nextDouble();


        GeoLocation startLocation = new GeoLocation(startLati, startLong);
        GeoLocation endLocation = new GeoLocation(endLati, endLong);
        distance = startLocation.distanceFrom(endLocation);
        System.out.println("The distance is " + distance + " miles.");

    }
}