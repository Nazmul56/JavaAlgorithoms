import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Short1 {
public static void main(String[] args)
{
	String[] suits = {"Hearts", "Dimonds", "Clubs","Spades"};
	List<String> list = Arrays.asList(suits);
	System.out.printf("Unshorted array elements : %s\n", list);
	Collections.sort(list);
	System.out.printf("Shorted array elements: %s", list);
}
}
