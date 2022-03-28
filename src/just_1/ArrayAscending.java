package just_1;

import java.util.Arrays;

public class ArrayAscending {

	public static void main(String[] args) {
		
		int a[]= {2,7,6,10,14,18,22};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int h=a[i];
					a[i]=a[j];
					a[j]=h;
				}
			}
		}
System.out.println(Arrays.toString(a));
	}


}
