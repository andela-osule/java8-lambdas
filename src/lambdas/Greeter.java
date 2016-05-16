package lambdas;
import java.util.function.Function;

public class Greeter {
	public static void main(String[] args) {
		String greeting = "Hello, ";
		Function<String, String> greeter = whom -> greeting + whom + "!";
		greetWorld(greeter);
	}
	
	public static void greetWorld(Function<String, String> greeter) {
		System.out.println(greeter.apply("World"));
	}

}
