package SeleniumWebDriver_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSVFile2 {

	public static void main(String[] args) throws IOException {
		
		
		// This will load csv file 
				CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Jino\\Desktop\\test.csv"));

				// this will load content into list
				List<String[]> li=reader.readAll();
				System.out.println("Total rows which we have is "+li.size());
		
				// create Iterator reference

				Iterator<String[]>i1= li.iterator();
		
				// Iterate all values 
				
				while(i1.hasNext()){
					
					String[] str=i1.next();
					
					System.out.print(" Values are " );
					
				for(int i=0;i<str.length;i++)
					{

					System.out.print(" "+str[i]  +" " +str.length);

					}
					
					System.out.println("   ");
					
				}
		
		
				}
		
	}
		


		
		
		
		
		
		