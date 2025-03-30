package jsonManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchData {
    public static void main(String[] args) throws IOException, ParseException {
        JSONObject stuObj= searchStudent("100");
        System.out.println(stuObj);

//        String name=stuObj.get("name").toString();
//        System.out.println(name);
    }

    public static JSONObject searchStudent(String searchId) throws IOException, ParseException, IOException, ParseException {
        String filePath="./src/main/resources/students.json";
        JSONParser parser=new JSONParser();
        JSONArray jsonArray= (JSONArray) parser.parse(new FileReader(filePath));

        for(Object obj: jsonArray){
            JSONObject jsonObject= (JSONObject) obj;
            String id= (String) jsonObject.get("id");
            if(id.equals(searchId)){
                return jsonObject;
            }
        }
        return new JSONObject();
    }
}
