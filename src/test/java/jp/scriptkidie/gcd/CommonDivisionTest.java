package jp.scriptkidie.gcd;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import org.junit.Test;

public class CommonDivisionTest {

	@Test
	public void testGCD() {
		CommonDivision tuple = new CommonDivision(Arrays.asList(12,30,24), Mode.GCD);
		assertThat(tuple.getGCD(),is(6));
	}
	@Test
	public void testLCM() {
		CommonDivision tuple = new CommonDivision(Arrays.asList(12,30,24), Mode.LCM);
		assertThat(tuple.getLCM(),is(120));
	}
	@Test
	public void testPrimeFactory() {
		CommonDivision tuple = new CommonDivision(Arrays.asList(12,30,24), Mode.GCD);
		assertThat(tuple.primeFactory(Arrays.asList(12,30,24)),is(2));
	}
	@Test
	public void testDivide() {
		assertThat(map(CommonDivision.divide(6), Arrays.asList(12,11,24)), is(Arrays.asList(2,11,4)));
	}

	private List<Integer> map(UnaryOperator<Integer> op, List<Integer> intList) {
		return intList.stream().map(op).collect(Collectors.toList());
	}
}
