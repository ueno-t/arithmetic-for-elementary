package jp.scriptkidie.shape;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SideListTest {

	/**
	 * <li>事前条件；３辺に同一の値が設定されている
	 * <li>事後条件：真が返却される
	 */
	@Test
	public void testSameAll_success() {
		SideList actual = new SideList("1","1","1");
		assertThat(actual.sameAll(), is(true));
	}

	/**
	 * <li>事前条件；３辺に異なる値が設定されている
	 * <li>事後条件：偽が返却される
	 */
	@Test
	public void testSameAll_fail() {
		SideList actual = new SideList("1","2","1");
		assertThat(actual.sameAll(), is(false));
	}

}
