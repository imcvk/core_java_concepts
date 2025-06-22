package test;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SeleniumPractice {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
//        File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(ss,new File("D:\\CODE\\java\\sts\\core_java\\src\\main\\resources"));

//        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testData.xlsx");
//        Workbook workbook = new XSSFWorkbook(fileInputStream);
//        Sheet sheet = workbook.getSheetAt(0);
//        for (Row row : sheet) {
//            for (Cell cell : row) {
//                switch (cell.getCellType()) {
//                    case STRING:
//                        System.out.print(cell.getStringCellValue() + " ");
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue() + " ");
//                        break;
//                    default:
//                        System.out.print("UNKNOWN ");
//                }
//            }
//            System.out.println();
//        }

        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()","//button");
    }
}
