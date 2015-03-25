package nyc.c4q.abassawo;
// * Created by c4q-Abass on 3/24/15.
import java.util.ArrayList;
import java.util.Scanner;
public class NameTracker {

    public static void main(String [] args) {
        ArrayList<String> names = new ArrayList();
        Scanner newName = new Scanner(System.in);
        String name;
        //names.add("Ana");

        System.out.println("Add some name to the list");
        while (true) {


            name = newName.nextLine().toLowerCase();
            if(name.equals("")){
                break;
            }
            names.add(name);
        }
        System.out.println("Your " + names.size() + " name(s) are saved!");

        for (int i = names.size() - 1; i >= 0 ; --i) {   // *  - 1
        // String nameList = names.get(i);
            System.out.println("Your names are " + names.get(i));
        }
        System.out.println(names.contains("abass".toLowerCase()));
    }
}
