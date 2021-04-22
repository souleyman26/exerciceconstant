import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        


        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de places voulez vous acheter ?");
        int by_place = sc.nextInt();
        // System.out.println("vous avez demander "+by_place);

        System.out.println("A quelle rangée voulez vous aller ?");
        int by_where = sc.nextInt();
        // System.out.println("vous voulez la rangée "+by_where);

        System.out.println("\n\t----------------------------------\n");

        for (int i = 0; i < 8; i++) {
            
            System.out.print(i + " | ");

            for (int j = 0; j < 9; j++) {
               
                if (i == by_where) {
                    int[] myArray = new int[];
                    if (j < by_place) {
                        System.out.print("[ X ]");
                    } else {
                        System.out.print("[ _ ]");
                    }   
                } else {
                    System.out.print("[ _ ]");
                }
                
            }
            System.out.print("\n");
        }

        
        System.out.print("    ");
        for (int k = 0; k < 9; k++) {
           System.out.print("  "+k+"  ");
        }

        System.out.print("\n");
    }
}
