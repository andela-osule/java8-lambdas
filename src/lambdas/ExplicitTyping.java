package lambdas;

import java.util.function.Function;

public class ExplicitTyping {

	public static void main(String[] args) {
		transform(args[0], (String str) -> str.toUpperCase());
	}

	public static String transform(
		String str,
		Function<String, String> transformer
	) {
		return transformer.apply(str);
	}

	public static CharSequence transform(
		CharSequence str,
		Function<CharSequence, CharSequence> transformer
	) {
		return transformer.apply(str);
	}
}
