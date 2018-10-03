import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Java_ExcelDEMO {
	public static void main(String[] args) {
		try {
			WritableWorkbook workbook = Workbook.createWorkbook(new File("C:/test/test.xls"));	
			WritableSheet sheet = workbook.createSheet("My Sheet", 0);
            
            WritableFont myFont = new WritableFont(WritableFont.createFont("標楷體"), 10);        
            myFont.setColour(Colour.WHITE);            
            WritableCellFormat cellFormat = new WritableCellFormat();
            
            cellFormat.setFont(myFont); // 指定字型
            cellFormat.setBackground(Colour.LIGHT_BLUE); // 背景顏色
            cellFormat.setAlignment(Alignment.CENTRE); // 對齊方式
            
            Label label = new Label(2, 2, "新增測試", cellFormat);
            sheet.addCell(label);
            
            workbook.write(); 
            workbook.close();
            System.out.println("Excel檔案寫入成功");		
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(WriteException ex){
			ex.printStackTrace();
		}
	}

}
