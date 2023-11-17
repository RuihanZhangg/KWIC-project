


import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>ls=new ArrayList<String>();
		
		InputStore inputStore=new InputStore(ls);
		inputStore.input("src\\input.txt");
		
		CircularShifter cs=new CircularShifter(ls);
		cs.shift();
		
		Alphabetizer alp=new Alphabetizer(cs.ls);
		alp.alpha();
		
		Output output=new Output(alp.ls);
		output.output("src\\output.txt");
	}

}
