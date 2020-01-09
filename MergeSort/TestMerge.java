import java.util.ArrayList;
import java.lang.Comparable;

public class TestMerge
{
	
	public static void main(String[] args)
	{
		ArrayList<String> test = new ArrayList<>();
		test.add("D");
		test.add("A");
		test.add("C");
		test.add("B");

		MergeSort.mergeSort(test);
		System.out.println(test);
	}
}