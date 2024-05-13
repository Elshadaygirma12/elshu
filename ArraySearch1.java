/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysearch1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class ArraySearch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a ssequence of numbers(separated by spaces): ");
         String input = scanner.nextLine();
         String[] numberStrings = input.split(" ");
         int[] numbers = new int[numberStrings.length];
        
        for(int i = 0; i < numberStrings.length; i++){
            numbers[i] = Integer.parseInt(numberStrings[i]);
        
        }
        System.out.println("Enter the number to search for: ");
        int searchNumber = scanner.nextInt();
        
        int count = 0;
        for(int num : numbers){
            if(num == searchNumber){
                count++;
            }
        }
        if(count > 0){
            System.out.printf("the number %d appears %d time(s) in the array.%n", searchNumber, count);
        }else{
            System.out.printf("the number %d is not present in the array.%n", searchNumber);
            
        }
        
    }
}
    
    

