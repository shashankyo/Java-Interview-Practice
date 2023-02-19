package dupliacteinArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateDemo {
public static void main(String[] args) {
	String [] duplicate = new String[] {"java","pracle","python","ajava"};
	List duplicateList = Arrays.asList(duplicate);
	Set duplicateSet = new HashSet<>(duplicateList);
	if(duplicateList.size() != duplicateSet.size())
	{
		System.out.println("THe array contains duplicates");
	}
	else
	{
		System.out.println("The array does not contains duplicates");
	}
	
}

}
