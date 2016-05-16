package anonymousklass;

public interface Greeter {
	String createGreeting(String whom);
}

public class Greet {

	public static void main(String[] args) {
		final String greeting = "Hello, "; // declared final
		Greeter greeter = new Greeter() {
			@Override
			public String createGreeting(String whom) {
				// Close (ie: capture) the variable here
				return greeting + whom + "!";
			}
		};
		greetWorld(greeter);
	}
	
	public static void greetWorld(Greeter greeter) {
		System.out.println(greeter.createGreeting("World"));
	}

}
