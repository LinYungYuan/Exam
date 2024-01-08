
public class MySqrt {
	// 69
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(2));

	}

	public static int mySqrt(int x) {

		long i = 1;

		while (i * i <= x) {
			i++;
		}

		return (int)i-1;

	}

}
