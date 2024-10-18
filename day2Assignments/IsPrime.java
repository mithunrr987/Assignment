package week1.day2Assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var= 13;
		int temp=0;
		
		if (var<=1)
			System.out.println("The Number "+ var +" is not a prime");
		else {
			
			for (int i = 1; i <= var; i++ ) {
				if (var%i==0)
					temp++;		
				
			}
			if (temp>2)
				System.out.println("The Number "+ var +" is not a prime");
			else 
				System.out.println("The Number "+ var +" is a prime");
				
		}
	}

}
