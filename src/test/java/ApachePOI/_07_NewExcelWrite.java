package ApachePOI;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa1");

        Row newRow = sheet.createRow(0);
        Cell newCell = newRow.createCell(0);

        newCell.setCellValue("Merhaba Dünya");

        String path = "Cucumber_Kursu5/src/test/java/ApachePOI/resource/newExcel.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
        System.out.println("işlemler tamamlandı");


    }
}