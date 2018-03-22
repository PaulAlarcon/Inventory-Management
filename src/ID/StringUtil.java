package ID;

public class StringUtil
{
	public static String pad(String s, int length)
	{
		if(s.length() < length)
		{
			//Append spaces until the string is the specified length
			StringBuilder sb = new StringBuilder(s);
			while(sb.length() < length)
			{
				sb.append(' ');
			}
			return sb.toString();
		}
		else
		{
			//Truncate the string to the specified length
			return s.substring(0,length);
		}
	}
}
