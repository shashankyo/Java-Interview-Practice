package rotationofString;

public class RotateStringDemo {
public static void main(String[] args) {
	System.out.println(isRotateVersion("abcd","bcda"));

}
public static boolean isRotateVersion(String str, String rotateString)
{
	boolean isRotated = false;
	if(str == null || rotateString == null)
	{
		return false;
	}
	else if(str.length()!= rotateString.length())
	{
		return false;
	}
	else
	{
		String x = str + str;
		System.out.println(x);
		return x.contains(rotateString);
	}
}
}
