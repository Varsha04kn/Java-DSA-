package loops;

public class primenumbers {
	public static void main(String[]args) {
		int n = 50, num = 2;
		while(num <= n) {
			int i = 2;
		boolean prime = true;
		
		while(i <= num / 2) {
			if(num % i == 0) {
				prime = false;
				break;
			}
			 i++;
			}
		if (prime) {
			System.out.println(num + " ");
		}
		num++;
		}
	}
}

		

