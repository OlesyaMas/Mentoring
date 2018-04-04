import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		String input = null;
		Scanner in;
		double num = 0;
		
		double resultMemory = 0;
		double resultLine = 0;
		System.out.println("Input number or operator and press Enter.");
		System.out.println("To calculate result enter '=' ");
		System.out.println("You can use m+, m-, mr to work with memory.");
		do {
			in = new Scanner(System.in);
			input = in.next();
			
			//TODO add !isExit()
			if(!Operations.isOperator(input) && !Operations.isMem(input) && !Operations.isOperatorResult(input) && !Operations.isExit(input)){
				num = Double.parseDouble(input);
				resultLine = num;
			}else{
				if(Operations.isOperator(input)){
					Processor.reset();
					Processor.operation = Operations.getCodeOperation(input);
					Processor.num1 = num;					
					input = in.next();
					Processor.num2 = Double.parseDouble(input);
				}

				if(Operations.getCodeOperation(input) == Operations.RESULT){
					resultLine = Processor.calculate();
					System.out.println("RESULT = " + resultLine);
				} 
				
				//TODO +,-
				if(Operations.isMem(input)){
			        Processor memory = new Processor();
			        resultMemory = memory.putToMemo(input, resultLine, resultMemory);
            		System.out.println("MEMORY VALUE = " + resultMemory);
				}
				
			}
			
		} while (!Operations.isExit(input));
		
		in.close();
		
		System.out.println("Bye");
	}
}
