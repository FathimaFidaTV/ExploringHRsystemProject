package hrSystem;

public class Employee implements User{
	 public String firstName;
	 public String lastName;
	 public int registration;
	 public int age;
	 public int daysWorked;
	 public int vacationDaysTaken;
	 public double salary;
	 public int yearsWorked;
     
     public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.registration = registration;
         this.age = age;
         this.daysWorked = daysWorked;
         this.vacationDaysTaken = vacationDaysTaken;
         this.salary = salary;
         this.yearsWorked = yearsWorked;
     }

     public int timeToRetirement() {
         return Math.min(60 - age, 40 - yearsWorked);
     }

     public int vacationTimeLeft() {
         return (int) ((daysWorked / 360.0) * (30 - vacationDaysTaken)); // Corrected integer division to double division
     }

     public int calculateBonus() {
         return (int) (2.2 * salary);
     }

     @Override
     public String getUsername() {
         return firstName + lastName + registration;
     }

     @Override
     public String getPassword() {
         return "password"; // TODO: Implement secure password hashing and storage
     }

     @Override
     public boolean login(String username, String password) {
         return username.equals(getUsername()) && password.equals(getPassword());
     }
 }

