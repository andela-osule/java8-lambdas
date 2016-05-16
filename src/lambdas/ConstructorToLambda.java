package lambdas;

import java.math.BigInteger;
import java.util.function.Function;

public class ConstructorToLambda {

	public static void main(String[] args) {
		Function<String, BigInteger> newBigInt = BigInteger::new;
		
		System.out.println(newBigInt.apply("2000"));
	}

}
