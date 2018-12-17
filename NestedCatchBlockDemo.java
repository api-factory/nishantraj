package Assignment;

/**
 * @author IMGADMIN
 *
 */
public class NestedCatchBlockDemo {
/**
 * @param args
 */
public static void main(String [] args){
		
	
		// nested catch block
		int i =5;
		int j=0;
		try{	
			System.out.println("in try " + i/j);
		}catch(Exception e){
			j=1;
			try{
				System.out.println("in catch " + i/j);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
		// End
		
		
		
}		
}
