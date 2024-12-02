package entities;

public class TaxPayer {

    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public TaxPayer() {
    }

    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(Double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        double monthlySalaryIncome = this.getSalaryIncome() / 12;

        if (monthlySalaryIncome >= 3000.00 && monthlySalaryIncome < 5000.00) {
            return this.getSalaryIncome() * 0.10;
        } else if (monthlySalaryIncome >= 5000.00) {
            return this.getSalaryIncome() * 0.20;
        }

        return 0.00;
    }

    public double servicesTax() {
        if (this.getServicesIncome() > 0.00) {
            return this.getServicesIncome() * 0.15;
        }

        return 0.00;
    }

    public double capitalTax() {
        if (this.getCapitalIncome() > 0.00) {
            return this.getCapitalIncome() * 0.20;
        }

        return 0.00;
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        double maxDeductible = grossTax() * 0.3;
        double deductibleExpenses = this.getHealthSpending() + this.getEducationSpending();

        if (maxDeductible > deductibleExpenses) {
            return deductibleExpenses;
        }
        return maxDeductible;
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

    @Override
    public String toString(){
        return "Imposto bruto total: " + String.format("%.2f", grossTax()) +
                "\nAbatimento: " + String.format("%.2f", taxRebate()) +
                "\nImposto devido: " + String.format("%.2f", netTax());
    }
}
