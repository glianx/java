//program for reading a JSON file

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.*;

 

public class JSON

{

            public static void main(String args[])

            {

                        // file name is File.json

                        Object o = new JSONParser().parse(new FileReader(File.json));

                        JSONObject j = (JSONObject) o;

                        String Name = (String) j.get(“Name”);

                        String College = (String ) j.get(“College”);

 

                        System.out.println(“Name :” + Name);

                        System.out.println(“College :” +College);

}

} 