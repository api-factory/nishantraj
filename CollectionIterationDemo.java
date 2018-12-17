package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author IMGADMIN
 *
 */
public class CollectionIterationDemo {
	/**
	 * @param args
	 */
	public static void main(String [] args){
	// Iterate list using iteration
			List<String> places = new ArrayList<>();
			places.add("Mumbai");
			places.add("Pune");
			
			ListIterator<String> listIterator = places.listIterator();
			while(listIterator.hasNext()){
				System.out.println("Place: " + listIterator.next());
			}
			// End
	}		
}
