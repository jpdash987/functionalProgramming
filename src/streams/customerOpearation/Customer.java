package streams.customerOpearation;

public class Customer
{
    private int id ;
    private double salary ;
    private String name ;
    private String empCode;
    private int age;
    private String gender ;


    public Customer(int id, double salary, String name, String empCode, int age ,String gender) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.empCode = empCode;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", empCode='" + empCode + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
