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
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.println("---------------------");

			num = sc.nextInt();

			if (num == 1) {
				if (id1 == null) {
					System.out.println("ȸ�����Ժ��� ���ּ���.");
					continue;
				}
				System.out.print("���̵� : ");
				id2 = sc.next();
				
				if (id1.equals(id2)) {
					System.out.println("�α��μ���!");
				} else {
					System.out.println("�ٽ��Է����ּ���.");
				}
			} else if (num == 2) {
				System.out.print("���̵� : ");
				id1 = sc.next();
				System.out.println("ȸ������ ����!");
			} else if (num == 3) {
				run = false;
				System.out.println("���α׷� ����!!");
			}

		}

		// MakeFile(); //���ϻ���

}
}


	

