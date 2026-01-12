import java.util.Scanner;

public class Vowel {
     public static void main(String args[])
		{

 	 System.out.println("Enter any Letter ");
	 Scanner s1= new Scanner(System.in);
	 char a = s1.next().charAt(0);
	
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')	
 	 System.out.println("Given Letter is Vowel ");

	 else
	System.out.println("Given Letter is Not Vowel ");

	s1.close();
	}
}