package jp.scriptkidie.shape.triangle.impl;

import java.util.Optional;

import jp.scriptkidie.shape.SideList;
import jp.scriptkidie.shape.triangle.Triangle;
import lombok.Setter;

/**
 * 三角形の抽象クラス.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public abstract class AbstractTriangle implements Triangle {

	protected SideList sides;
	@Setter protected Number bottom;
	@Setter protected Number height;

	
	@Override
	public SideList sides() {
		return sides;
	}

	@Override
	public Optional<Number> bottom() {
		return Optional.ofNullable(bottom);
	}

	@Override
	public Optional<Number> height() {
		return Optional.ofNullable(height);
	}

}
