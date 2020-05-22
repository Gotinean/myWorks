package Hire;

public class TopManager implements Employee {
    private final Company company;
    private double salary;
    public TopManager(Company company){
        this.company = company;
    }
    @Override
    public double getMonthSalary() {
        int rate = 50000;
        double income = company.getIncome();
        if(income > 10000000){
            salary = rate + rate*1.5;
        }
        else {
            salary = rate;
        }
        return salary;
    }
    @Override
    public double getSale() {
        return 0;
    }

}


