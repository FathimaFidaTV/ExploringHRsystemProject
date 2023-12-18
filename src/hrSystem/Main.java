package hrSystem;
public class Main {
    public static void main(String[] args) {
        SalesRep rep1 = new SalesRep("John", "Doe", 1234, 30, 180, 10, 50000, 5, 200000);
        SalesRep rep2 = new SalesRep("Alice", "Johnson", 5678, 28, 150, 8, 48000, 4, 180000);

        SalesManager manager = new SalesManager("Jane", "Smith", 9999, 35, 200, 5, 70000, 10);
        manager.addSalesRep(1, rep1);
        manager.addSalesRep(2, rep2);

        System.out.println("John's time to retirement: " + rep1.timeToRetirement());
        System.out.println("John's vacation time left: " + rep1.vacationTimeLeft());
        System.out.println("John's bonus: " + rep1.calculateBonus());
        System.out.println("John's commission: " + rep1.calculateCommission());

        System.out.println("Alice's commission: " + rep2.calculateCommission());

        System.out.println("Jane's time to retirement: " + manager.timeToRetirement());
        System.out.println("Jane's vacation time left: " + manager.vacationTimeLeft());
        System.out.println("Jane's bonus: " + manager.calculateBonus());
        System.out.println("Team commission: " + manager.calculateCommission());
    }
}
