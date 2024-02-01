package junit.nama.junit.dynamictest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class DynamicTestEx1 {

	@TestFactory
	Iterable<DynamicTest> dynamicTestsWithIterable() {
	    return Arrays.asList(
	      DynamicTest.dynamicTest("Add test",
	        () -> assertEquals(2, Math.addExact(1, 1))),
	      DynamicTest.dynamicTest("Multiply Test",
	        () -> assertEquals(4, Math.multiplyExact(2, 2))));
	}

	@TestFactory
	Iterator<DynamicTest> dynamicTestsWithIterator() {
	    return Arrays.asList(
	      DynamicTest.dynamicTest("Add test",
	        () -> assertEquals(2, Math.addExact(1, 1))),
	      DynamicTest.dynamicTest("Multiply Test",
	        () -> assertEquals(4, Math.multiplyExact(2, 2))))
	        .iterator();
	}

	@TestFactory
	Stream<DynamicTest> dynamicTestsFromIntStream() {
	    return IntStream.iterate(0, n -> n + 2).limit(10)
	      .mapToObj(n -> DynamicTest.dynamicTest("test" + n,
	        () -> assertTrue(n % 2 == 0)));
	}

}
