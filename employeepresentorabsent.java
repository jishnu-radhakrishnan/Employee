/**
 * Q1: Check Employee is present or absent
 */
public class employeepresentorabsent {
    private static int WAGE_PER_HOUR=20;
    private static int TOTAL_HOUR=8;
    
    //To check employee is present or absent
    
    public boolean empPresent(){
        boolean ifempPres=false;
        double random_value= Math.random();
        System.out.println(random_value);
        if (random_value>0 && random_value<=0.5){
            ifempPres =false;
        }
        if (random_value>0.5 && random_value<=1){
            ifempPres =true;
        }
        return ifempPres;
    }
    
    //To get daily wage
    public int dailywage(){
        int daily_wage=0;
        boolean e=empPresent();
        if (e){
            System.out.println("Today Employee is present");
            daily_wage= WAGE_PER_HOUR*TOTAL_HOUR;
        }else{
            System.out.println("Today Employee is absent");
            daily_wage=0;
        }
        return daily_wage;
    }
    //To get monthly wage
    public double monthlywage () {
        double monthly_wage=0.0;
        int p= dailywage();
        int i=0;
        if (p==0){
            System.out.println("Employee Wage for the day="+ p);
            System.out.println("Employee is not present on all days");
            i=0;}
        else{
            System.out.println("Employee Wage for the day="+ p);
            System.out.println("Employee is present on all days");
            i=1;}
        switch (i) {
            case 1:
                monthly_wage = 20 * WAGE_PER_HOUR * TOTAL_HOUR;
                break;
            case 0:
                monthly_wage = 0;
                break;
        }
        return monthly_wage;
    }

    public static void main(String[] args) {
        employeepresentorabsent emp=new employeepresentorabsent();
        System.out.println("Employee Wage for the month="+ emp.monthlywage());
    }
}
