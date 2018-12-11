package jp.scriptkidie.shape.quadrangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.SideList;
import jp.scriptkidie.shape.quadrangle.impl.AbstarctQuadrangle;

public class QuadrangleTest {

	ConcreatQuadlangle actual;

	@Before
	public void setUp() throws Exception {
		actual = new ConcreatQuadlangle(new SideList("1", "2", "3", "4"));
	}

	@Test
	public void testPerimeter() {
		assertThat(actual.perimeter(), is(Num.of(10)));
	}

	@Test
	public void testArea() {
		actual.setBottom(4);
		actual.setHeight(6);
		assertThat(actual.area(), is(Num.of(24)));
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

	class ConcreatQuadlangle extends AbstarctQuadrangle implements Quadrangle {
		public ConcreatQuadlangle(SideList sides) { super.sides = sides; }
	}
}
