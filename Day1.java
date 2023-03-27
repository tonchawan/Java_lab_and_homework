import java.util.ArrayList;
import java.util.HashMap;

class Day1{
    public static void main(String[] arg){

        String[] rawData = {
            "id:1001 firstname:Luke lastname:Skywalker",
            "id:1002 firstname:Tony lastname:Stark",
            "id:1003 firstname:Somchai lastname:Jaidee",
            "id:1004 firstname:MonkeyD lastname:Luffee"
          };
        System.out.println(rawData[0]);

        
        // HW 1.1
        HashMap<String , Object> man = new HashMap<>();
        man.put("id", 1001 );
        man.put("firstname", "Luke");
        man.put("lastname", "Skywalker");

        HashMap<String , Object> man2 = new HashMap<>();
        man2.put("id", 1002 );
        man2.put("firstname", "Tony");
        man2.put("lastname", "Stark");

        HashMap<String , Object> man3 = new HashMap<>();
        man3.put("id", 1003 );
        man3.put("firstname", "Somchai");
        man3.put("lastname", "Jaidee");

        HashMap<String , Object> man4 = new HashMap<>();
        man4.put("id", 1004 );
        man4.put("firstname", "MonkeyD");
        man4.put("lastname", "Luffee");

        ArrayList<HashMap<String, Object>> employees = new ArrayList<>();
        employees.add(man);
        employees.add(man2);
        employees.add(man3);
        employees.add(man4);

        for (HashMap<String,Object> manElement:employees){
            int id = (int) manElement.get("id");
            String firstname = manElement.get("firstname").toString();
            String lastname = manElement.get("lastname").toString();
            System.out.println("id:" + id + " firstname:" + firstname +" lastname:" + lastname);
        }


        // HW. 1.2
        ArrayList<HashMap<String, Object>> peopleData = new ArrayList<>();

        for (String data : rawData) {
          String[] keyValuePairs = data.split(" ");
          HashMap<String, Object> personInfo = new HashMap<>();
          
          for (String pair : keyValuePairs) {
            String[] pairArr = pair.split(":");
            String key = pairArr[0];
            Object value = pairArr[1];
            
            personInfo.put(key, value);
          }
          
          peopleData.add(personInfo);
        }
        for (HashMap<String, Object> personInfo : peopleData) {
            System.out.println("ID: " + personInfo.get("id"));
            System.out.println("First Name: " + personInfo.get("firstname"));
            System.out.println("Last Name: " + personInfo.get("lastname"));
            System.out.println();
          }



    }

}