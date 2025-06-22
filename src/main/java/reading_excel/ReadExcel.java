package reading_excel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class ReadExcel {

        public static void main(String[] args) {
            String excelFilePath = "src/main/resources/testData.xlsx"; // Replace with actual path

            // Separate lists for different environments
            List<Map<String, String>> testData = new ArrayList<>();
            List<Map<String, String>> qaData = new ArrayList<>();
            List<Map<String, String>> prodData = new ArrayList<>();

            try (FileInputStream fis = new FileInputStream(excelFilePath);
                 Workbook workbook = new XSSFWorkbook(fis)) {

                Sheet sheet = workbook.getSheetAt(0);
                Iterator<Row> rowIterator = sheet.iterator();

                // Read header row
                List<String> headers = new ArrayList<>();
                if (rowIterator.hasNext()) {
                    Row headerRow = rowIterator.next();
                    for (Cell cell : headerRow) {
                        headers.add(cell.getStringCellValue());
                    }
                }

                // Find index of "Env" column
                int envIndex = headers.indexOf("Env");
                if (envIndex == -1) {
                    throw new RuntimeException("No 'Env' column found in the Excel sheet.");
                }

                // Process data
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    String envKey = getCellValueAsString(row.getCell(envIndex)).toLowerCase();

                    Map<String, String> rowData = new HashMap<>();
                    for (int i = 0; i < headers.size(); i++) {
                        if (i == envIndex) continue;
                        Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                        rowData.put(headers.get(i), getCellValueAsString(cell));
                    }

                    // Store in respective environment variable
                    switch (envKey) {
                        case "test":
                            testData.add(rowData);
                            break;
                        case "qa":
                            qaData.add(rowData);
                            break;
                        case "prod":
                            prodData.add(rowData);
                            break;
                        default:
                            System.out.println("Unknown Env: " + envKey + ", skipping...");
                            break;
                    }
                }

                // ✅ Print to verify
                System.out.println("TEST Data: " + testData);
                System.out.println("QA Data: " + qaData);
                System.out.println("PROD Data: " + prodData);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    private static String getCellValueAsString(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue()).trim().split("\\.")[0];
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue()).trim();
            case FORMULA:
                return cell.getCellFormula().trim();
            case BLANK:
                return "";
            default:
                return "";
        }
    }
}