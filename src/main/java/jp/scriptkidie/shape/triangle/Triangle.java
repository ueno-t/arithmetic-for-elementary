package jp.scriptkidie.shape.triangle;

import java.util.Optional;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.Shape;

/**
 * 三角形.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public interface Triangle extends Shape {

	/**
	 * 底辺.
	 * 
	 * @return 底辺長
	 */
	Number bottom();

	/**
	 * 高さ.
	 * 
	 * @return 高さ
	 */
	Optional<Number> height();

	/**
	 * すべての辺の合算値.
	 */
	default Number perimeter() {
		return Num.of(sides().a()).add(sides().b()).add(sides().c());
	}

	/**
	 * 三角形の面積.
	 * 公式： 底辺 × 高さ ÷ 2
	 */
	default Number area() {
		return Num.of(bottom()).mul(height().orElseThrow(ArithmeticException::new)).div(2);
	}
}
