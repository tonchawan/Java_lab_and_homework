package tda.Day3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference; // พิมพ์ไว้นอก Class
import com.fasterxml.jackson.databind.ObjectMapper; // พิมพ์ไว้นอก Class

public class EmployeeInstance {
    public static void main(String[] args){

        // Employee employee1 = new Employee(1001, "Capton","Marvel", 1000);
        
    
        ObjectMapper objectMapper = new ObjectMapper();
        // Employee dang = new Employee(1001, "Dang", "Red", 10000);


    
        String json2 = "{ \"id\" : 1001, \"firstname\" : \"Captain\", \"lastname\" : \"Marvel\", \"salary\" : 30000 }";


   
        
        String json3 =    "{\"id\":\"1001\",\"firstname\":\"Luke\",\"lastname\":\"Skywalker\",\"company\":\"Walt Disney\",\"salary\":\"40000\"}";
        String json4 =     "{\"id\":\"1002\",\"firstname\":\"Tony\",\"lastname\":\"Stark\",\"company\":\"Marvel\",\"salary\":\"1000000\"}";
        String json5 =     "{\"id\":\"1003\",\"firstname\":\"Somchai\",\"lastname\":\"Jaidee\",\"company\":\"Love2work\",\"salary\":\"20000\"}";
        String json6 =     "{\"id\":\"1004\",\"firstname\":\"Monkey D\",\"lastname\":\"Luffee\",\"company\":\"One Piece\",\"salary\":\"9000000\"}";

        List<String> jsonHw = new ArrayList<>();
        jsonHw.add(json3);
        jsonHw.add(json4);
        jsonHw.add(json5);
        jsonHw.add(json6);

        String json7 = "[{\"id\":\"1001\",\"firstname\":\"Luke\",\"lastname\":\"Skywalker\",\"company\":\"Walt Disney\",\"salary\":\"40000\"},"+
        "{\"id\":\"1002\",\"firstname\":\"Tony\",\"lastname\":\"Stark\",\"company\":\"Marvel\",\"salary\":\"1000000\"},"+
        "{\"id\":\"1003\",\"firstname\":\"Somchai\",\"lastname\":\"Jaidee\",\"company\":\"Love2work\",\"salary\":\"20000\"},"+
        "{\"id\":\"1004\",\"firstname\":\"Monkey D\",\"lastname\":\"Luffee\",\"company\":\"One Piece\",\"salary\":\"9000000\"}]";

        // for (String string : jsonHw) {

            try {
                // HashMap<String, Object>  map = objectMapper.readValue(string , new TypeReference<HashMap<String,Object>>(){});
                // System.out.println(map.get("firstname")); // Captain
                Employee[]  map = objectMapper.readValue(json7 , Employee[].class);
                for (Employee employee : map) {
                    System.out.println(employee.getFirstname()); // Captain

                    
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("JSON parse error :" + jsonHw + e.getMessage());
            }
            
        // }

        

        


}       
}
