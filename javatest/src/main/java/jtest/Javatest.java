package jtest;

public class Javatest {
	public String testcode(String source_string,int str_len)
	{
		String s="";
		char[] string = new char[str_len];
		string=source_string.toCharArray();
		int n=2;
		if (string[0]!='A')
			{
				s+=string[0];
			}
		if (string[1]!='A')
		{
			s+=string[1];
		}
		while(n<str_len)
		{
			s+=string[n];
			n+=1;
		}
		return s;
	}

}
