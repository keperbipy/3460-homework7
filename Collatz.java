
import java.util.Scanner;

public class Collatz {
	public static long a;
	public static long b;
	public static long count = 0;
	public static  long maxNum;
	public static long maxLength;
	
	public static void collatzDriver(long _a, long _b) {
		
		for (long i = _a; i <= _b; i++) {
			count = 0;
			collatzLength(i);
			if (count > maxLength){
				maxLength = count;
				maxNum = i;
			}
		}
		print();
	}
	
	public  static void collatzLength(long n) {
		
		long result = n;
		 
		if (result == 1) {
			count++;
			return;
		}
		else if (result%2 == 0) {
			count++;
			collatzLength(result/2);
		}
		else if (result%2 == 1) {
			count++;
			collatzLength((3*result)+1);
		}
		else {
			return;
		}
		
	}
	
	public static void print() {
		System.out.println("The number with the maximum Collatz length in the range: " + maxNum);
		System.out.println("Its Collatz length: " + maxLength );
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the range: ");
		a = kb.nextLong();
		b = kb.nextLong();
	
        collatzDriver(a,b);
    }

}




