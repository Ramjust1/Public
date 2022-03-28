package just_1;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {5,10,15,20,25,30};
		System.out.println("old Array number : "+ Arrays.toString(a));

		for(int i=0; i<((a.length)/2 ); i++)
		{
			int h =a[(a.length-1)-i]; //Reverse array
			a[(a.length-1)-i]=a[i];
			a[i]=h;
		}
		System.out.println("Reverse Array : "+ Arrays.toString(a));
	}

} 
