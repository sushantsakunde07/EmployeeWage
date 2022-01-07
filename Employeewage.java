package Employeewage;

public class Employeewage {
    public static int employeeAttendance() {
        int employeePresent = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == employeePresent)
            System.out.println("Empolyee is present");
        else
            System.out.println("Empolyee is absent");

        return employeePresent;
    }

    public static void main(String[] args) {
        employeeAttendance();
    }
}
