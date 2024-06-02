package Log4jBasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

	public static void main(String[] args) throws IOException {
		
		String fname= "C:\\Users\\DELL\\eclipse-workspace\\samplemaven\\src\\test\\java\\Log4jBasics\\MyCsv.csv";
		
		//  to read .txt  we have 2 classes --> FileReader, BufferedReader classes
		
		//FileReader  fr = new FileReader(fname);
		
		FileReader fr = new FileReader(fname);
		//BufferedReader  br  = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(fr);
		
		String line1 = br.readLine();
		String line2 = br.readLine();
		String line3 = br.readLine();
		String line4 = br.readLine();// null
		
		System.out.println("lin1="+line1);
		System.out.println("lin2="+line2);
		System.out.println("lin3="+line3);
		System.out.println("line4="+line4);
		
		System.out.println("val from array=");
		
	String sarr[]=	line1.split(", ");
	
	for(int i=0;i<=sarr.length-1;i++)
	{
		System.out.println(sarr[i]);
	}
		
		

	}

}
