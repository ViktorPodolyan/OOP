package Mail;

public class Mail {
	public static void main(String args[]) {
		char[] email = { 'v', 'i', 'k', 't', 'o', 'r', '0', '5', '@', 'g', 'm', 'a', 'i', 'l', '.', 'c', 'o', 'm' };
		int dog = 0, dot = 0;
		char c = '@', d = '.';
		for (int i = 1; i < email.length; i++) {
			if (c == email[i]) {
				dog = i;
				break;
			}
		}

		for (int i = dog + 1; i < email.length; i++) {
			if (d == email[i]) {
				dot = i;
				break;
			}
		}

		for (int i = dog + 1; i < dot; i++) {
			email[i] = '*';
		}

		System.out.println(email);
	}
}
