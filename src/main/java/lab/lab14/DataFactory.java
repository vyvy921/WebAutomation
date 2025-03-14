package lab.lab14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<Person> convertDataIntoPersonList(String filePath) {

        List<Person> personList = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {
            String readline = bufferedReader.readLine();
            while (readline != null) {
                String[] personData = readline.split(";");

                String name = personData[0];
                int age = Integer.parseInt(personData[1]);
                int salary = Integer.parseInt(personData[2]);

                Person person = new Person(name, age, salary);
                personList.add(person);

                readline = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            e.printStackTrace();
        }


        return personList;
    }

    public static void main(String[] args) {
        String relativePath = "/src/main/java/lab/lab14/data.txt";
        String absolutePath = System.getProperty("user.dir").concat(relativePath);

        //DataFactory.readFile(absolutePath);
        List<Person> personList = DataFactory.convertDataIntoPersonList(absolutePath);
        System.out.println(personList);

    }

}
