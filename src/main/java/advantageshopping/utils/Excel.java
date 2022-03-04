package advantageshopping.utils;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {	
	
		private Sheet sh;
		private Cell cell;
		private HashMap<String,Integer> columns = new HashMap<String, Integer>();
		
		public void testExcelFile() throws IOException {
				File file = new File("./login.xlsx");
				FileInputStream fis = new FileInputStream(file);
				Workbook wk = new XSSFWorkbook(fis);
				sh = wk.getSheetAt(0);
				for (Cell rows : sh.getRow(0)) {
					columns.put(rows.getStringCellValue(), rows.getColumnIndex());
				}

		}
		
		public String getCellData(int rownum, int colnum) throws IOException {
				cell = sh.getRow(rownum).getCell(colnum);
				String CellData = null;
				if(cell.getCellType() == Cell.CELL_TYPE_STRING) {
					CellData = cell.getStringCellValue();
				}
				if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					if (DateUtil.isCellDateFormatted(cell)) {
						CellData = String.valueOf(cell.getDateCellValue());
					} else {
						CellData = String.valueOf((long) cell.getNumericCellValue());
					}
				}
				if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
					CellData = Boolean.toString(cell.getBooleanCellValue());
				}
				if(cell.getCellType() == Cell.CELL_TYPE_BLANK) {
					CellData = "";
				}
				return CellData;
			}
		public String getCellData(String columnName, int rownum) throws IOException {
			return getCellData(rownum, columns.get(columnName));
		}
		}
	
    