package nyc.c4q.abassawo;
/**
 * Created by c4q-Abass on 3/24/15.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BlueBook {

    public static ArrayList<Car> getCars() {
        ArrayList<Car> blueBook = new ArrayList<Car>();    //Array List of Type Car.
        Car sedan = new Car("Nissan", "Quest", 1996, 2000.00);  //make, model, year, and dollar amount
        Car mercedes = new Car("Mercedes", "Benz", 2015, 500000);
        Car honda = new Car("Honda", "Civic", 1991, 2400);
        blueBook.add(sedan);
        blueBook.add(mercedes);
        blueBook.add(honda);
        return blueBook;  //returns array type.
    }

    public static Car queryUser() {
        Scanner input = new Scanner(System.in);
        String userMake, userModel;
        int userYear;
        System.out.println("What is your car's make, model?");
        userMake = input.next();
        System.out.println("What is your car's modeL");
        userModel = input.next();
        System.out.println("What is your car's manufacture year?");
        userYear = input.nextInt();
        Car c = new Car(userMake, userModel, userYear, 0.00);
        return c;
    }

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        ArrayList<Car> blueBook = getCars();
        boolean makeMatch, modelMatch, yearMatch;
        makeMatch = false;
        modelMatch = false;
        yearMatch = false;   //initializing match booleans.
        Car c = queryUser();

        for (int i = 0; i <= blueBook.size() - 1; i++) {
            if (c.getMake().equals(blueBook.get(i).getMake())) {
                makeMatch = true;
                System.out.println(makeMatch);
            }
            if (c.getModel().equals(blueBook.get(i).getModel())) {
                modelMatch = true;
                System.out.println(modelMatch);
            }
            if (c.getYear() == blueBook.get(i).getYear()) {
                yearMatch = true;
                System.out.println(yearMatch);
            }
            while (makeMatch && modelMatch && yearMatch) {  //wrong output.
                System.out.println("Your car costs about " + "$" + decimalFormat.format(blueBook.get(i).getPrice()));
                return;
            }

        }

        if ((makeMatch == false) || (modelMatch == false) || (yearMatch = false)) {
            System.out.println("I'm sorry. We don't have that vehicle...But we can add it to our inventory list");
            blueBook.add(c);
            return;
        }
    }
}
 //Logical Error persists.