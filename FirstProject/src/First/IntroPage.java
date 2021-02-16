package First;
import java.util.Scanner;
import java.awt.event.*;
import java.io.IOException;


public class IntroPage {
	
	
	public static void main(String[] args) throws IOException{
		while(true) {
		int keyCode = System.in.read();
		
		System.out.println("열심히 살자 ver1.0");
		System.out.println("  >> 입력 / 통계 / 공유");
		
		char a1,a2,a3;
        
		a1 = (char)System.in.read();
        
		System.out.println("   입력 / >> 통계 / 공유");
        
        System.in.read(); // 엔터키를 눌러도 엔터값이 입력되기 때문에 이값을 없애줘야 한다. 두개를 써줌
		System.in.read(); // 엔터키를 누를때 아스키코드 13번 같이 입력이 되고 개행이 될때 10번이 입력이 되기 때문
       }
        
        System.out.println("   입력 / 통계  / >> 공유");
        
        System.in.read(); // 엔터키를 눌러도 엔터값이 입력되기 때문에 이값을 없애줘야 한다. 두개를 써줌
		System.in.read(); // 엔터키를 누를때 아스키코드 13번 같이 입력이 되고 개행이 될때 10번이 입력이 되기 때문
	}
}	
	
        public static void clearScreen() {
        	for (int i = 0 ; i < 80; i++)
        		System.out.println("");
        }
        
        
        
      //Scanner sc = new Scanner(System.in);
        
//        while (true) {
//          String yesno_cheek = sc.next();
//            if (yesno_cheek.equals("y") || yesno_cheek.equals("Y")) {
//                System.out.println("계속 진행하겠습니다.");
//            } else if (yesno_cheek.equals("n") || yesno_cheek.equals("N")) {
//                System.out.println("프로그램을 종료합니다");
//                System.exit(0);
//            } else {
//                System.out.println("다시 입력해 주세요");
//            }
//        }
   }
