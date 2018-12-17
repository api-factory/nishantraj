package Assignment;

/**
 * @author IMGADMIN
 *
 */
public class ShutDownHookDemo {
	/**
	 * @param args
	 */
	public static void main(String [] args){
			
		
			// Shut down hook invoke
			Runtime.getRuntime().addShutdownHook(new Thread(){
				public void run(){
					System.out.println("Shut down hook is invoking.");
				}
			});
			System.out.println("Terminated.");
			// End
			
			
			
	}		
}
