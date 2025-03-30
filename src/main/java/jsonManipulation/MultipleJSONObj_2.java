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

public class MultipleJSONObj_2 {
    public static void main(String[] args) throws IOException, ParseException {

       // writeJSONArrayList();
        readJSONArray();
    }


    public static void writeJSONArrayList() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "user 1");
        jsonObject.put("age", 20);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject);
        System.out.println(jsonArray);

        FileWriter fileWriter = new FileWriter("./src/main/resources/users.json");
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.flush(); // save
        fileWriter.close();
    }

    public  static void readJSONArray() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray= (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/users.json"));
        System.out.println(jsonArray);


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "user 2");
        jsonObject.put("age", 23);
        jsonArray.add(jsonObject);

        FileWriter fileWriter = new FileWriter("./src/main/resources/users.json");
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.flush(); // save
        fileWriter.close();


    }
}
