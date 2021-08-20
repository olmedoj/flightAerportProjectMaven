package file;

import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelFile {

    /*
    public void readExcel(){
        try {
            String ruteExcel = "Data.xlsx";
            FileInputStream inputStream = new FileInputStream(ruteExcel);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator iterator = sheet.iterator();

            DataFormatter formatter = new DataFormatter();
            while (iterator.hasNext()){
                Row nextRow = (Row) iterator.next();
                Iterator cellIterator = nextRow.cellIterator();
                while (cellIterator.hasNext()){
                    Cell cell = (Cell) cellIterator.next();
                    String contentCell = formatter.formatCellValue(cell);
                    System.out.println("Cell: " + contentCell);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    }
*/


}
