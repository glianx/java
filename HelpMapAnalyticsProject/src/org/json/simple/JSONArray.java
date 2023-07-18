package org.json.simple;
import package org.json.simple.JSONObject;

package org.json.simple.parser.*;

public class JSONArray {
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
