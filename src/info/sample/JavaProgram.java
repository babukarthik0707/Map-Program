package info.sample;

public class JavaProgram {
	public static void main(String[] args) {
		int count = 0;
		int var;
		for (int i = 2; count < 10; i++) {
			var = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					var++;
					break;
				}
			}
			if (var == 0) {
				System.out.println(i);
				count++;
			}
		}

	}
}