package lab.lab14.lesson;

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

    private static void savePersonList(List<Person> personList, String filePath) {


        if (personList == null || filePath == null) {
            throw new IllegalArgumentException("Person list or filePath is null");
        }

        if (personList.isEmpty()) return;

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);) {
            for (Person person : personList) {

                String name = person.getName();
                int age = person.getAge();
                int salary = person.getSalary();

                String writeLine = name.concat(";").concat(String.valueOf(age)).concat(";").concat(String.valueOf(salary));
                bufferedWriter.write(writeLine);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String relativePath = "/src/main/java/lab/lab14/data.txt";
        String absolutePath = System.getProperty("user.dir").concat(relativePath);

        //DataFactory.readFile(absolutePath);
        List<Person> personList = DataFactory.convertDataIntoPersonList(absolutePath);
        System.out.println(personList);

        //Write file
        String saveFilePath = "/src/main/java/lab/lab14/person.txt";
        String absuluteSavePath = System.getProperty("user.dir").concat(saveFilePath);


        Person emp1 = new Person("An", 20, 20000);
        Person emp2 = new Person("Binh", 30, 30000);
        Person emp3 = new Person("Cuong", 40, 40000);
        List<Person> employeeList = Arrays.asList(emp1, emp2, emp3);

        DataFactory.savePersonList(employeeList, absuluteSavePath);

    }

}
