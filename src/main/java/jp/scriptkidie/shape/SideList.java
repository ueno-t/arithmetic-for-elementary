package jp.scriptkidie.shape;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import jp.scriptkidie.number.Num;

/**
 * 辺.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public class SideList {

	/** 辺は長さを持つ.*/
	private List<Number> sides;

	/**
	 * 辺長はすべて文字列から生成する.
	 * 
	 * @param s 辺長の文字列表現
	 */
	public SideList(String... s) {
		this.sides = Arrays.stream(s).map(str -> new Num(str)).collect(Collectors.toList());
	}

	/**
	 * 辺の数.
	 * 
	 * @return 辺の数
	 */
	public int number() {
		return sides.size();
	}

	/** 初めの辺（一般に「辺a」とされる）を取得する. */
	public Number a() {
		return sides.get(0);
	}
	/**辺bを取得する. */
	public Number b() {
		return sides.get(1);
	}
	/** 辺cを取得する. */
	public Number c() {
		return sides.get(2);
	}

	/**
	 * すべての辺に同一の値が設定されている？
	 * 
	 * @return すべて同一：真、少なくとも一つ異なる：偽
	 */
	public boolean sameAll() {
		return sides.stream().map(s -> Num.of(s)).distinct().count() == 1;
	}
}
