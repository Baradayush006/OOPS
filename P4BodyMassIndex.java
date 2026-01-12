import java.util.Scanner;
	public class P4BodyMassIndex {
		public static void main(String args[]) 
			{
			System.out.println("Enter your Weight in pound and height in inch ");	
			Scanner s1=new Scanner(System.in);
			double w=s1.nextDouble();
			double h=s1.nextDouble();
             double Weight_kg,Height_meter,BMI;
			
			Weight_kg =w*0.45359237;
			Height_meter=h*0.0254;
			BMI=Weight_kg/((Height_meter)*(Height_meter));

			System.out.println("your BMI is = " +BMI);	

			


}
}