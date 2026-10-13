// Benjamin Berkowitz 10/13/26
// This program allows the user to input some answers to their favorite things and their name, and it will output a perfect pet based on certain criteria.

import java.util.Scanner;
public class PetSelector {
    public static void main(String[] arg) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your favorite color (red, green, or blue)");  
        String favColor = myScanner.nextLine();
        System.out.println("Enter your name");
        String name = myScanner.nextLine();
        System.out.println("Enter your favorite season (winter, spring, summer, fall)");
        String favSeason = myScanner.nextLine();
        String pet = "";
        String returnStr = "";
        if (favColor.isEmpty() || favSeason.isEmpty() || name.isEmpty()) {
            returnStr = "Please enter your answers";
            System.out.println(returnStr);
        } else if (("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0) && (favColor.toLowerCase().equals("green") || favColor.toLowerCase().equals("red") || favColor.toLowerCase().equals("blue")) && (favSeason.toLowerCase().equals("fall") || favSeason.toLowerCase().equals("summer") || favSeason.toLowerCase().equals("spring") || favSeason.toLowerCase().equals("winter"))) {
            if (favColor.toLowerCase().equals("blue")) {
                if (favSeason.toLowerCase().equals("fall")) {
                    pet = "alligator";
                } 
                if (favSeason.toLowerCase().equals("spring")) {
                    pet = "ostrich";
                }
                if (!favSeason.toLowerCase().equals("summer") && !favSeason.toLowerCase().equals("fall") && (!name.toLowerCase().startsWith("a") && !name.toLowerCase().startsWith("e") && !name.toLowerCase().startsWith("i") && !name.toLowerCase().startsWith("o") && !name.toLowerCase().startsWith("u"))) {
                    if(!pet.equals("ostrich")){
                        pet = "axolotl";
                    }
                }
            } else if (favColor.toLowerCase().equals("green")){
                if (favSeason.toLowerCase().equals("winter") && (!name.toLowerCase().startsWith("a") && !name.toLowerCase().startsWith("e") && !name.toLowerCase().startsWith("i") && !name.toLowerCase().startsWith("o") && !name.toLowerCase().startsWith("u"))) {
                    pet = "giraffe";
                }
                if (!favSeason.toLowerCase().equals("fall")) {
                    if (!pet.equals("giraffe")) {
                        pet = "dog";
                    }
                }
            } else if (favColor.toLowerCase().equals("red")) {
                if (name.toLowerCase().startsWith("a") == true || name.toLowerCase().startsWith("e") == true || name.toLowerCase().startsWith("i") == true || name.toLowerCase().startsWith("o") == true || name.toLowerCase().startsWith("u") == true) {
                    pet = "porcupine";
                } else {
                    pet = "panda";
                }
            } 
            if (favSeason.toLowerCase().equals("summer")) {
                if (pet == "") {
                    pet = "pony";
                }
            }
            
            if (pet == "") {
            pet = "rock";
            }
        } else {
            returnStr = "You may have mistyped something, please try again.";
            System.out.println(returnStr);
        }
        
        if (returnStr.isEmpty()) {
            System.out.println("Your perfect pet is: " + pet);
        }
        
    }
}
