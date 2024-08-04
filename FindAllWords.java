package Demo;
import java.util.*;

public class FindAllWords 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input:");
			String s = sc.nextLine();
			String[] s2 = s.split(" ");
			System.out.println("Output:"+Arrays.toString(s2));
		}
	}
}
