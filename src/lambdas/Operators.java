package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Operators {
	public static void main(String[] args) {
		UnaryOperator<String> upperCase =  str -> str.toUpperCase();
		BinaryOperator<String> concat = (left, right) -> left + right;
		System.out.println(upperCase.apply("hello"));
		System.out.println(concat.apply("Hello, ", "world!"));
	}
}
