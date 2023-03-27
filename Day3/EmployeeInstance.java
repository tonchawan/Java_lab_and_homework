package Day3;
import com.fasterxml.jackson.core.type.TypeReference; // พิมพ์ไว้นอก Class
import com.fasterxml.jackson.databind.ObjectMapper; // พิมพ์ไว้นอก Class

public class EmployeeInstance {
    public static void main(String[] args){

        Employee employee1 = new Employee(1001, "Capton","Marvel", 1000);
        
    
    
    ObjectMapper objectMapper = new ObjectMapper();
    Employee dang = new Employee(1001, "Dang", "Red", 10000);

    try {
    objectMapper.writeValue(new File("target/employee.json"), dang);
    } catch (IOException ex) {
    System.out.println("There's something wrong with target/employee.json " + 
    ex.getMessage());
    }

    try {
        String employeeAsString = objectMapper.writeValueAsString(dang);
        System.out.println(employeeAsString);
     // {"id":1001,"firstname":"Dang","lastname":"Red","salary":10000}
     } catch (JsonProcessingException ex) {
     System.out.println("There's something wrong with writeValueAsString: " + 
     ex.getMessage());
     }

     try{
        Employee dang2 = objectMapper.readValue(new File("target/employee.json"), Employee.class);
       System.out.println(dang2.getFirstname()); // Dang
    } catch (IOException ex) {
        System.out.println("JSON parse to Employee object error " + ex.getMessage());
    }

}       
}
