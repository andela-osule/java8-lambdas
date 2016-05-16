package lambdas;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class InstanceMethodToLambda {

	public static void main(String[] args) {
		Consumer<String> print = System.out::println;
		
		print.accept("Hello, world!");
		
		UnaryOperator<String> makeGreeting = "Hello, "::concat;
		print.accept(makeGreeting.apply("world!"));
		
		IntFunction<String> lookup = Arrays.asList("a", "b", "c")::get;
		print.accept(lookup.apply(1));
		
		IntSupplier randomInt = new Random()::nextInt;
		print.accept(Integer.valueOf(randomInt.getAsInt()).toString());
		
		
		Path base = Paths.get(".");
		Function<String, Path> resolvePath = base::resolve;
		
		InstanceMethodToLambda imtl = new InstanceMethodToLambda();
		System.out.println(imtl.compareAgainst(20).applyAsInt(30));
		
	}
	
	public InstanceMethodToLambda() {
		
	}

	public IntUnaryOperator compareAgainst(Integer compareLeft) {
		return compareLeft::compareTo;
	}

}
