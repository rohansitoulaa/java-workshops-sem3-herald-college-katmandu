package week03;

import java.util.Scanner;
import java.io.*;

public class qn07 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a name of food:");
        String userInput = myScan.nextLine();

        try (FileWriter myFile = new FileWriter("food.txt");
             BufferedWriter newWrite = new BufferedWriter(myFile)) {

            newWrite.write(userInput);
            System.out.println("The food name was added to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            myScan.close();
        }
    }
}
