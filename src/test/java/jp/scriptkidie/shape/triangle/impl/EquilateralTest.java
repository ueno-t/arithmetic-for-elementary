package jp.scriptkidie.shape.triangle.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import jp.scriptkidie.shape.SideList;

public class EquilateralTest {

	EquilateralTriangle actual;

	@Before
	public void setup() {
	}

	/**
	 * <li>事前条件：3辺が同一
	 * <li>事後条件：真が返却されること
	 */
	@Test
	public void testIsValid_true() {
		actual = new EquilateralTriangle(new SideList("3","3","3"));
		assertThat(actual.isValid(), is(true));
	}

	/**
	 * <li>事前条件：3辺のうち少なくとも1辺が同一でない
	 * <li>事後条件：偽が返却されること
	 */
	@Test
	public void testIsValid_false1() {
		actual = new EquilateralTriangle(new SideList("3","2","3"));
		assertThat(actual.isValid(), is(false));
	}

	/**
	 * <li>事前条件：3辺でない
	 * <li>事後条件：偽が返却されること
	 */
	@Test
	public void testIsValid_false2() {
		actual = new EquilateralTriangle(new SideList("3","3"));
		assertThat(actual.isValid(), is(false));
	}

}
