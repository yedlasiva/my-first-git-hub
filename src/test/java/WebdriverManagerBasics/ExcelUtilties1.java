package WebdriverManagerBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilties1 {
	
	public static int getrowscnt(String xlfile,String sheetName) throws EncryptedDocumentException, IOException 
	{//String xlfile="\"C:\\Users\\DELL\\Desktop\\testdata.xlsx";
	FileInputStream fis=new FileInputStream(xlfile);
	//wb
	Workbook wb=WorkbookFactory.create(fis);
	//sheet
	Sheet sh = wb.getSheet(sheetName);
	int rowscnt =sh.getLastRowNum();
//	System.out.println("rowsCnt="+rowsCnt);//  3  actual cnt = 4
	return rowscnt+1;
	}
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String xlfile="C:\\Users\\DELL\\Desktop\\testdata.xlsx";
		
		// call getRowSCnt
		
		int rowscnt2=getrowscnt(xlfile, "MySheet1");
		System.out.println("rowsCnt2="+rowscnt2);// 5
		
		// read from 'users' sheet2
		int rowscnt21=getrowscnt(xlfile, "mysheet2");
		
		System.out.println("rowsCnt3="+rowscnt21);
		
		
		
		

	}

}
