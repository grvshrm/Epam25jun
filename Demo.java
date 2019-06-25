package proj1;

public class Demo 
{
	public String dropA(String s)
	{
		int stln = s.length();
		if(stln == 0)
			return s;
		if(stln == 1)
		{
			if(s.charAt(0) == 'A')
			{
				return "";
			}
			else
			{
				return s;
			}
		}
			 
        if(stln >= 2)
        {
        	if(s.charAt(0) == 'A' && s.charAt(1) == 'A')
    			return s.substring(2,stln);
    		if(s.charAt(0) == 'A' && s.charAt(1) != 'A')
    			return s.substring(1,stln);
    		if(s.charAt(0) != 'A' && s.charAt(1) == 'A')
    			return s.charAt(0) + s.substring(2,stln);
        }
		return s;
	}
}