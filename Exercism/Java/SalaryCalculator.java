public class SalaryCalculator { 
    final private double MAX_FINAL_SALARY = 2000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }
    public double bonusForProductsSold(int productsSold) {
        int multiplier = bonusMultiplier(productsSold);
        return multiplier * productsSold;
    }
    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000 * salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);         
        double finalSalary = baseSalary + bonus;                 
        return finalSalary > MAX_FINAL_SALARY ? MAX_FINAL_SALARY : finalSalary;
    }
}