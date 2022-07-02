import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenCSVReadOperation {
    public void readFromOpenCSV(){
        try{
            FileReader fileReader =
                    new FileReader("C:\\Users\\dell\\Desktop\\Population.csv");
            CSVReader csvReader = new CSVReader(fileReader);
//String[] rowOne = csvReader.readNext();
// String[] rowTwo = csvReader.readNext();
            while(csvReader.readNext() != null){
                String[] studData = csvReader.readNext();
                for(String data: studData){
                    System.out.println(data);
                }
                System.out.println();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OpenCSVReadOperation ocro = new OpenCSVReadOperation();
        ocro.readFromOpenCSV();
    }
}
