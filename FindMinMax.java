package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] find = {2, 8, -1, 4,0};

Arrays.sort(find);
System.out.println("The min Value" +find[0]);
System.out.println("The Max value" +find[find.length-1]);


	}

}
