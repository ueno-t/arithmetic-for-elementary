package jp.scriptkidie.shape.triangle;

import jp.scriptkidie.shape.RegularPolygon;

/**
 * 正三角形.
 * 
 * <li>Three equal sides
 * <li>Three equal angles, always 60°
 * 
 * @author UENO, Toshiyuki.
 *
 */
public interface Equilateral extends Triangle, RegularPolygon {

	/**
	 * 正三角形の定義は「3辺が同一であること」である.
	 * 
	 * @return 真：正三角形である、偽：正三角形でない
	 */
	default boolean isValid() {
		return (sides().number() == Triangle.NUMBER_OF_SIDES) && (sides().sameAll());
	}

}
