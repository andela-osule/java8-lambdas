package lambdas;

import java.util.Random;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongToIntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class PrimitiveArguments {

	public static void main(String[] args) {
		IntFunction<String> intToString = i -> Integer.toString(i);
		System.out.println(intToString.apply(3000));
		
		ToIntFunction<String> parseInt = str -> Integer.valueOf(str);
		System.out.println(parseInt.applyAsInt("20"));
		
		IntPredicate isEven = i -> i % 2 == 0;
		System.out.println(isEven.test(4));
		
		ToIntBiFunction<String, String> maxLength = (left, right) ->
			Math.max(left.length(), right.length());
		System.out.println(maxLength.applyAsInt("yams", "goats"));
			
		IntConsumer printInt = i -> System.out.println(Integer.toString(i));
		printInt.accept(20);
		
		
		ObjIntConsumer<String> printParsedIntWithRadix = (str, radix) ->
			System.out.println(Integer.parseInt(str, radix));
		printParsedIntWithRadix.accept("10", 2);
			
		IntSupplier randomInt = () -> new Random().nextInt();
		System.out.println(randomInt.getAsInt());
		
		IntUnaryOperator negateInt = i -> -1 * i;
		System.out.println(negateInt.applyAsInt(20));
		
		IntBinaryOperator multiplyInt = (x, y) -> x * y;
		System.out.println(multiplyInt.applyAsInt(4,5));
		
		IntToDoubleFunction intAsDouble = i -> Integer.valueOf(i).doubleValue();
		System.out.println(intAsDouble.applyAsDouble(25));
		
		DoubleToIntFunction doubleAsInt = d -> Double.valueOf(d).intValue();
		System.out.println(doubleAsInt.applyAsInt(20.50d));
		
		IntToLongFunction intAsLong = i -> Integer.valueOf(i).longValue();
		System.out.println(intAsLong.applyAsLong(20));
		
		LongToIntFunction longAsInt = x -> Long.valueOf(x).intValue();
		System.out.println(longAsInt.applyAsInt(20L));
	}

}
