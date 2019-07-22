package jUnit;

public class CheckStrings {
	public boolean isEqual(String s1,String s2)
	{
		if(s1.equalsIgnoreCase(s2))
			return true;
		else
			return false;
	}
	public String checkNull(String str)
	{
		if(str !=null)
		{
          String k= "String is Not Null";
          return k;
		}
		else
		{
			return null;
		}
	}
	public String reverseString(String str1)
	{
		StringBuilder sb=new StringBuilder(str1);
		String f=sb.reverse().toString();
		return f;
	}

}
