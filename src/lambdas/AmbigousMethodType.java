package lambdas;

import java.util.function.Function;
import java.util.function.IntFunction;

public class AmbigousMethodType {
	public static void main(String[] args) {
		// Will throw an exception
		methodBeingCalled(i -> Integer.toString(i));
		
		// Will not
		methodBeingCalled((int i) -> Integer.toString(i));
	}
	
	static void methodBeingCalled(Function<Integer, String> function) {}
	
	static void methodBeingCalled(IntFunction<String> function) {}
}
