package Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int [] myArray;    // Creation of to the array
		
		myArray = new int[5];    // allocating memory to an array
		
		
		// Assigning the value to an array
		
		
		myArray[0]= 10;
		myArray[1]= 20;
		myArray[2]= 30;
		myArray[3]= 40;
		myArray[4]= 50;
		
		System.out.println("length of the array; " +myArray.length);
		

		for(int i=0;i<myArray.length;i++)
			System.out.println("array value: "+myArray[i]);
		
		
//		myArray = {  10,20,30,40,50  };

	}

}
