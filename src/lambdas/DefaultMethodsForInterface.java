package lambdas;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface DefaultMethodsForInterface<E> extends Iterator<E> {
	Optional<E> nextElement(boolean consume);
	
	@Override
	default boolean hasNext() {
		return nextElement(false).isPresent();
	}
	
	@Override
	default E next() {
		return nextElement(true).orElseThrow(
			() -> new NoSuchElementException("Iterator is exhausted")
		);
	}
}
