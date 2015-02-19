import java.io.*;
public class Wc {

	public static void main(String[] args) throws IOException{
		WcMain wcMain = new WcMain(args[0]);
		System.out.println(wcMain.fileHandler());
	}
}