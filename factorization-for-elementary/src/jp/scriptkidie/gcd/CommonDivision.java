package jp.scriptkidie.gcd;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * 連除法。
 * 
 * 最大公約数：整数リストがすべて公約可能な場合の除数から求める
 * 最小公倍数：整数リストの少なくとも二つが公約可能な場合の除数とあまりから求める
 * 
 * 互いに素な約数と公約数、公倍数の関係を利用する。
 * 
 * @author UENO, Toshiyuki.
 *
 */
public class CommonDivision {

	static List<Integer> primeList  = Arrays.asList(2,3,5,7,11,13,17,19);

	Deque<Pair<Integer, List<Integer>>> stack;
	Mode mode;

	CommonDivision(List<Integer> intList, Mode mode) {
		this.stack = new ArrayDeque<>();
		this.stack.add(new Pair<>(1, intList));
		this.mode = mode;
	}
	/**
	 * スタック積み上げ
	 */
	void stack() {
		List<Integer> intList = getLastValue();
		Integer divisor = primeFactory(intList);
		if (1 < divisor) {
			stack.add(new Pair<>(divisor, divideList(divisor, intList)));
			stack();
		}
	}
	/**
	 * スタックの最後の整数リストを返却する。
	 * @return 最終の整数リスト
	 */
	List<Integer> getLastValue() {
		return this.stack.getLast().getValue();
	}
	/**
	 * 最大公約数を返却する 
	 * @return 最大公約数
	 */
	Integer getGCD() {
		return reduceDivisor();
	}
	/**
	 * 最小公倍数を返却する
	 * @return 最小公倍数
	 */
	Integer getLCM() {
		return getLastValue().stream().reduce(1, (x, y) -> x * y) * reduceDivisor();
	}
	/**
	 * スタックの除数の乗算結果を返却する。
	 * @return 除数の乗算結果
	 */
	Integer reduceDivisor() {
		return stack.stream().map(p -> p.getKey()).reduce(1, (x, y) -> x * y);
	}
	/**
	 * 約数を返却する。
	 * 
	 * GCDモードでは全要素に共通する約数を返却し、LCMモードでは2つ以上に共通する約数を返却する。
	 * @param intList 整数リスト
	 * @return 要素に共通の約数
	 */
	Integer primeFactory(List<Integer> intList) {
		Predicate<Integer> op = mode.equals(Mode.GCD) ? factoryAll(intList) : factoryMulti(intList);
		return primeList.stream().filter(op).findFirst().orElse(1);
	}
	/**
	 * 全要素が公約可能か判定する。
	 */
	static Predicate<Integer> factoryAll(List<Integer> intList) {
		return i -> intList.stream().allMatch(isDivisable(i));
	}
	/**
	 * 複数要素が公約可能か判定する。
	 */
	static Predicate<Integer> factoryMulti(List<Integer> intList) {
		return i -> intList.stream().filter(isDivisable(i)).count() > 1;
	}
	/**
	 * 整除可能（割り切れる）か判定する
	 * @param divisor 除数
	 * @return 整除可能か
	 */
	static Predicate<Integer> isDivisable(Integer divisor) {
		return i -> i % divisor == 0;
	}
	/**
	 * 整数のリストを約する
	 * @param intList 整数のリスト
	 * @param divisor 約数
	 * @return 約したのちの整数のリスト
	 */
	static List<Integer> divideList(Integer divisor, List<Integer> intList) {
		return intList.stream().map(divide(divisor)).collect(Collectors.toList());
	}
	/**
	 * 整数を約数で約する。
	 * 整約可能な場合のみ約する。それ以外の場合元の値を返却する。
	 * 
	 * @param divisor 約数
	 * @return 約した結果
	 */
	static UnaryOperator<Integer> divide(Integer divisor) {
		return i -> (i % divisor) == 0 ? i / divisor : i;
	}
}
