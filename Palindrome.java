package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "level";
		boolean isPalindrome = true;
				char[] ch1= str1.toCharArray();
		for(int i = ch1.length-1; i>=0; i--)			
		{
			if(ch1[i]==str1.charAt(i))
				isPalindrome = true;
			System.out.println(isPalindrome +"The given word is Palindrome");
			break;
					
		}
		System.out.println(isPalindrome +"The given word is not Palindrome");
			

	}

}
