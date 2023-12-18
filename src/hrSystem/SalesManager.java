package hrSystem;
import java.util.HashMap;

public class SalesManager extends SalesRep {
    private HashMap<Integer, SalesRep> salesTeam;

    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, 0);
        this.salesTeam = new HashMap<>();
    }

    public void addSalesRep(int id, SalesRep salesRep) {
        salesTeam.put(id, salesRep);
    }

    @Override
    public int calculateCommission() {
        int totalCommission = super.calculateCommission(); // Include the manager's own commission
        for (SalesRep rep : salesTeam.values()) {
            totalCommission += rep.calculateCommission();
        }
        return (int) (0.03 * totalCommission);
    }
}
