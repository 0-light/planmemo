package First;
import java.util.Scanner;
import java.awt.event.*;
import java.io.IOException;


public class IntroPage {
	
	
	public static void main(String[] args) throws IOException{
		while(true) {
		int keyCode = System.in.read();
		
		System.out.println("������ ���� ver1.0");
		System.out.println("  >> �Է� / ��� / ����");
		
		char a1,a2,a3;
        
		a1 = (char)System.in.read();
        
		System.out.println("   �Է� / >> ��� / ����");
        
        System.in.read(); // ����Ű�� ������ ���Ͱ��� �ԷµǱ� ������ �̰��� ������� �Ѵ�. �ΰ��� ����
		System.in.read(); // ����Ű�� ������ �ƽ�Ű�ڵ� 13�� ���� �Է��� �ǰ� ������ �ɶ� 10���� �Է��� �Ǳ� ����
       }
        
        System.out.println("   �Է� / ���  / >> ����");
        
        System.in.read(); // ����Ű�� ������ ���Ͱ��� �ԷµǱ� ������ �̰��� ������� �Ѵ�. �ΰ��� ����
		System.in.read(); // ����Ű�� ������ �ƽ�Ű�ڵ� 13�� ���� �Է��� �ǰ� ������ �ɶ� 10���� �Է��� �Ǳ� ����
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
//                System.out.println("��� �����ϰڽ��ϴ�.");
//            } else if (yesno_cheek.equals("n") || yesno_cheek.equals("N")) {
//                System.out.println("���α׷��� �����մϴ�");
//                System.exit(0);
//            } else {
//                System.out.println("�ٽ� �Է��� �ּ���");
//            }
//        }
   }
