package String;

public class P13_EmailValidation {
//	public static void main(String[] args) {
//		String check = "Example@gmail.com";
//		String database = "Example@gmail.com";
//		boolean flag = false;
//		if (check.length() == database.length()) {
//			for (int i = 0; i < check.length(); i++) {
//				if (check.charAt(i) == database.charAt(i)) {
//					flag = true;
//				}else {
//					flag=false;
//					break;
//				}
//				
//			}
//			if (flag) {
//				System.out.println("email is correct");
//			} else {
//				System.out.println("please check the email");
//			}
//		} else {
//			System.out.println("please check the mail");
//		}
//
//	}

	public static void main(String[] args) {
		String a = "kaustubhexample@gmail.com";
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (!((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') && !(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
					&& !(a.charAt(i) >= '0' && a.charAt(i) <= '9'))) {
				count++;
			}
		}

		for (int i = 0; i < a.length(); i++) {
			if (count <= 2) {

				if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') && a.charAt(a.length() - 10) == '@'
						|| a.charAt(a.length() - 9) == '@') {
					if (a.charAt(a.length() - 4) == '.' || a.charAt(a.length() - 3) == '.') {
						flag = true;
					}
				}
			}

		}
		if (flag) {
			System.out.println("email is valid");
		} else {
			System.out.println("email is not valid");

		}
	}
}
