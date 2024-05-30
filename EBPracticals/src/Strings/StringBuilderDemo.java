package Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println(sb);
		//System.out.println(sb.hashCode());
		
		//Method append
		sb.insert(6, "test");
		System.out.println(sb);
		
		//Method reverse
		sb.reverse();
		System.out.println(sb);
		
		// Method length
		int size = sb.length();
		System.out.println(size);
		
		// 
	}

}
