package arraylists;

public class Banks {
    public static void main(String[] args) {
        java.util.ArrayList<String> banks = new java.util.ArrayList<>();
        banks.add("EquityBank");
        banks.add("Coop Bank");
        banks.add("NCBA Bank");
        banks.add("Stanbic Bank");{
            for(String bank:banks) //enhanced for loop is easy to use
                System.out.println(bank);
        }
    }
}