/*
 * Author:
 * Date:
 * Purpose:
 */
package lab8;

import java.util.*;

public class Lab8 {

    private HashMap<String, Boolean> visited = null;

    //Instantiates a hasmap that maps integers to integers.
    //See Lab8Test.java for expected key => value pairs.
    public HashMap<Integer, Integer> integerToInteger(){
        return null;
    }
    //Instantiates a hashmap that maps doubles to double.
    //See Lab8Test.java for expected key => value pairs.
    public HashMap<Double, Double> doubleToDouble(){
        return null;
    }
    //Instantiates a hashmap that maps lower case characters to their upper case string.
    //See Lab8Test.java for expected key => value pairs.
    public HashMap<Character, String> characterToString(){
        return null;
    }
    //Instantiates a hashmap that maps computer science terms to their abbreviations.
    //See Lab8Test.java for expected key => value pairs.
    public HashMap<String, String> stringToString(){
        return null;
    }
    //Instantiates a hashmap that maps month numbers to month names.
    //See Lab8Test.java for expected key => value pairs.
    public HashMap<Integer, String> integerToString(){
        return null;
    }
    //Instantiates a hashmap that maps radix bucket names to LinkedLists containing the correct single digit entryfor that bucket.
    // Example: { bucket0 => 0, bucket1 => 1, ..., bucket9 => 0 }
    //See Lab8Test.java for expected key => value pairs.
    public HashMap<String, LinkedList<Integer>> integerToLinkedList(){
        return null;
    }
    //Instantiates a hashmap that maps hospital names to hasmaps that map the hospital's staff names to their medical group.
    //See Lab8Test.java for expected key => value pairs.
    public HashMap<String, HashMap<String, String>> stringToHashMapOfStringToString(){
        String hospitalName = "PeaceHealth Medical Group";
        String[] hospitalStaffNames = new String[5];
        String[] hospitalStaffGroup = new String[5];
        hospitalStaffNames[0] = "Cynthia L. Brinn";
        hospitalStaffGroup[0] = "Dietitian";
        hospitalStaffNames[1] = "Peter E. Filuk";
        hospitalStaffGroup[1] = "Pediatrics";
        hospitalStaffNames[2] = "James R. Beieler";
        hospitalStaffGroup[2] = "Family Medicine";
        hospitalStaffNames[3] = "Sarah M. Langan";
        hospitalStaffGroup[3] = "Gastroenterology";
        hospitalStaffNames[4] = "Megan A. Britson";
        hospitalStaffGroup[4] = "Internal Medicine";
        return null;
    }
    //Applies the paint bucket from windows paint to the pixel located at (x,y). 
    //If you are unfamiliar with the paint bucket in windows paint, it starts at a given pixel (x,y) and paints all pixels that are adjacet to and matching the color of the starting pixel.
    //The image input is black and white by the characters ' ' and '#' respectively. This paint bucket will only paint black pixels white (' ' => '#').
    //When paintBucket() is called on a black pixel (picture[x][y] == ' ') it will paint that pixel white (picture[x][y] = '#').
    //When paintBucket() is called on a white pixel (picture != ' ') it will simply return;
    //NOTE: Your paintBucket method should edit the input 2-dimensional char array.
    //HINT: If a black pixel is painted white, there may be adjacent black pixels that need to be painted white.
    //HINT: You will need to use a hashmap to keep track of the pixels you have visited to avoid a stack overflow error. See the private visited HashMap above.
    //HINT: Run "gradle run" from the command line to see the output of your paintBucket method and the correct output.
    public void paintBucket(char[][] picture, int x, int y){
        if(x < 0 || x >= picture.length){
            return;
        }
        if(y < 0 || y >= picture[0].length){
            return;
        }
    }
    public void printPicture(char[][] picture){
        int i, j;
        for(i = 0; i < picture.length; i++){
            for(j = 0; j < picture[i].length-1; j++){
                System.out.print(picture[i][j]+" ");
            }
            System.out.println(picture[i][j]);
        }
    }
    public static void main(String[] args) {
        Lab8 L = new Lab8();
        char[][] inputPicture1 = {
                                    {' ', ' ', ' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', '#', '#', ' ', ' ', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {'#', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {'#', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', ' '},
                                    {'#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' '},
                                    {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', ' '},
                                    {' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {' ', ' ', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
                                };
        char[][] outputPicture1 = {
                                    {' ', ' ', ' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {'#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', ' '},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' '},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', ' '},
                                    {' ', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {' ', ' ', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
                                };
        char[][] inputPicture2 = {
                                    {' ', ' ', ' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {'#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', ' '},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' '},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', ' '},
                                    {' ', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {' ', ' ', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
                                };
        char[][] outputPicture2 = {
                                    {' ', ' ', ' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {'#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', ' '},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' '},
                                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', ' '},
                                    {' ', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', '#', ' '},
                                    {' ', ' ', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                                    {' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
                                };
        System.out.println("ORIGINAL PICTURE:");
        L.printPicture(inputPicture1);
        System.out.println("CALLING paintBucket(inputPicture1, 6, 6)...");
        L.paintBucket(inputPicture1, 6, 6);
        System.out.println("YOUR PICTURE WAS:");
        L.printPicture(inputPicture1);
        System.out.println("IT SHOULD BE:");
        L.printPicture(outputPicture1);
        System.out.println("CALLING paintBucket(inputPicture2, 6, 11)...");
        L.paintBucket(inputPicture2, 6, 11);
        System.out.println("YOUR PICTURE WAS:");
        L.printPicture(inputPicture2);
        System.out.println("IT SHOULD BE:");
        L.printPicture(outputPicture2);
    }
}
