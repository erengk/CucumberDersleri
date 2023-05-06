package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _08_Tasks {
    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("ÇarpımTablosu");

        for (int a = 0; a < 10; a++) {
            for (int i = 0; i < 10; i++) {
                Row newRow = sheet.createRow(i);
                for (int j = 0; j < 5; j++) {
                    Cell newCell = newRow.createCell(j);
                    newCell.setCellValue("");
                }
            }
            sheet.createRow(sheet.getPhysicalNumberOfRows());
        }
    }
}
