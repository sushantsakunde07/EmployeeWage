package Employeewage;

public class Employeewage {
    public static int employeeDailyWage() {
            int	isFullTime=1;
            int empRatePerHour=20;
            int employeehour=0;
            int employeeWage =0;
            int empcheck=(int)Math.floor(Math.random()* 10)% 2;
            if (empcheck==isFullTime)
                employeehour=8;
            else
                employeehour=0;
            employeeWage = employeehour * empRatePerHour;
            System.out.println("empolyee wage:"   + employeeWage  );

        return isFullTime;
    }

    public static void main(String[] args) {
        employeeDailyWage();
    }
}
