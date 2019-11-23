package banned;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


 	public class Banned_check {
 		
 		// TO READ DATA FROM EXCEL
 		
 		public static final String SAMPLE_XLSX_FILE_PATH = "D:\\ExcelReadAutomated\\ExcelAutomated.xlsx";
 		public static void main(String[] args) throws IOException, InvalidFormatException{
 			Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
 			java.util.Iterator<org.apache.poi.ss.usermodel.Sheet> sheetIterator = workbook.sheetIterator();
 			
 			while (sheetIterator.hasNext()) {
 				org.apache.poi.ss.usermodel.Sheet sheet = sheetIterator.next();
 			}
 			for (org.apache.poi.ss.usermodel.Sheet sheet: workbook) {
 			}
 			workbook.forEach(sheet -> {
          
        });
 			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
 			DataFormatter dataFormatter = new DataFormatter();
 			
 			java.util.Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.rowIterator();
 			while (rowIterator.hasNext()) {
 				Row row = rowIterator.next();
 				java.util.Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
 				
 				while (cellIterator.hasNext()) {
 					Cell cell = cellIterator.next();
 					String cellvalue = dataFormatter.formatCellValue(cell);
 					System.out.print(cellvalue +"\t");
 				}
 				System.out.println();
 				}
 			for(Row row:sheet) {
 				for(Cell cell: row) {
 					String cellValue = dataFormatter.formatCellValue(cell);
 	               
 	            }
 				System.out.println();
 				}
 			sheet.forEach(row -> {
 				row.forEach(cell ->{
 					printCellValue(cell);
 				});
 			});
 			workbook.close();
 			}
 		private static void printCellValue(Cell cell) {
 			switch (cell.getCellTypeEnum()) {
 			case BOOLEAN:
 				break;
 			case STRING:
 				break;
 			case NUMERIC:
 				if (DateUtil.isCellDateFormatted(cell)) {
 			} else {
 		}
 				break;
 			case FORMULA:
 				break;
 			case BLANK:
 				break;
 				default:
 			}	
 		}
 		public static void chrome() {
 			System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
 			WebDriver driver = new ChromeDriver();
 			driver.get("https://www.u-buy.com.au");
 			driver.manage().window().maximize();
 			driver.navigate().to("https://www.ubuy.co.in");
 		}
 	}