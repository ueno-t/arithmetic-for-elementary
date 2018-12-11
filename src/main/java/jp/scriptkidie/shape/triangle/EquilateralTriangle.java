package jp.scriptkidie.shape.triangle;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.SideList;

/**
 * 正三角形.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public class EquilateralTriangle extends AbstractTriangle implements Equilateral {

	/**
	 * 辺で三角形を作成する.
	 * 正三角形は１辺が与えられれば成立すると考える.
	 * 
	 * @param sides 辺
	 */
	EquilateralTriangle(SideList sides) {
		if (sides.number() < 1) throw new ArithmeticException("正三角形は少なくとも１辺の定義が必要です.");
		this.sides = sides;
	}

	/**
	 * {@inheritDoc}
	 * 正三角形の周辺長は「辺長 * 3」である.
	 */
	@Override
	public Number perimeter() {
		return Num.of(sides.a()).mul(3);
	}

	/**
	 * [{@inheritDoc}
	 * 正三角形の底辺は任意の1辺である.
	 */
	@Override
	public Number bottom() {
		return sides.a();
	}

}
