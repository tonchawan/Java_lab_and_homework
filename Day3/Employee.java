package Day3;

public class Employee {
    private int id ;
    private String firstname;
    private String lastname;
    private int salary;
    
    
   
    public Employee () {
    }
   
    public Employee (int id, String firstname,String lastname, int salary) {
        this.id= id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public int getSalary() {
        return salary * 2 ;
    }
    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
    }

    // public String getFullname() {
    //     return firstname + " " + lastname;
    //  }
    //  public void setFullname(String fullname) {
    //      String[] temp = fullname.split(" ");
    //      firstname = temp[0];
    //      lastname = temp[1];
    //  }
 }
 
