package just_1;

public class SmallestNumber {

	public static void main(String[] args) {
		int a[]= {10,25,36,3,5,2,4};
		int smallnumber=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(smallnumber>a[i])
			{
				smallnumber = a[i];
			}
		}
System.out.println("small number : " + smallnumber);
	} 

}
