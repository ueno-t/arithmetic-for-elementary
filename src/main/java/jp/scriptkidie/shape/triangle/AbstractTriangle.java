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
	public Number bottom() {
		return bottom;
	}

	/**
	 * {@inheritDoc}
	 * 小学算数では高さは与えられるものとする.
	 */
	@Override
	public Optional<Number> height() {
		if (height == null) throw new ArithmeticException("高さが与えられていません.");
		return Optional.of(height);
	}

}
