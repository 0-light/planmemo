package First;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Filewrite {

	public static void filewrite() {

		String text = null;
		String a = MakeFile.name; // 사용자이름(파일명)을 Makefile클래스에서 가져오기위한 변수 a

		System.out.println("");
		System.out.println("계획 or 완료 그리고 '-' 을 입력하여 내용을 입력해주세요 ");
		System.out.println("ex)계획-영어단어외우기(뒤로가기=z)");
		System.out.print("내용 :");

		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분");

		Date time = new Date();

		String time1 = format1.format(time);

		// Scanner un = new Scanner(System.in);
		// String until = un.nextLine(); // 반복적으로 입력을 받기위해 넣은 until

		try {
			File file = new File(a + ".txt"); // 파일명.txt
			FileWriter fileWrite = new FileWriter(file, true); // true면 이어서, false를 이용하면 덮어쓰기가 된다.

			if (text.matches("z")) {

			} else if (text.matches("계획-.*") || text.matches("완료-.*")) {
				long len = file.length(); // 파일사이즈 검사변수

				if (len == 0) { // 보기모드에 한줄 공백을 없애주기 위한 함수
					fileWrite.write(text + " " + time1); // 보기 편하게 하기 위해 (" ")공백을 넣어줌
					String jamsi = text + " " + time1; // 비교하기위한 변수 jamsi
					// String hawkin = (jamsi.substring(jamsi.length()-6, jamsi.length()));
					// System.out.println(hawkin);
				} else {
					fileWrite.write("\r\n");
					fileWrite.write(text + " " + time1); // 계획 + " "(공백) + 현재시간
					String jamsi = text + " " + time1; // 비교하기위한 변수 jamsi
					// String hawkin = (jamsi.substring(jamsi.length()-6, jamsi.length()));
					// System.out.println(hawkin);
				}
				filewrite();
			} else {
				System.out.println("-----예시를보고 양식에 맞게 다시 입력해주세요-----");
				filewrite();
			}

			fileWrite.flush();
			fileWrite.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
