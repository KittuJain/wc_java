import java.io.*;
public class Wc {

	public static void main(String[] args) throws IOException{
		String fileName = args[0], option = null;
		if(args.length==2){
			option = args[1];
			if(fileName.charAt(0) == '-'){
				String file = fileName;
				fileName = option;
				option = file;
			}
		}
		WcMain wcMain = new WcMain(fileName, option);
		System.out.println(wcMain.fileHandler());
	} 
}