/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanschristian
 */
public class CobaException {
    
    private static int[] array = new int[5];
    
    public static void main(String[] args) {
        try {
            System.out.println("Array 10: " + array[1]);
        } catch(Exception e) {
            System.out.println("MASUK ERROR");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("MASUK FINALLY");
        }
        System.out.println("Array 2: " + array[2]);
    }
}
