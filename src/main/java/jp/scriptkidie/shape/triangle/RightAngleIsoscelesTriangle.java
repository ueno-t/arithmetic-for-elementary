package jp.scriptkidie.shape.triangle;

import jp.scriptkidie.number.Num;
import jp.scriptkidie.shape.SideList;

public class RightAngleIsoscelesTriangle implements RightTriangle, IsoscelesTriangle {

	SideList sides;
	/** 底辺の長さ */
	Number bottom;
	/** 底辺以外の辺の長さ */
	Number other;
	/** 高さ */
	Number height;

	/**
	 * 直角二等辺三角形は底辺と底辺以外の辺の最低２辺の定義で成立すると考える.
	 * 
	 * @param sides 辺
	 */
	public RightAngleIsoscelesTriangle(SideList sides) {
		this.sides = sides;
	}

	public void setBottom(Number bottom) {
		this.bottom = bottom;
	}
	public void setOther(Number other) {
		this.other = other;
	}
	public void setHeight(Number height) {
		this.height = height;
	}

	@Override
	public Number bottom() {
		return bottom;
	}

	@Override
	public Number height() {
		return height;
	}

	@Override
	public Number perimeter() {
		return ((Num) bottom).add(other).mul(2.0);
	}

	@Override
	public Number area() {
		if (bottom != null) return Num.of(bottom).pow(2).div(4);
		if (other !=  null) return Num.of(other ).pow(2).div(2);
		if (bottom != null && height != null) return Num.of(bottom).mul(height).div(2);
		throw new ArithmeticException();
	}
}
