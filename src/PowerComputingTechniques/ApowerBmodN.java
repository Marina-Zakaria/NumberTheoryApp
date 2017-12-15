package PowerComputingTechniques;

import java.math.BigInteger;

public class ApowerBmodN {
	private BigInteger A;
	private BigInteger B;
	private BigInteger n;
	private BigInteger operationsNumber;

	/**
	 * @param operationsNumber
	 *            the operationsNumber to set
	 */
	public BigInteger getOperationsNumber() {
		return operationsNumber;
	}

	public ApowerBmodN(BigInteger a, BigInteger b, BigInteger n) {
		super();
		A = a;
		B = b;
		this.n = n;
	}

	public BigInteger technique1() {
		BigInteger f = BigInteger.ONE;
		for (BigInteger i = BigInteger.ZERO;! i.equals(B); i=i.add(BigInteger.ONE)) {
			f = f.multiply(A);
		}
		f = f.mod(n);
		operationsNumber = B;
		return f;
	}

	public BigInteger technique2() {
		BigInteger f = BigInteger.ONE;
		for (BigInteger i = BigInteger.ZERO;! i.equals(B); i=i.add(BigInteger.ONE)) {
			f = f.multiply(A);
			f = f.mod(n);

		}
			
		operationsNumber = B.multiply(BigInteger.valueOf(2));
		return f;
	}

	public BigInteger technique3() {
		BigInteger count = BigInteger.ZERO;
		String binaryRepresentation = Long.toBinaryString(B.longValue());
		BigInteger f = BigInteger.ONE;
		for (int i = 0; i < binaryRepresentation.length() ; i++) {
			f = f.multiply(f);
			f = f.mod(n);
			if (binaryRepresentation.charAt(i) == '1') {
				f = f.multiply(A);
				f = f.mod(n);
				count.add(BigInteger.ONE);
			}

		}
		operationsNumber = count .add(BigInteger.valueOf(2 * binaryRepresentation.length())) ;
		return f;
	}

}
