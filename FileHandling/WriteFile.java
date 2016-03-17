import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile{
	public static void main(String[] args) throws IOException{
		String fileName = "abc.txt";
		PrintWriter outFile= new PrintWriter(new FileWriter (fileName));
		outFile.println(33);
		outFile.println(77);
		outFile.println("kabiLeitKHilayaHai?");
		outFile.close();
	}
}