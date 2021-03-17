public class Main {
    public static void main(String[] args) {
        long Balance = 2_000_000_000;
        int IncomingTransfer = 500_000_000;
        long NewBalance = Balance + IncomingTransfer;
        System.out.println(NewBalance);
    }
}
