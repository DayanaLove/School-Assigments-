import java.util.Scanner;
public class Calculator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ICalculator2 iCalc = new ICalculator2();

		
int y=1;


while (y==1) {
try {	 
	
System.out.println("Enter your Operation: +, -, *, /, Stop or negate");
String operation = input.next();


if(!operation.contains("t")) { 
System.out.println("Enter your number");
String userInputNum = input.next();
int calcinput = Integer.parseInt(userInputNum);
iCalc.setUserInputB(calcinput);
}

	 switch(operation){
		
		case "+":System.out.println(iCalc.add()); 
		break;
		case "-": System.out.println(iCalc.sub());
		break;
		case "*": System.out.println(iCalc.mutiply());
		break;
		case "/": System.out.println(iCalc.Divide());
		break;
		case "stop": y=0; 
		break;
		case "negate": System.out.println(iCalc.negate());
		break;
	}
	
	
} catch(Exception InvalidInputException) {
	iCalc.validateInput();
	
}
	



}

System.out.println("Calculator stopped");


	}

	
}


//String operation = userInput.substring(0,1);
//String userinput = userInput.substring(1,userInput.length());
	

