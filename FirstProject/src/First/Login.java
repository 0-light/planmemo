package First;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Login {

	public static void login() {
		Scanner sc = new Scanner(System.in);
		String id1 = null, id2 = null;
		//String passwd1 = null, passwd2 = null;
		
		int num = 0;
		boolean run = true;

		while (run) {
			System.out.println("---------------------");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.println("---------------------");

			num = sc.nextInt();

			if (num == 1) {
				if (id1 == null) {
					System.out.println("회원가입부터 해주세요.");
					continue;
				}
				System.out.print("아이디 : ");
				id2 = sc.next();
				
				if (id1.equals(id2)) {
					System.out.println("로그인성공!");
				} else {
					System.out.println("다시입력해주세요.");
				}
			} else if (num == 2) {
				System.out.print("아이디 : ");
				id1 = sc.next();
				System.out.println("회원가입 성공!");
			} else if (num == 3) {
				run = false;
				System.out.println("프로그램 종료!!");
			}

		}

		// MakeFile(); //파일생성

}
}


	

