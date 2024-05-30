package Assignment;

public class AgeGroup {

	public static void main(String[] args) {
		
		
		int age=-1;
		
		if (age >= 0 && age<=1)
		{
			System.out.println("infant");
			}
		else if(age>=2 && age<=3)
		{
			System.out.println("Toddler");
		}
		else if(age>=4 && age<=12)
		{
			System.out.println("Child");
		}
		else if (age>=13 && age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age>=20 && age<=64)
		{
			System.out.println("Adult");
		}
		else if(age>=65)
		{
			System.out.println("senior");
		}
		else 
		{
			System.out.println("invalid age");
		}
	}
}
		
		
		
	


