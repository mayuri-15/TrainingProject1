package jUnit;

public class CheckArray {
	public String[] getArray(String s1[],String s2[])
	{
		int count=0;
		String[] s3=new String[3];
		int n=s1.length;
		int k=s2.length;
		if(n==k)
		{
			for(int i=0;i<=n-1;i++)
			{
				count=0;
				if(s1[i]==s2[i])
				{
					count++;
				}
				if(count==1)
				{
					s3[i]=s1[i];
				}
			}
		}
		
		
		return s3;
	}

}
