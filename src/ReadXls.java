import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadXls {

  private static HSSFWorkbook workbook;
  private static List<Content> contents = new ArrayList<>();

  public static List<Content> readXls(String name) throws IOException {
	//fichier récupéré
    FileInputStream file = new FileInputStream(new File(name));
    workbook = new HSSFWorkbook(file);
    HSSFSheet sheet = workbook.getSheetAt(0); //premiere page

    int row = 1; //ligne
    int columnFR = 0; // colonne FR
    int columnEN = 1; //colonne EN
    Cell cellFR;
    Cell cellEN;
    Content content;
    for(int i = 0; sheet.getRow(row) != null; row++, i++)
    {
      cellFR = sheet.getRow(row).getCell(columnFR); //celulle
      cellEN = sheet.getRow(row).getCell(columnEN); //celulle
      
      content = new Content();
      
      content.addLabel("EN", cellEN.getStringCellValue());
      content.addLabel("FR", cellFR.getStringCellValue());
      content.set_id(i);
      content.set_class("CountryEntity");
      contents.add(content);
    }
    file.close();
    return contents;
  }
}
