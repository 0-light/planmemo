package First;

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class IntroPage2 {

	public static void IntroPage2() throws IOException {                                                                                                                                                                
		while(true) {                   
			                                                                                                                                                                                                                                                                                                                                                                                                                                   
            String sm = null; //sm - selectmode
			String Input = null; //input = 넣을내용
			
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);  
			
			System.out.println(" 입력 / 보기 / 공유 ");
			System.out.println("원하는 모드를 쓰고 엔터를 입력해주세요 ex)입력");
			System.out.print("모드 : ");
			sm = sc.nextLine();

			if (sm.contentEquals("입력")) {
				
				System.out.println("\n입력모드에 들어왔습니다.");
				Filewrite B = new Filewrite();
				B.filewrite();
				
			}
				else if(sm.contentEquals("보기")){
					System.out.println("\n보기모드에 들어왔습니다.");
					Fileread A = new Fileread();
					A.fileread();
					break;
				}
				else if(sm.contentEquals("공유")){
				System.out.println("\n공유모드에 들어왔습니다.");
				//기능들어갈부분
				break;
			} else {
				System.out.println("\n다시 입력해주세요\n");
			}
		//sc.close();
		
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}
}