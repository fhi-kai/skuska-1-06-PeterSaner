import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj prve cislo: ");
        //treba pouzit ciarku!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int x = sc.nextInt();
        System.out.println("Zadaj druhe cislo: ");
        int y = sc.nextInt();
        if (x != 0) {
            x %= 10;
            y %= 10;
            if (x == y) {
                System.out.printf("true ");
            }
            else if (y !=0) {
                x /= 10;
                y /= 10;
                System.out.printf("true ");
            }
            else{
                System.out.printf("false ");
            }
        }
    }
}
