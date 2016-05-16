package lambdas;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class MethodToLambda {

	public static void main(String[] args) {
		IntFunction<String> intToString = Integer::toString;
		ToIntFunction<String> parseInt = Integer::valueOf;
		System.out.println(intToString.apply(20));
		System.out.println(parseInt.applyAsInt("20"));
	}

}
