package classes_objects;

public class Employee {
    private String name, surname, address;

    public Employee(String name, String surname, String address){
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    public String getEmployeeDetails(){
        return "%s[ name= %s, surname= %s, address= %s ]\n".formatted(this.getClass().getSimpleName(),
                this.name, this.surname, this.address);
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getAddress(){
        return this.address;
    }
    public static void main(String... args){
        var me = new Employee("kamar", "baraka", "Thika");
        System.out.println(me.getEmployeeDetails());
    }
}
