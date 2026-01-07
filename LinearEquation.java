import java.util.Scanner;

public class LinearEquation {

    public static void main(String args[]) 
	{

        Scanner sc = new Scanner(System.in);


        System.out.println("Equation form: ax + by = e");
        System.out.println("               cx + dy = f");

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        System.out.print("Enter d: ");
        double d = sc.nextDouble();

        System.out.print("Enter e: ");
        double e = sc.nextDouble();

        System.out.print("Enter f: ");
        double f = sc.nextDouble();

     
        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - c * e;

      
        if (D == 0) 	
			{
           	 System.out.println("No unique solution possible (D = 0)");
       		} 
	else  {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Solution is:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        sc.close();
    }
}
