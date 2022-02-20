//Every letter in the input has been shifted two places forward as specified in the input.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter a sentence: ");
	    String plaintext=sc.nextLine();
	    int shift=2;
	    char alphabet;
	    for(int i=0; i<plaintext.length(); i++)
	    {
	        alphabet=plaintext.charAt(i);
	        if (alphabet>='a' && alphabet<='z'){
	            alphabet=(char)(alphabet+shift);
	            if (alphabet>'z'){
	                alphabet=(char)(alphabet+'a'-'z'-1);
	                
	            }
	            System.out.print(alphabet);
	        }
	    }
		
	}
}
