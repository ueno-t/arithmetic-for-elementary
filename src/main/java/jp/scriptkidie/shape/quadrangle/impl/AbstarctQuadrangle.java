package jp.scriptkidie.shape.quadrangle.impl;

import java.util.Optional;

import jp.scriptkidie.shape.SideList;
import jp.scriptkidie.shape.AngleList;
import jp.scriptkidie.shape.quadrangle.Quadrangle;
import lombok.Setter;

public abstract class AbstarctQuadrangle implements Quadrangle {

	protected SideList sides;
	protected AngleList angles;
	@Setter protected Number bottom;
	@Setter protected Number height;

	@Override
	public SideList sides() {
		return sides;
	}

	@Override
	public AngleList angles() {
		return angles;
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
