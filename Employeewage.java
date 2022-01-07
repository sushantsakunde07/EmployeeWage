package Employeewage;

public class Employeewage {
    public static int employeeDailyWage() {
            int	isFullTime=1;
            int partTime=2;
            int empRatePerHour=20;
            int employeehour=0;
            int employeeWage =0;
            int empcheck=(int)Math.floor(Math.random()* 10)% 3;
            if (empcheck==isFullTime)
                employeehour=8;
            else if (empcheck==partTime)
                employeehour=4;
            employeeWage = employeehour * empRatePerHour;
            System.out.println("empolyee wage:"   + employeeWage  );

        return isFullTime;
    }

    public static void main(String[] args) {
        employeeDailyWage();
    }
}
