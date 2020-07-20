import java.io.InvalidClassException;

public class StackTraceDemo2 {

	public static void main(String[] args) {

		try {
			a();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	static void a() {
		b();
	}

	static void b() {
		c();
	}

	static void c() {
		d();

	}

	static void d() {
		throw new NullPointerException("Nope!");
	}
}