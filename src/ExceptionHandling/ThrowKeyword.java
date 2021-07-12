package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		/*
		 * Throw KeyWord Delibrately want to throw Exception
		 * Generate exception by your own.
		 * Not using in our framwork.
		 */
		
		System.out.println("ABC");
		
		
		  try { 
		  	
		    	throw new Exception(" Vaidehi Exception"); 
		  
		  } catch(Exception e) {
		  
		        e.printStackTrace();
		  
		  }
		  	
		System.out.println("PQR");
		
		
		
		
		String Exec_Flag = "N";
		
		if(Exec_Flag.equals("N")) {
			
			try {
				
				throw new Exception("Exec flad is blank Exception");
			
			} catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}

}
