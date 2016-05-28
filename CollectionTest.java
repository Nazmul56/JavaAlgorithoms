import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class CollectionTest {
	public static void main(String[] args){
		String[] colors = {"MEGENTA","RED","WHITE","BLUE","CYNA"};
		List<String> list = new ArrayList<String>();
		
		for(String color :colors)
			list.add(color);
		
		String[] removeColors = {"RED", "WHITE","BLUE"};
		List<String>removeList = new ArrayList<String>();
		
		for(String color :removeColors)
		{
			removeList.add(color);
			
		}
		//Output list content
		System.out.println("ArrayList: ");
		
		for(int count = 0 ; count <list.size(); count++)
			System.out.printf("%s ",list.get(count));
		
		removeColors(list,removeList);
		
		//Output list components
		System.out.println("\n\nArrayList after calling removeColors: ");
		
		for(String color : list)
			System.out.printf("%s ", color);
		
	}
	//Color remove method
	private static void removeColors(Collection<String> collection1, Collection<String> collection2)
	{
		Iterator<String> iterator = collection1.iterator();
		
		while(iterator.hasNext())
		{
			if(collection2.contains(iterator.next()))
				iterator.remove();
		}
		
	}
	

}
