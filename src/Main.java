


import java.io.File;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String>ls=new ArrayList<String>();
		String root = System.getProperty("user.dir");
		String FileName="input.txt";
		String filePath = root+FileName;


		InputStore inputStore=new InputStore(ls);
		inputStore.input(filePath);
		
		CircularShifter cs=new CircularShifter(ls);
		cs.shift();
		
		Alphabetizer alp=new Alphabetizer(cs.ls);
		alp.alpha();
		
		Output output=new Output(alp.ls);
		output.output("output.txt");
	}

}
