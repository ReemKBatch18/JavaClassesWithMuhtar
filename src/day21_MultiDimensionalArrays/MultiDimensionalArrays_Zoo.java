package day21_MultiDimensionalArrays;

public class MultiDimensionalArrays_Zoo {
    public static void main(String[] args) {

        String [] wild = {"Tiger", "Lion", "Monkey", "Crocodile", "Turtle"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};
        //                   0        1          2         3

        String [][]zoo = {wild , birds};
        //                 0       1

        String kfc = zoo[1][3]; // "Chicken
        System.out.println(kfc); // Chicken

        System.out.println("============================================");

        // Use for each loop to print wild animals from zoo except for turtle
        // then print birds from zoo except for chicken
        for (String eachBird : zoo [1] ){ // this will execute 4 times
            if (eachBird.equals( "Chicken")){
                continue;
            }
            System.out.println(eachBird);
        }

        System.out.println("==============================================");

        for ( String eachWild : zoo [0]){ // this loop will execute 5 times// it starts at 0 always
            if (eachWild.equals("Turtle")){
                continue;
            }
            System.out.println(eachWild);
        }







    }
}
