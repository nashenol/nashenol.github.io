public class GCDCalculator {

	private int p;
	private int q;
	private int divisor;

	public GCDCalculator(int p, int q) {
		this.p = p;
		this.q = q;
		this.divisor = gcd(p, q);
	}

	public int gcd(int first, int second) {
		if (second == 0) {
			return p;
		}
		int r = first % second;
		return gcd(second, r);
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
		this.divisor = gcd(this.p, this.q);
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
		this.divisor = gcd(this.p, this.q);
	}

	public int getDivisor() {
		return divisor;
	}
}