package jp.scriptkidie.gcd;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class GcdTest {

	@Test
	public void testDivisionAlgorythm() {
		List<Integer> intList = Arrays.asList(42,30);
		assertThat(Gcd.divisionAlgorithm(intList),is(6));
		intList = Arrays.asList(33,77);
		assertThat(Gcd.divisionAlgorithm(intList),is(11));
		intList = Arrays.asList(12,30,15);
		assertThat(Gcd.divisionAlgorithm(intList),is(3));
		intList = Arrays.asList(72,108);
		assertThat(Gcd.divisionAlgorithm(intList),is(36));
	}
	@Test
	public void testIsPledge() {
		List<Integer> intList = Arrays.asList(42,30);
		assertThat(Gcd.isPledge(intList, 2), is(true));
		assertThat(Gcd.isPledge(intList, 5), is(false));
	}
	@Test
	public void testMulipleResult() {
		List<Integer> resultList = Arrays.asList(2,2,3);
		assertThat(Gcd.mulipleResult(resultList),is(12));
	}
	@Test
	public void testDivideByPrime() {
		List<Integer> intList = Arrays.asList(42,30);
		assertThat(Gcd.divideByPrime(intList, 2),is(Arrays.asList(21,15)));
	}
}
