


import java.util.ArrayList;

public class CircularShifter {
	public ArrayList<String> ls;
	public CircularShifter(ArrayList<String> ls){
		this.ls=ls;
	}
	public void shift(){
		
		ArrayList<String> shiftedLineIndexes=new ArrayList<String>();
		  for(int i=0;i<ls.size();i++){
				String orinLine=ls.get(i);
				String sarray[]=orinLine.split(" "); 
				for(int j=0;j<sarray.length;j++){
					String newLine=sarray[j];
					if(sarray.length>1){
	
						if(j==sarray.length-1){
							
							for(int k=0;k<(sarray.length-1);k++){
								newLine=newLine+" "+sarray[k];
							}
						}
						else{
							for(int k=j+1;k<sarray.length;k++){
								newLine=newLine+" "+sarray[k];
							}
							
							for(int m=0;m<j;m++){
								newLine=newLine+" "+sarray[m];
							}
						}
						
					}
					 shiftedLineIndexes.add(newLine);
				}
		  }
		  
		 ls=shiftedLineIndexes;
	}

}

