package just_1;

public class Arrr {

	public static void main(String[] args) {
		String input="Hotel HHH";
		char search = 'H';  //Character to search 'H'.
		
		int count=0;
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) == search)
			count++;
		}
		System.out.println("The Character '"+search+"' appears "+count+" times.");
		
		

	}


}
