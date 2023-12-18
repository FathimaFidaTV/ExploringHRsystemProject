package hrSystem;

public class SalesRep extends Employee {
	 private double salesMade;

     public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
         super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
         this.salesMade = salesMade;
     }

     public int calculateCommission() {
         return (int) (0.1 * salesMade);
     }
}
