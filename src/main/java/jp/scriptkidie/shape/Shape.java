package jp.scriptkidie.shape;

/**
 * 平面図形.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public interface Shape {

	/**
	 * 図形を構成する辺の集合.
	 * 問題の構成要件に従属するため、閉路になっていることやすべての辺が完備していることを保証しない.
	 * 
	 * @return 辺
	 */
	SideList sides();

	/**
	 * 周辺長.
	 * 
	 * @return 周辺長
	 */
	Number perimeter();

	/**
	 * 面積.
	 * 
	 * @return 面積
	 */
	Number area();
}
