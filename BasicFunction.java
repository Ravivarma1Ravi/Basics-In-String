package Demo;
import java.util.*;
public class BasicFunction
{
		public static void main(String[] args) 
		{
			String s="Mahendra";
			int l=s.length();
			for (int i=0;i<l;i++)
			{
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
			char ch[]=s.toCharArray();
			for(char c:ch)
				System.out.print(c+" ");
			System.out.println();
			String s2[]=s.split("h");
			System.out.println(Arrays.toString(s2));	
		}
}
