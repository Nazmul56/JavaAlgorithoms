import java.util.Arrays;
import java.util.LinkedList;


public class UsingToArray {
	public static void main(String[] args){
	String[] colors = {"black","blue","yeallow"};
	LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
	links.add("red");
	links.add("pinks");
	links.add(3,"green");
	links.addFirst("cyan");
	
	//get LinkedList elements as an array
	colors = links.toArray(new String[links.size()]);
	
	System.out.println("colors: ");
	for(String color : colors)
		System.out.println(color);
	}
}
