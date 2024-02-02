package eazy;

public class HappyNumber_202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static boolean isHappy(int n) {

		int temp = 0;
        if (n == 1 || n == 7) {
            return true;
        } else {
            temp = n;
        }

        int sum = n;

        while (sum > 9) {
            sum = 0;

            while (temp > 0) {
                int d = temp % 10;
                sum += d * d;
                temp = temp / 10;
            }

            if (sum == 1 || sum == 7) {
                return true;
            } else {
                temp = sum;
            }

            
        }

        return false;
	}
}
