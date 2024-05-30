package Arrays;

public class MultiArray {

	public static void main(String[] args) {
		
		
		//initialisation of an array
//			int[] arr ={ 10, 20, 30, 40, 50};
//			for (int i=0;i<arr.length;i++)
// 			System.out.println("array value: " +arr{i]);
		
		
		//Multi diamensional array
		
		int mArray [] [] = new int[2][2]; //new is keyword used to allocate the memory
		
		mArray[0][0]=10;
		mArray[0][1]=20;
		mArray[1][0]=30;
		mArray[1][1]=40;
	
		System.out.println("length the of array:"  +mArray.length);
		for(int i=0;i<=mArray.length;i++) {
			for (int j=0;j<mArray.length;j++) {
				System.out.println("array value:" +mArray[i][j]);
			}
		}
		
		//
			}
		}
	}

}
