package First;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MakeFile {
	static String name;
	
	public static void makefile() throws IOException {

		// name - 사용자이름
		int f1; // f1 - 선택할려는 변수 이름

		while (true) {
			System.out.println("\n아이디를 입력하세요");
			Scanner id = new Scanner(System.in);
			System.out.print("아이디 : ");
			name = id.nextLine();

			File file = new File(name + ".txt");

			if (file.exists()) {
				System.out.println("\n" + name + "님 안녕하세요^^\n");
				IntroPage2 A = new IntroPage2();
				A.IntroPage2();
				break;

			} else {
				System.out.println(name + " 은/는 없는 아이디 입니다.");
				System.out.println("1. 이 이름으로 아이디 생성");
				System.out.println("2. 다시입력");
			}

			Scanner noid = new Scanner(System.in);
			System.out.print("기능 : ");
			f1 = noid.nextInt();

			if (f1 == 1) {
				file.createNewFile();
				System.out.println(name + "으로 아이디를 만들었습니다.\n");
				IntroPage2 B = new IntroPage2();
				B.IntroPage2();
				makefile();
			} else if (f1 == 2) {
				makefile(); // 재귀호출을 이용하여 다시 처음으로
			}

		}
	}

	// FileWriter fw = new FileWriter(name + ".txt", true);

}
