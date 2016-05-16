package lambdas;
import java.util.function.BiFunction;

public class MultiArgumentLambda {
	// Multiple arguments beyond two can be achieved by using
	// Lambdas as interface implementations / Streams / Currying
	
	public static void main(String[] args) {
		BiFunction<String, String, String> concat = (a, b) -> a + b;
		
		System.out.println(concat.apply("Hello ", "World!"));
	}
	
}
