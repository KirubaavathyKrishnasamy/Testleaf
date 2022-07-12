package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] duplicate = {1, 2, 3, 4, 1, 6, 2,7};
Arrays.sort(duplicate);
for(int i =0; i<duplicate.length; i++) {
	for(int j=i+1; j<duplicate.length; j++) {
		if(duplicate[i]==duplicate[j]) {
			System.out.println(duplicate[i]);
		}
	}
}
}
}