package jp.scriptkidie.shape.triangle;

import java.util.Optional;

import jp.scriptkidie.shape.SideList;
import lombok.Setter;

/**
 * 三角形の抽象クラス.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public class AbstractTriangle implements Triangle {

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
