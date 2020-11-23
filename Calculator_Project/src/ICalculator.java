public class ICalculator {

	
int userInputB;
int currentValue;



ICalculator(int currentValue, int userInputB){
	this.currentValue = currentValue; 
    this.userInputB = userInputB;
}
ICalculator(){}

// Setters and Getters 

public void setUserInputB (int userInputB){
	this.userInputB= userInputB;
	}

public void currentValue (int currentValue){
	this.currentValue= currentValue;
	}


public int getUserInput(int userInputB){
	return this.userInputB;
	}

public int getCurrentValue(int currentValue){
	return this.currentValue;
	}

	       // addition method 
	        public int add() {
              currentValue =  currentValue + userInputB; 
	        	return currentValue;
	        }
	        
	        
	        // Sub Method 
	        
	        public int sub(){
	        	 currentValue =  currentValue - userInputB; 
	        	return currentValue ;
	        }
	        
	        
	        // Multiply method 
	        
	        public int mutiply() {
	        	 currentValue =  currentValue * userInputB; 
	        	return currentValue;
	        }
	        
	        // Divide method 
	        
	        public int Divide() {
	        	 currentValue =  currentValue/userInputB; 
	        	return currentValue;
	        }
	        
	     public void validateInput(){
	    	 System.out.println("You have entered an invalid input. Please Try again." + "\n");
	    		
	     }
	        
	        
	}

// Exception Class

class ICalculator2 extends ICalculator {
	
	public int negate() {

			currentValue = currentValue*-1;
		
		
		return currentValue;
	}
}


