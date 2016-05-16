package lambdas;

import java.beans.ExceptionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;

public class AsInterface {

	public static void main(String[] args) {
		
		// Create concurrent interfaces from lambdas
		Runnable runMe = () -> System.out.println("Ran!");
		Callable<Long> callMe = System::currentTimeMillis;
		ThreadFactory t = Thread::new;
		
		// Implement listener interfaces
		ExceptionListener listener = Exception::printStackTrace;
		
	}
	
	// Can use lambda in-place of interfaces having single abstract method.
	public static AutoCloseable autoCommit(Connection c) throws SQLException {
		if (c == null) return () -> {};
		return c::commit;
	}

}
