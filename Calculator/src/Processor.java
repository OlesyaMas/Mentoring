
public class Processor {
	static double num1 = 0;
	static double num2 = 0;
	static Operations operation = Operations.UNKNOWN;
	
	
	public static double calculate() {
        switch (operation) {
            case PLUS:
                return num1 + num2;
            case MINUS:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVISION:
                return num1 / num2;
            default:
                throw new AssertionError("Unknown operations " + operation);
        }
    }
	
	public double putToMemo(String input, double resultLine, double resultMemory) {	
		switch (Operations.getMemOperation(input)) {
	    case MPLUS:
	    	resultMemory = resultMemory + resultLine;
	    	break;
	    case MMINUS:
	    	resultMemory = resultMemory - resultLine;
	    	break;
	    } 
		return resultMemory;
	}
	
	public static void reset() {
		num1 = 0;
		num2 = 0;
		operation = Operations.UNKNOWN;
	}
	
}
