import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int c = 0; c < cases; c++){
		    int l = scan.nextInt();
		    int p = scan.nextInt();
		    
		    if(l % p == 0){
		        System.out.println(0);
		    }
		    else{
		        System.out.println(1);
		    }
		}

	}
}
