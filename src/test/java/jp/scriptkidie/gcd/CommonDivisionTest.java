package jp.scriptkidie.gcd;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import org.junit.Test;

public class CommonDivisionTest {

	/**
	 * <li>事前条件：公約可能な整数（≠0）が3つ与えられる
	 * <li>事後条件：最大公約数が求められること
	 */
	@Test
	public void testGCD() {
		CommonDivision tuple = new CommonDivision(Arrays.asList(12,30,24), Mode.GCD);
		assertThat(tuple.getGCD(),is(6));
	}
	/**
	 * <li>事前条件：公倍可能な整数（≠0）が3つ与えられる
	 * <li>事後条件：最小公倍数が求められること
	 */
	@Test
	public void testLCM() {
		CommonDivision tuple = new CommonDivision(Arrays.asList(12,30,24), Mode.LCM);
		assertThat(tuple.getLCM(),is(120));
	}
	/**
	 * <li>事前条件：約可能な整数（≠0）が3つ与えられる
	 * <li>事後条件：最小の約数が求められること
	 */
	@Test
	public void testPrimeFactory() {
		CommonDivision tuple = new CommonDivision(Arrays.asList(12,30,24), Mode.GCD);
		assertThat(tuple.primeFactory(Arrays.asList(12,30,24)),is(2));
	}
	/**
	 * <li>事前条件：約数と、約することが可能/不可能な整数（≠0）が与えられる
	 * <li>事後条件：可能な整数のみ約した結果が求められること
	 */
	@Test
	public void testDivide() {
		assertThat(map(CommonDivision.divide(6), Arrays.asList(12,11,24)), is(Arrays.asList(2,11,4)));
	}

	private List<Integer> map(UnaryOperator<Integer> op, List<Integer> intList) {
		return intList.stream().map(op).collect(Collectors.toList());
	}
}
