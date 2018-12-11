package jp.scriptkidie.shape;

/**
 * 平面図形.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public interface Shape {

	/**
	 * 図形を構成する辺長の集合を取得する.
	 * 
	 * @return 辺長の集合
	 */
	SideList sides();

	/**
	 * 周辺長を取得する.
	 * 
	 * @return 周辺長
	 */
	Number perimeter();

	/**
	 * 面積を取得する.
	 * 
	 * @return 面積
	 */
	Number area();
}
