/**
 * Q1: Check Employee is present or absent
 */
public class employeepresentorabsent {
    private static int WAGE_PER_HOUR=20;
    private static int TOTAL_HOUR=8;
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

    public static void main(String[] args) {
        employeepresentorabsent emp=new employeepresentorabsent();
        System.out.println("Employee Wage =" + emp.dailywage());
    }
}
