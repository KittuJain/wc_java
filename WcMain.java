import java.io.*;
public class WcMain {
	String fileName, option = null;
	
	public WcMain(String fileName){
		this.fileName = fileName;
	}
	public WcMain(String fileName, String option){		
		this.fileName = fileName;
		this.option = option;
	}
	
	public String fileHandler() throws IOException{
		File file = new File(fileName);
		int length = (int)file.length();
		
		char[] cbuf = new char[length];
		FileReader fr = null;

		try{
			fr = new FileReader(file);
		}
		catch(Exception e){}

		BufferedReader br = new BufferedReader(fr);
		br.read(cbuf, 0, length);
		String text = new String(cbuf);
		WcLib wc = new WcLib(text,option);
		wc.getWordCount();
		return wc.toString()+"\t"+fileName;
	}
}