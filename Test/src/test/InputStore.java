package test;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputStore {
	public ArrayList<String> ls;
	public InputStore(ArrayList<String> ls){
		this.ls=ls;
	}
	public void input(String inputFile){
		 FileReader fr=null;
		  try {
			fr=new FileReader(inputFile);
		  } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  BufferedReader br=new BufferedReader(fr);
		  try {
			while(br.ready()){
				ls.add(br.readLine());
			      }
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
		  }
		  
	}
	
	

}
