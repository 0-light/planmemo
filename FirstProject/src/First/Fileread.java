package First;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;

public class Fileread {
	public static void fileread() throws IOException{
			
		String a = MakeFile.name;
	
		try {
			
			//파일에서 입력받을 경우
			FileReader fr = new FileReader(a + ".txt");
			BufferedReader br_f = new BufferedReader(fr);
			
			//파일의 한 줄 한 줄 읽어서 출력
			String line = "";
			for(int i=1; (line = br_f.readLine()) != null; i++) {
				System.out.print(i);
				System.out.print(")");
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		}
		
		System.out.println("------- 종료할려면 아무키나 입력하세요,이전메뉴=z -------");
		System.out.print("입력 :");
		Scanner ba = new Scanner(System.in);
		String back = ba.nextLine();
		if(back.matches("z")) {
		//z를 입력하면 이전메뉴	
			IntroPage2 A = new IntroPage2();
			A.IntroPage2();
		}
	}
}

// 버퍼로읽기....
// BufferedReader bReader = null;
//		
//		try {
//			
//			String s;
//			String a = MakeFile.name;
//			File file = new File(a + ".txt");
//			bReader = new BufferedReader(new FileReader(file));
//			
//			// 
//			while((s = bReader.readLine()) != null) {
//				System.out.println(s);
//			}
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try{
//				if(bReader != null) bReader.close();
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
