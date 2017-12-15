package ExtendedEuclidianAlgorithm;

import java.util.ArrayList;

public class mulInverse {
	private long a;
	private long b;
	private ArrayList<long[]> stages = new ArrayList<>();
	private long gcd;
	private long x = 1;
	private long y = 0;
	private long mulInverse = 0;

	public mulInverse(long a, long b) {
		this.a = a;
		this.b = b;
		getMultiplicativeInverse();
	}

	/**
	 * @return the gcd
	 */
	public long getGcd() {
		return gcd;
	}

	/**
	 * @return the mulInverse
	 */
	public long getMulInverse() {
		return mulInverse;
	}

	private long EucidianAlgorithm(long a, long b) {

		if (b == 0) {
			return a;
		} else {
			long[] arr = new long[2];
			arr[0] = a;
			arr[1] = b;
			stages.add(arr);
			return EucidianAlgorithm(b, a % b);
		}
	}

	private void getMultiplicativeInverse() {
		gcd = EucidianAlgorithm(this.a, this.b);

		for (int i = stages.size() - 1; i >= 0; i--) {
			long temp = x;
			x = y;
			y = temp - (stages.get(i)[0] / stages.get(i)[1]) * y;
		}
		if (gcd == 1) {

			mulInverse =  y % a;
			if(mulInverse<0){
				mulInverse=(mulInverse+a)%a;
			}
		}
	}

	/**
	 * @return the x
	 */
	public long getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public long getY() {
		return y;
	}
}
