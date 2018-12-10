package jp.scriptkidie.shape.triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.SideList;

public class EquilateralTriangleTest {

	EquilateralTriangle actual;

	@Before
	public void setUp() throws Exception {
		actual = new EquilateralTriangle(new SideList("15"));
	}

	/**
	 * <li>事前条件：１辺長：１５
	 * <li>事後条件：周辺長：４５
	 */
	@Test
	public void testPerimeter() {
		assertThat(actual.perimeter(), is(Num.of(45.0)));
	}

	/**
	 * <li>事前条件：高さ設定あり
	 * <li>事後条件：高さ：１２
	 */
	@Test
	public void testHeight() {
		actual.setHeight(Num.of(12.0));
		assertThat(actual.height(), is(Num.of(12.0)));
	}

	/**
	 * <li>事前条件：高さ設定なし
	 * <li>事後条件：算術例外
	 */
	@Test(expected = ArithmeticException.class)
	public void testHeight_withoutsetting() {
		actual.height();
	}

}
