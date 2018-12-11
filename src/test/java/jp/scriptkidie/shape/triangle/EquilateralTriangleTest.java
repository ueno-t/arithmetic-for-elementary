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
		actual = new EquilateralTriangle(new SideList("15.0"));
	}

	/**
	 * <li>事前条件：1辺長の設定あり
	 * <li>事後条件：周辺長が1辺長 × 3 であること
	 */
	@Test
	public void testPerimeter() {
		assertThat(actual.perimeter(), is(Num.of(45.0)));
	}

	/**
	 * <li>事前条件：底辺設定なし
	 * <li>事後条件：1辺長が底辺として取得できること
	 */
	@Test
	public void testBottom() {
		assertThat(actual.bottom().get(), is(Num.of(15.0)));
	}

	/**
	 * <li>事前条件：高さ設定あり
	 * <li>事後条件：設定された高さが取得できること
	 */
	@Test
	public void testHeight() {
		actual.setHeight(Num.of(12.0));
		assertThat(actual.height().get(), is(Num.of(12.0)));
	}

	/**
	 * <li>事前条件：与えられた辺が1未満
	 * <li>事後条件：算術例外
	 */
	@Test(expected = ArithmeticException.class)
	public void testConstructor() {
		actual = new EquilateralTriangle(new SideList());
	}

}
