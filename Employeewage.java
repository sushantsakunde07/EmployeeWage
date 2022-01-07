package Employeewage;

public class Employeewage {
    public static final int	isFullTime=1;
    public static final int partTime=2;
    public static final int empRatePerHour=20;
    public static int employeeDailyWage() {
            int employeehour=0;
            int employeeWage =0;
            int empcheck=(int)Math.floor(Math.random()* 10)% 3;
        switch ((int)empcheck) {
            case isFullTime:
                employeehour=8;
                break;
            case partTime:
                employeehour=4;
                break;
            default:
                employeehour=0;
        }
            employeeWage = employeehour * empRatePerHour;
            System.out.println("empolyee wage:"   + employeeWage  );

        return isFullTime;
    }

    public static void main(String[] args) {
        employeeDailyWage();
    }
}
