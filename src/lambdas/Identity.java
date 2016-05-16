package lambdas;

import java.util.function.Function;

public class Identity {
	public static void main(String[] args) {
		
	}
	
	public static <V> Function<V, V> identityFunction() {
		return value -> value;
	}
	// As an anonymous inner class because Function is an interface
	public static <V> Function<V, V> identityFunctionAIC() {
		return new Function<V, V>() {
			@Override
			public V apply(V value) {
				return value;
			}
		};
	}
}
