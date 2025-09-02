public class EmployeeSalarySlip {
    public static void main(String[] args) {
        String[] names = {"Anshika", "Kaushal", "Kritika", "Divyanshu"};
        int[] basicSalary = {40000, 50000, 30000, 60000};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int basic = basicSalary[i];
            double hra = 0.20 * basic; 
            double da = 0.10 * basic;   
            double gross = basic + hra + da;
            double tax = 0;
            if (gross > 50000) {
                tax = 0.10 * gross;
            }
            double netSalary = gross - tax;            
            System.out.println("---------------------------");
            System.out.println("Salary Slip for: " + name);
            System.out.println("Basic Salary: " + basic);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Gross Salary: " + gross);
            System.out.println("Tax: " + tax);
            System.out.println("Net Salary: " + netSalary);
        }
    }
}


