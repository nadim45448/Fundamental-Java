package jsonManipulation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyJSONobj_1 {
    public static void main(String[] args) throws IOException, ParseException {
        readJson();
    }


    public static void  writeJson() throws IOException {
        JSONObject jsonobj = new JSONObject();
        jsonobj.put("name","Test User");
        jsonobj.put("department","IT");
        jsonobj.put("designation","ML Engineer");
        jsonobj.put("address","Gulshan");

//        System.out.println(jsonobj);
        FileWriter fileWriter = new FileWriter("./src/main/resources/emp.json");
        fileWriter.write(jsonobj.toJSONString());
        fileWriter.flush(); // save
        fileWriter.close();
        // ctrl + alt+ L
    }

    public static void readJson() throws IOException, ParseException {
        JSONParser parser = new JSONParser(); // string theke json object e convert korbo
       JSONObject jsonObj= (JSONObject) parser.parse(new FileReader("./src/main/resources/emp.json"));
        // parse = convert from string to object
        System.out.println(jsonObj);
        System.out.println(jsonObj.get("name"));
        String name = (String) jsonObj.get("name"); // 1
        String designation = jsonObj.get("designation").toString(); //2
        System.out.println(name);
        System.out.println(designation);


    }
}
