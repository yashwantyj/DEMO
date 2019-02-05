package yash.CAB;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GrossaryHelper {
	static List<GrossaryDetails> grossary = new ArrayList<GrossaryDetails>();

	
	public void addGrossary(GrossaryDetails gd) throws IOException
	 {
		grossary.add(gd);
		 
	 }
		public void readGrossary() {
			
			for(GrossaryDetails gd:grossary) {
				gd.toString();
			}
			
			
	}
}
