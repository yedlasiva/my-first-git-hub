package ExcelBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilties0 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 // WebUtilities --->  textbox,checkbox,radio btn
		//                  reusable methods  realted to each webelment 
		//  contains resuable methods of excel file 
		//   
String xlfile="C:\\Users\\DELL\\Desktop\\testdata.xlsx";
System.out.println("file="+xlfile);

FileInputStream file=new FileInputStream(xlfile);

//create workbook reference var

// Workbook - Predefined Interface in POI
Workbook wb =	WorkbookFactory.create(file);

Sheet sh = wb.getSheet("MySheet1");
System.out.println(sh);

//sheet contains rows and cells
// Rows count 
int rowsCnt = sh.getLastRowNum();
System.out.println("rowscnt="+rowsCnt);

//Get columns count
//			sh.getLastCellNum();
//sh.getLastCellNum();
int colscnt = sh.getRow(0).getLastCellNum();				
System.out.println("colsCnt="+colscnt);

// Read data from row, cell -  0,0 .toString(); ProductName

       String data00=sh.getRow(0).getCell(0).toString();
       
       System.out.println("data00"+data00);
       
       String data01=sh.getRow(0).getCell(1).toString();
       
       System.out.println("data01="+data01);
       

       String data11=sh.getRow(1).getCell(1).toString();
       System.out.println("data11="+data11);
       




		
		

	}

}
