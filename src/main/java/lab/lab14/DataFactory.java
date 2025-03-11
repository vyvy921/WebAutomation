package lab.lab14;

import java.io.*;

public class DataFactory {

    //service method
    public static void readFile(String filePath) {

        System.out.println("Reading data from " + filePath);


        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                System.out.println(dataLine);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String relativePath = "/src/main/java/lab/lab14/data.txt";
        String absolutePath = System.getProperty("user.dir").concat(relativePath);

        DataFactory.readFile(absolutePath);

    }

}
