import java.util.Scanner;

class testcalcs{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to calculate[Y or N]");
        String uses = scan.nextLine().toUpperCase();

        scan.close();
    }
}