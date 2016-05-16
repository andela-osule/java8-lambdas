package lambdas;

import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		Predicate<String> notNullOrEmpty = s -> s != null && s.length() > 0;
		System.out.println(notNullOrEmpty.test(""));
		System.out.println(notNullOrEmpty.test("Hello, world!"));
	}
}
