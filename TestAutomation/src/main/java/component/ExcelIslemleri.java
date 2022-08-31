package component;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class ExcelIslemleri {

    public String reedExcel(int coll ,int  coll2) throws IOException {
        FileInputStream file = new FileInputStream(new File("data.xlsx"));

        Workbook workbook = new XSSFWorkbook(file);
        Sheet firstSheet = workbook.getSheetAt(0);
        Row row=firstSheet.getRow(coll);
        Cell cell = row.getCell(coll2);

        return cell.toString();
        //System.out.println(cell.getStringCellValue());
    }
}
