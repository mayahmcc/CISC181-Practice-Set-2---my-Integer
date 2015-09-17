

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	private void setValue(int value) {
		this.value = value;

	}

	private int GetValue() {
		return value;

	}

	public boolean isEven() {

		if (this.GetValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.GetValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		int number = 0;
		if (this.GetValue() % number++ != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int value) {
		int n = 0;
		if (value % n++ != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(MyInteger myInt) {
		if (myInt.GetValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger myInt) {
		if (myInt.GetValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime(MyInteger myInt) {
		int number = 0;
		if (myInt.GetValue() % number++ != 0) {
			return true;
		} else
			return false;
	}

	public boolean equals(int value) {
		if (this.value == value) {
			return true;
		} else {
			return false;
		}

	}

	public boolean equals(MyInteger myInt) {
		if (myInt.GetValue() == myInt.GetValue()) {
			return true;
		} else {
			return false;
		}
	}

	static int parseInt(char[] c) {
		String string = c.toString();
		return Integer.parseUnsignedInt(string);

	}
	static int parseInt(String s){
		return Integer.parseInt(s);
	}
}
