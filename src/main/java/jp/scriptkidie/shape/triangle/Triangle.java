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

	/** 三角形の内角の和 */
	Number SUM_OF_INTERNAL_ANGLES = Num.of(180);

	/**
	 * 底辺を取得する.
	 * 
	 * @return 底辺長
	 */
	Optional<Number> bottom();

	/**
	 * 高さを取得する.
	 * 
	 * @return 高さ
	 */
	Optional<Number> height();

	/**
	 * 辺a, 辺b, 辺cの合算値.
	 */
	default Number perimeter() {
		return Num.of(sides().a()).add(sides().b()).add(sides().c());
	}

	/**
	 * 三角形の面積： 底辺 × 高さ ÷ 2
	 */
	default Number area() {
		return Num.of(bottom().orElseThrow(ArithmeticException::new))
				 .mul(height().orElseThrow(ArithmeticException::new))
				 .div(2);
	}
}
