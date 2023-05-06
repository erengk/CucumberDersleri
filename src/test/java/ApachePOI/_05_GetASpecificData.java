package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpecificData {
    public static void main(String[] args) throws IOException {
        /*
         * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
         * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
         * yani metoda "password" kelimesi gönderilecek, dönen değer password un değeri olacak.
         * bulup ve sonucun döndürülmesi için metod kullanınız.
         * src/test/java/ApachePOI/resources/LoginData.xlsx
         */
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Lütfen Aranacak Kelimeyi Giriniz: ");
        String deger = okuyucu.next();

        System.out.println(yazdir(deger));
    }

    public static String yazdir(String deger){
        String aranacak = "";
        String path = "Cucumber_Kursu5/src/test/java/ApachePOI/resource/LoginData.xlsx";
        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheetAt(0);
        }
        catch (Exception e){

        }
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(deger)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    aranacak += sheet.getRow(i).getCell(j) + " ";
                }
            }
        }

        return aranacak;
    }
}
