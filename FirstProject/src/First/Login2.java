package First;

import java.io.FileOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Login2 {

	public static void main(String[] args) throws IOException{
		//Login A = new Login();
		//Login B = new Login();// 클래스를 객체생성해서 사용하는 방법
		//A.login();	//안에있는 변수값을 바꿔야할때 객체생성을 해서 바꿔야함
	
		MakeFile C = new MakeFile();
		C.makefile();
		
		//Login.login(); // 클래스를 바로 사용하는 방법(바꿔야할게 없고 내용만 사용할 때)
	}

	
}
