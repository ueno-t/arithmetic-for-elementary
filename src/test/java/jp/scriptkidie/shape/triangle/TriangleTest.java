package jp.scriptkidie.shape.triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jp.scriptkidie.number.Num;

public class TriangleTest {

	ConcreatTriangle actual;
	@Before
	public void setup() {
		actual = new ConcreatTriangle();
	}

	/**
	 * <li>事前条件：底辺３、高さ４
	 * <li>事後条件：面積６
	 */
	@Test
	public void testArea() {
		assertThat(actual.area(), is(Num.of(6.0)));
	}

	class ConcreatTriangle implements Triangle {
		@Override public Number perimeter() {return 12;}
		@Override public Number bottom() {return 3;}
		@Override public Number height() {return 4;}
	}
}
