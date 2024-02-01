package NAD;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

public class WeddleRun {
    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processor cores is "+cores);
        Object Records [][][] = new Object[12][6][3];
        for (int i = 0; i <12; i++) {

            int interval = 10;
            for (int j = 0; j <6 ; j++) {
                boolean res = false;
                WeddleConc w = new WeddleConc("1/(x^2+1)", "x",2,1.0, 0.0, interval);
                try{
                    res = w.cal();
                }catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                if(res){
                    Records[i][j][0] = interval;
                    Records[i][j][1] = w.getIntegral();
                    Records[i][j][2] = w.getD();
                    w.clear();
                }
                interval *= 10;
            }
        }

        System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");

        Logger log = LogManager.getLogger(MarkerManager.Log4jMarker.class.getName());

        Workbook workbook = new XSSFWorkbook() ;
        XSSFSheet sheet = (XSSFSheet) workbook.createSheet("demo");

        Map<String, Object[]> data
                = new TreeMap<String, Object[]>();
        data.put("1",
                new Object[] { "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time","",
                        "Intervals", "Answer", "Time"
                });
        for (int i = 0; i < 6; i++) {
            data.put(String.valueOf(i+2), new Object[]{Records[0][i][0],Records[0][i][1],Records[0][i][2],"",
                    Records[1][i][0],Records[1][i][1],Records[1][i][2],"",
                    Records[1][i][0],Records[1][i][1],Records[1][i][2],"",
                    Records[2][i][0],Records[2][i][1],Records[2][i][2],"",
                    Records[3][i][0],Records[3][i][1],Records[3][i][2],"",
                    Records[4][i][0],Records[4][i][1],Records[4][i][2],"",
                    Records[5][i][0],Records[5][i][1],Records[5][i][2],"",
                    Records[6][i][0],Records[6][i][1],Records[6][i][2],"",
                    Records[7][i][0],Records[7][i][1],Records[7][i][2],"",
                    Records[8][i][0],Records[8][i][1],Records[8][i][2],"",
                    Records[9][i][0],Records[9][i][1],Records[9][i][2],"",
                    Records[10][i][0],Records[10][i][1],Records[10][i][2],"",
                    Records[11][i][0],Records[11][i][1],Records[11][i][2]
            });
        }

        Set<String> keyset = data.keySet();

        int rownum = 1;

        for (String key : keyset) {

            // Creating a new row in the sheet
            Row row = sheet.createRow(rownum++);

            Object[] objArr = data.get(key);

            int cellnum = 0;

            for (Object obj : objArr) {

                Cell cell = row.createCell(cellnum++);

                if (obj instanceof Integer)
                    cell.setCellValue((Integer)obj);

                else if (obj instanceof Double)
                    cell.setCellValue((Double) obj);
                else if (obj instanceof Duration)
                    cell.setCellValue(String.valueOf((Duration)obj));

            }
        }


            try {
            FileOutputStream out = new FileOutputStream(new File("E:\\temp\\new.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Excel written successfully..");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
