package classes_objects;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Badge {
    private static int numberOfEmployees;
    private String badgeIdCode;
    private Employee employee;

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateIdCodes();
    }

    public static void keepTrackOfEmployeesNumber(){
        numberOfEmployees++;
    }
    private String generateIdCodes(){
        var rand = new Random();
        return "%s%s%s%s%s%s%s%s\n".formatted(Character.toChars(rand.nextInt(1, 27)),
                Character.toChars(rand.nextInt(1, 27)), Character.toChars(rand.nextInt(1, 27)),employee.getName(),
                        employee.getSurname(),
                        Character.toChars(rand.nextInt(1, 27)), Character.toChars(rand.nextInt(1, 27)),
                                Character.toChars(rand.nextInt(1, 27)));
    }
    public void showBadgeDetails(){
        System.out.printf("the number of employees= %s\n", numberOfEmployees);
        System.out.printf("details = %s\n", employee.getEmployeeDetails());
        System.out.printf("badgeIdCode= %s\n", this.badgeIdCode);
    }

    public static void main(String... args){
        var me = new Employee("kamar", "baraka", "Thika");
        var you = new Employee("kahindi", "kombe", "Nairobi");
        var meBadge = new Badge(me);
        var youBadge = new Badge(you);
        meBadge.showBadgeDetails();
    }
}
