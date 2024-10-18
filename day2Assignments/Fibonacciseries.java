package week1.day2Assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int limit=8;
		int sum=0;

		
		for (int i=1; i<=limit; ++i)
		{ 
			System.out.print(" "+sum);
			
			a=b;
			b=sum;
			sum= a+b;
			
			}
			
	}

}
