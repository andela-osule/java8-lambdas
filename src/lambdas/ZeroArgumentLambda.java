package lambdas;

import java.util.function.Supplier;

public class ZeroArgumentLambda {
	// Also known as suppliers take no arguments and always return a value
	public static void main(String[] args) {
		Supplier<Number> function = () -> 1;
		Supplier<Number> f = function;
		System.out.println(f.get());
	}

}
