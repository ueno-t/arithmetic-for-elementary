package jp.scriptkidie.number;

/**
 * 数.
 * 
 * @author UENO, Toshiyuki.
 *
 */
public class Num extends Number {

	/** SID */
	private static final long serialVersionUID = -1249047890372282496L;

	private String val;

	public Num(String val) {
		this.val = val;
	}

	@Override
	public int intValue() {
		return Integer.parseInt(val);
	}

	@Override
	public long longValue() {
		return Long.parseLong(val);
	}

	@Override
	public float floatValue() {
		return Float.parseFloat(val);
	}

	@Override
	public double doubleValue() {
		return Double.parseDouble(val);
	}

	/**
	 * 加法.
	 * 
	 * @param augend 加数
	 * @return 和
	 */
	public Num add(Number augend) {
		return Num.of(this.doubleValue() + augend.doubleValue());
	}

	/**
	 * 減法.
	 * 
	 * @param subtrahend 減数
	 * @return 差
	 */
	public Num sub(Number subtrahend) {
		return Num.of(this.doubleValue() - subtrahend.doubleValue());
	}

	/**
	 * 乗法.
	 * 
	 * @param multiplicand 乗数
	 * @return 積
	 */
	public Num mul(Number multiplicand) {
		return Num.of(this.doubleValue() * multiplicand.doubleValue());
	}

	/**
	 * 除法.
	 * 
	 * @param divisor 除数
	 * @return 商
	 */
	public Num div(Number divisor) {
		return Num.of(this.doubleValue() / divisor.doubleValue());
	}

	/**
	 * べき乗.
	 * 
	 * @param exponent べき指数
	 * @return べき
	 */
	public Num pow(double exponent) {
		return Num.of(Math.pow(this.doubleValue(), exponent));
	}

	/**
	 * インスタンス化ヘルパ.
	 * 
	 * @param n 数
	 * @return 数
	 */
	public static Num of(Number n) {
		Double d = n.doubleValue();
		return new Num(d.toString());
	}

	@Override
	public boolean equals(Object o) {
		return this.val.equals(((Num) o).val);
	}

	@Override
	public int hashCode() {
		return val.hashCode();
	}

	@Override
	public String toString() {
		return val;
	}
}
