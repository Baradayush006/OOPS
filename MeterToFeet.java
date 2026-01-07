import java.util.Scanner;

public class MeterToFeet {
    public static void main(String args[])
	 {

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = s1.nextDouble();

        double feet = meters * 3.28084;


        System.out.printf("Distance in feet: %.2f", feet);


        s1.close();
     }
}