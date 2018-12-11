package jp.scriptkidie.shape.triangle.impl;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.SideList;
import jp.scriptkidie.shape.triangle.Isosceles;
import jp.scriptkidie.shape.triangle.Right;
import lombok.Setter;

public class RightAngleIsoscelesTriangle extends AbstractTriangle implements Right, Isosceles {

	/** 底辺以外の辺の長さ */
	@Setter Number other;

	/**
	 * 直角二等辺三角形は底辺と底辺以外の辺の最低２辺の定義で成立すると考える.
	 * 
	 * @param sides 辺
	 */
	public RightAngleIsoscelesTriangle(SideList sides) {
		this.sides = sides;
	}

	@Override
	public Number perimeter() {
		return Num.of(other).mul(2.0).add(bottom);
	}

	/**
	 * 「底辺以外の辺：底辺＝1：√2」を前提とする.
	 * 下記の順番で処理を試みる.
	 * <ol>
	 * <li>底辺 × 高さ ÷ 2
	 * <li>底辺以外の長さ ^2 / 2
	 * <li>底辺の長さ         ^2 / 4
	 * </ol>
	 */
	@Override
	public Number area() {
		if (bottom != null && height != null) return Num.of(bottom).mul(height).div(2);
		if (other  != null) return Num.of(other ).pow(2).div(2);
		if (bottom != null) return Num.of(bottom).pow(2).div(4);
		throw new ArithmeticException();
	}
}
