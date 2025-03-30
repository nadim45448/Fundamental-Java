package jsonManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.text.html.parser.Parser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_1 {
    public static void main(String[] args) throws IOException, ParseException {

        //readJson();
//        writeJsonArrAy();
       // readJsonArray();
        writeJson();
    }

    public static void writeJson() throws IOException {
        JSONObject object = new JSONObject();
        object.put("name", "Nadim");
        object.put("mobile", "018321456985");
        object.put("designation", "Software Engineer");
//        object.put("address", "Mirpur");
        JSONObject address = new JSONObject();
        address.put("House", 100/1);
        address.put("thana", "Gulshan");
        object.put("address",address);

        FileWriter writer = new FileWriter("./src/main/resources/emp1.json");
        writer.write(object.toJSONString());
        writer.flush();
        writer.close();
    }

    public static void readJson() throws IOException, ParseException {
//        FileReader reader = new FileReader("./src/main/resources/emp1.json");
////        System.out.println(reader.toString());
//
//        JSONParser parser = new JSONParser();
//        parser.parse(reader);
////        System.out.println(parser);
//
//        Object obj = parser;
////        System.out.println(obj);
//
//        JSONObject object =parser;

        JSONParser parser = new JSONParser();
//        Object object=  parser.parse(new FileReader("./src/main/resources/emp1.json"));
        JSONObject object1 = (JSONObject) parser.parse(new FileReader("./src/main/resources/emp1.json"));
//        System.out.println(object1);
//        System.out.println(object1.get("address"));
       JSONObject obj = (JSONObject) object1.get("address");
//        System.out.println(obj);
        String st = (String) obj.get("thana");
        System.out.println(st);




    }

    public static void writeJsonArrAy() throws IOException {
        JSONObject object = new JSONObject();
        object.put("name", "Nadim");
        object.put("Departmet", "CSE");

        JSONArray array = new JSONArray();
        array.add(object);
//        System.out.println(array);

        FileWriter writer = new FileWriter("./src/main/resources/users1.json");
        writer.write(array.toJSONString());
        writer.flush();
        writer.close();

        // multiple value add korar jonno age read korte hobe
        // json file er vitore age thekei [] diye rakhbo


    }

    public static void readJsonArray() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(new FileReader("./src/main/resources/users1.json"));
//        System.out.println(array);

        JSONObject jsonObject = new JSONObject();
       jsonObject.put("name", "Anas");
       jsonObject.put("dept", "Islamic Studies");
        array.add(jsonObject);

        FileWriter fileWriter = new FileWriter("./src/main/resources/users1.json");
        fileWriter.write(array.toJSONString());
        fileWriter.flush(); // save
        fileWriter.close();

//       System.out.println(array);




    }

}
