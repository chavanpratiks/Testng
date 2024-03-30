package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class Datadrivenframework {
	String fpath = "C:\\Excel\\Files\\Abhishek.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
  @Test
  public void writetoexcel() {
	  row = sheet.createRow(0);
	  cell =row.createCell(0);
	  cell.setCellValue("Abhishek");
	  
	  
 
	  
  }
	  
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File(fpath);
	  fos= new FileOutputStream(file);
	  wb= new XSSFWorkbook();
	  sheet = wb.createSheet("Test sheet");
	  
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  fos.close();
	  wb.close();
	  
  }

}
