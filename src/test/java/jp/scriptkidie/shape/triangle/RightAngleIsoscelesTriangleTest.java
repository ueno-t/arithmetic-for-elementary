package jp.scriptkidie.shape.triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jp.scriptkidie.number.Num;

public class RightAngleIsoscelesTriangleTest {

	RightAngleIsoscelesTriangle actual;

	@Before
	public void setUp() {
		actual = new RightAngleIsoscelesTriangle(null);
	}

	/**
	 * <li>事前条件：底辺と高さが設定されている
	 * <li>事後条件；底辺と高さから面積を求めていること
	 */
	@Test
	public void testArea_withBottomHeight() {
		actual.setBottom(6);
		actual.setHeight(4);;
		assertThat(actual.area(), is(Num.of(12)));
	}

	/**
	 * <li>事前条件：底辺以外の辺が設定されている
	 * <li>事後条件；底辺以外の辺から面積を求めていること
	 */
	@Test
	public void testArea_withOther() {
		actual.setOther(4);
		assertThat(actual.area(), is(Num.of(8)));
	}

	/**
	 * <li>事前条件：底辺が設定されている
	 * <li>事後条件；底辺から面積を求めていること
	 */
	@Test
	public void testArea_withBottom() {
		actual.setBottom(6);
		assertThat(actual.area(), is(Num.of(9)));
	}

	/**
	 * <li>事前条件：辺が設定されていない
	 * <li>事後条件；算術例外
	 */
	@Test(expected = ArithmeticException.class)
	public void testArea_withoutAny() {
		actual.area();
	}
}
