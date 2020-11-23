
public class arrayQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Naming arrays
		
		int array1[] = {1,2,3,4,5,6,7,8,9,};
		
		int array2[] = new int [array1.length];
		
		int array3[] = new int [array1.length];
		
		// Copying array 1 on to array2 
		 for (int i=0; i<array1.length; i++) {
			 array2[i] = array1[i];
		 }
		 
			// Reversing array 1 on to array 3
		 
		 for (int i = 0, j = array1.length - 1; i < array1.length; i++, j--) {      
		        array3[i] = array1[j];  
		 }
		 
		// Printing arrays 
		 
		  for (int i=0; i<array1.length; i++) {
	            System.out.print(array1[i] + " "); 
		  }
		  
	  System.out.print("\n");
	  
		  for (int i=0; i<array1.length; i++) {
	            System.out.print(array2[i] + " "); 
		  }
		
		  
		  System.out.print("\n");
		  
			  for (int i=0; i<array1.length; i++) 
		            System.out.print(array3[i] + " "); 
		  
		
	}

}
