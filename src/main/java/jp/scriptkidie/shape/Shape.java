package jp.scriptkidie.shape;

/**
 * 平面図形.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public interface Shape {

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
