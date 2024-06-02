package WebdriverManagerBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilties2 {
	
	public static int getRowscnt(String xlfile,String sheetName) throws EncryptedDocumentException, IOException
	{	
FileInputStream fis = new FileInputStream(xlfile);
Workbook wb	= WorkbookFactory.create(fis);
Sheet sh   =wb.getSheet(sheetName);

       int rowscnt = sh.getLastRowNum();
		return rowscnt +1;
	}
	
	public static String readDatafromExcel(String xlfile,String sheet,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		//wb
		FileInputStream fis = new FileInputStream(xlfile);
		Workbook wb	=WorkbookFactory.create(fis);
	Sheet sh =wb.getSheet(sheet);
	String data =sh.getRow(rowNo-1).getCell(cellNo-1).toString();
	System.out.println("data form cell="+ rowNo  + ","+cellNo +"-->"+ data);
	return data;
		
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String xlfile="C:\\Users\\DELL\\Desktop\\testdata.xlsx";
		// call getRowSCnt
		int rowscnt=getRowscnt(xlfile, "MySheet1");
		System.out.println("rowescnt="+rowscnt);//5
		
		// read from 'sheet2' sheet
		int rowscnt2=getRowscnt(xlfile, "MySheet2");
		System.out.println("rowescnt="+rowscnt2);//5
		
		// read data from 1,1
		
	String data = readDatafromExcel(xlfile, "MySheet1", 1,1);
	System.out.println("data00="+data);
	
	//   1st row 2nd col
	data =readDatafromExcel(xlfile, "MySheet1",1,2);
	System.out.println("data12="+data);
	
	data = readDatafromExcel(xlfile,"MySheet2",1,1);
	System.out.println("From users sheet , data="+data);
	
	data = readDatafromExcel(xlfile,"MySheet2",1,2);
	System.out.println("From users sheet , data="+data);//100
	
		
		
		
		

	}

}
