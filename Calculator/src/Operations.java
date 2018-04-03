import java.util.ArrayList;

public enum Operations {
	PLUS("+"),
	MINUS("-"),
	DIVISION(":"),
	MULTIPLY("*"),
	MPLUS("m+"),
	MMINUS("m-"),
	MREAD("mr"),
	RESULT("="),
	EXIT("q"),
	UNKNOWN("Unknown");

	private static ArrayList<String> listOperators = new ArrayList<String>();
	private static ArrayList<String> listMem = new ArrayList<String>();
	static {
		listOperators.add(MINUS.getOperation());
		listOperators.add(PLUS.getOperation());
		listOperators.add(DIVISION.getOperation());
		listOperators.add(MULTIPLY.getOperation());

		
		listMem.add(MPLUS.getOperation());
		listMem.add(MREAD.getOperation());
		listMem.add(MMINUS.getOperation());
	}
	
	private String operation;

	private Operations(String operation) {
		this.operation = operation;
	}

	public String getOperation() {
		return operation;
	}

	public static Operations getCodeOperation(String operation) {
		if(operation.equals("+")){
			return Operations.PLUS; 
		}else if(operation.equals("-")){
			return Operations.MINUS;
		}else if(operation.equals(":")){
			return Operations.DIVISION;
		}else if(operation.equals("*")){
			return Operations.MULTIPLY;
		}else if(operation.equals("=")){
			return Operations.RESULT;
		}
		return UNKNOWN;
	}
	
	public static Operations getMemOperation(String operation) {
		if(operation.equals("m+")){
			return Operations.MPLUS; 
		}else if(operation.equals("m-")){
			return Operations.MMINUS;
		}else if(operation.equals("mr")){
			return Operations.MREAD;
		}
		return UNKNOWN;
	}
	
	
	public static boolean isOperator(String operator){
		return listOperators.contains(operator);
	}
	
	public static boolean isMem(String mem){
		return listMem.contains(mem);
	}

	public static boolean isOperatorResult(String operator){
		return getCodeOperation(operator).equals(RESULT);
	}

	//TODO isExit
}
