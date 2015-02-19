import java.io.*;

public class WcMain {

	public static void main(String[] args) throws IOException{
		File file = new File("one.txt");
		int length = (int)file.length();
		FileReader fr = null;
		try{
			fr = new FileReader(file);
		}
		catch(Exception e){
		}
		BufferedReader br = new BufferedReader(fr);
		char[] cbuf = new char[length+3];
		br.read(cbuf, 0, length);
		System.out.println(cbuf);
		// Wc wc = new Wc(cbuf);
		// String text = System.console().readLine();
		// System.out.println(wc.getWordCount(text));
	}
}