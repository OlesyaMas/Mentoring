import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		String input = null;
		Scanner in;
		double num = 0;
		
		double resultMemory = 0;
		double resultLine = 0;
		
		do {
			in = new Scanner(System.in);
			input = in.next();
			
			//System.out.println("INPUT = " + input);
			
			//TODO add !isExit()
			if(!Operations.isOperator(input) && !Operations.isMem(input) && !Operations.isOperatorResult(input)){
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
			        switch (Operations.getMemOperation(input)) {
			            case MPLUS:
			            	resultMemory = resultMemory + resultLine;
			            	break;
			            case MMINUS:
			            	resultMemory = resultMemory - resultLine;
			            	break;
			        }
            		System.out.println("MEMORY READ = " + resultMemory);
				}
			}
			
		} while (!input.equals(Operations.EXIT.getOperation()));
		
		in.close();
		
		System.out.println("Bye");
	}
	

}
