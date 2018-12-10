package jp.scriptkidie.shape.triangle;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.SideList;

/**
 * 正三角形.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public class EquilateralTriangle implements Triangle {

	private SideList sides;
	private Number height;

	/**
	 * 辺の長さで三角形を作成する.
	 * 正三角形は１辺が与えられれば成立すると考える.
	 * 
	 * @param sides 辺
	 */
	EquilateralTriangle(SideList sides) {
		if (sides.number() < 1) throw new ArithmeticException("正三角形は少なくとも１辺の定義が必要です.");
		this.sides = sides;
	}

	/**
	 * 正三角形の定義は「３辺が同一であること」である.
	 * 
	 * @return 真：正三角形である、偽：正三角形でない
	 */
	boolean isValid() {
		return (sides.number() == 3) && (sides.sameAll());
	}

	/**
	 * 高さ.
	 * 
	 * @param height 高さ
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * {@inheritDoc}
	 * 正三角形の周辺長は「辺長 * 3」である.
	 */
	@Override
	public Number perimeter() {
		return Num.of(sides.first()).mul(3);
	}

	/**
	 * [{@inheritDoc}
	 * 正三角形の底辺は任意の１辺である.
	 */
	@Override
	public Number bottom() {
		return sides.first();
	}

	/**
	 * [{@inheritDoc}
	 * 小学算数では高さは与えられるものとする.
	 */
	@Override
	public Number height() {
		if (height == null) throw new ArithmeticException("高さが与えられていません.");
		return height;
	}

}
