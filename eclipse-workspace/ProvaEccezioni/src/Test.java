import java.io.EOFException;

class Test {
	public int f1() throws EOFException {
		return f2();
	}
	public int f2() throws EOFException {
		return 1;
	}
}
