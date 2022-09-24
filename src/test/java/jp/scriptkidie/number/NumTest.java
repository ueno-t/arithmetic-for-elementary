package jp.scriptkidie.number;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NumTest {

	Num actual;

	@Before
	public void setUp() throws Exception {
		actual = new Num("3");
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身のinteger表現を返すこと
	 */
	@Test
	public void testIntValue() {
		assertThat(actual.intValue(),is(3));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身のlong表現を返すこと
	 */
	@Test
	public void testLongValue() {
		assertThat(actual.longValue(),is(3l));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身のfloat表現を返すこと
	 */
	@Test
	public void testFloatValue() {
		assertThat(actual.floatValue(),is(3f));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身のdouble表現を返すこと
	 */
	@Test
	public void testDoubleValue() {
		assertThat(actual.doubleValue(),is(3.0));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身と加算数の和を返すこと
	 */
	@Test
	public void testAdd() {
		assertThat(actual.add(2),is(Num.of(5.0)));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身と減算数の差を返すこと
	 */
	@Test
	public void testSub() {
		assertThat(actual.sub(2),is(Num.of(1.0)));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身と乗数の積を返すこと
	 */
	@Test
	public void testMul() {
		assertThat(actual.mul(2),is(Num.of(6.0)));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身と除数の商を返すこと
	 */
	@Test
	public void testDiv() {
		assertThat(actual.div(2),is(Num.of(1.5)));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身を底としたべき指数のべき乗を返すこと
	 */
	@Test
	public void testPow() {
		assertThat(actual.pow(2),is(Num.of(9.0)));
	}

	/**
	 * <li>事前条件：値が設定されている
	 * <li>事後条件：自分自身の文字列表現を返すこと
	 */
	@Test
	public void testToString() {
		assertThat(actual.toString(), is("3"));
	}
}
