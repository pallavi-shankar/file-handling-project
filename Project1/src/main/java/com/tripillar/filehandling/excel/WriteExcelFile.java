package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.*;
        import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args) {
        String path = "C:/Users/palla/OneDrive/Desktop/outputt.xlsx"; // Update this path

        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream fos = new FileOutputStream(path)) {
            Sheet sheet = workbook.createSheet("Sample Sheet");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Hello, this is a sample Excel file.");

            workbook.write(fos);
            System.out.println("Excel file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
