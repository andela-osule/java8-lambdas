package lambdas;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ExplicitPFA {
	//Explicit partial function application
	
	public static void main(String[] args) {
		BiFunction<String, String, String> concat = (a, b) -> a + b;
		greetFolks(appyPartial(concat, "Hello, "));
	}

	public static <T, U, V> Function<U, V> appyPartial(
			BiFunction<T, U, V> bif, T firstArgument
			) {
		
		return u -> bif.apply(firstArgument, u);
	}
	
	public static void greetFolks(Function<String, String> greeter) {
		for(String name: Arrays.asList("Alice", "Bob", "Cathy")) {
			System.out.println(greeter.apply(name));
		}
	}

}
