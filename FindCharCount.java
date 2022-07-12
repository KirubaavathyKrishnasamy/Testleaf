package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "Kiruba";
char c = 'u';
int count =0;
char[] charArray = name.toCharArray();
for (int i=0;i<charArray.length-1; i++)
{
	if(charArray[i]==c)
		count++;
	
}
System.out.println(count);
	}

}
