import java.util.*;
public class Prime_number{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		int i;
		boolean flag=true;
		for(i=2;i<Math.sqrt(number);i++){
		    if(number%i==0){
            	    	flag=false;
		    }
		
		}
		if(flag==true){
		    System.out.println("The number is prime");
		}
		else{
		     System.out.println("The number is not prime");
		}
		
}
}
