package sample;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFromFile {

    private static ArrayList<student> students = new ArrayList<>();
    public static JSONArray jsonArray = new JSONArray();



    public static void readDataFromFile(File file) throws FileNotFoundException {
        Scanner cin=new Scanner(file);

        while (cin.hasNext()){

            String line=cin.nextLine();
            String informations[];

            informations=line.split(",");

            student studentInfo=new student(informations[0],informations[1],informations[2]);

            students.add(studentInfo);
        }

        convertToJsonARRy();
    }

    public static void convertToJsonARRy() {

        try {

            for (student select : students) {

                JSONObject info = new JSONObject();

                info.put("Student Name", select.getStudent_name());
                info.put("Student Roll", select.getStudent_roll());
                info.put("Student Mail", select.getStudent_name());

                jsonArray.put(info);

            }

        } catch (Exception e) {
            System.out.println("Faild to read Text File: " + e.getMessage());
        }

    }
}
