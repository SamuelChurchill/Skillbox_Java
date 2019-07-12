public class Main {
    public static void main(String[] args) {
        int bilNumber = 0;

        for (; bilNumber <= 235000; bilNumber++) {
            System.out.print("Номер билета: ");

            if((bilNumber >= 200000) && (bilNumber <= 210000)){
                System.out.print(bilNumber);
            }
            else if ((bilNumber >= 220000) && (bilNumber <= 235000)){
                System.out.print(bilNumber);
            }

            System.out.println();
        }
    }
}
