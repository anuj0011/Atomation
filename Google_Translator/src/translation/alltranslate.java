package translation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class alltranslate {

    public static void main(String[] args) throws IOException {
    	
    	
    	FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\ExcelAutomated.xlsx"));
    	XSSFWorkbook workbook = new XSSFWorkbook(file);
    	XSSFSheet sheet = workbook.getSheetAt(0);

    	for (int i=0; i<= sheet.getLastRowNum(); i++)
    	{ 
    	String text = sheet.getRow(i).getCell(0).getStringCellValue();
    	
        System.out.println("" + translate("en", "de", text));
        String trantext = translate("en", "ja", text);
        
     // TO WRITE DATE IN EXCEL
        
        FileWriter fw = new FileWriter("D:\\ExcelWriteAutomated\\userreview.text",true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		
		//String encoded = URLEncoder.encode(trantext, "UTF-8");
		pw.println(trantext);
		pw.flush();
		pw.close();
        
		System.out.println("anu");
		
		
		
		
    	}
    		
    }
     
    
    
    private static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOU URL HERE
        String urlStr = "https://script.google.com/macros/s/AKfycbx4WxS_cC1T5hSAoqia-MN3kLx-GM7kQLC7aFm1JSRjUNFkxkgK/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

}
