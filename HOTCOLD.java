/* package codechef; // don't place package name! */

// https://www.codechef.com/problems/HOTCOLD
// question link ^^^

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int c = s.nextInt();
		    String res = c<=20 ? "COLD" : "HOT" ;
		    System.out.println(res);
		}
	}
}
