package jp.scriptkidie.shape.triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.SideList;
import jp.scriptkidie.shape.triangle.impl.AbstractTriangle;

public class TriangleTest {

	ConcreatTriangle actual;

	@Before
	public void setup() {
		actual = new ConcreatTriangle(new SideList("1","2","3"));
	}

	/**
	 * <li>事前条件：3辺が設定されている
	 * <li>事後条件：3辺から周辺長を求めていること
	 */
	@Test
	public void testPerimeter() {
		assertThat(actual.perimeter(), is(Num.of(6.0)));
	}

	/**
	 * <li>事前条件：底辺と高さが設定されている
	 * <li>事後条件：底辺と高さから面積を求めていること
	 */
	@Test
	public void testArea() {
		actual.setBottom(6);
		actual.setHeight(4);
		assertThat(actual.area(), is(Num.of(12.0)));
	}

	/**
	 * <li>事前条件：底辺が設定されていない
	 * <li>事後条件：算術例外
	 */
	@Test(expected = ArithmeticException.class)
	public void testArea_withoutBottom() {
		actual.setHeight(4);
		actual.area();
	}

	/**
	 * <li>事前条件：高さが設定されていない
	 * <li>事後条件：算術例外
	 */
	@Test(expected = ArithmeticException.class)
	public void testArea_withoutHeight() {
		actual.setBottom(6);
		actual.area();
	}

	class ConcreatTriangle extends AbstractTriangle implements Triangle {
		ConcreatTriangle(SideList sides) { super.sides = sides; }
	}
}
