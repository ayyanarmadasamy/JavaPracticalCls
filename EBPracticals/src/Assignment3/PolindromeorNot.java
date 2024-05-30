package Assignment3;

public class PolindromeorNot {

	public static void main(String[] args) {
		
		
		int num,r,rev=0;
		int value;
		num =515;
		value =num;
		
		while(num>0)
		{
			r= num %10;
			rev = rev*10+r;
			num = num/10;
		}
		System.out.println("reverse is:" +rev);
		
		if(rev == value)
			System.out.println("number is polindrome");
		else
			System.out.println("number is not apolindrome");
		}
	}

