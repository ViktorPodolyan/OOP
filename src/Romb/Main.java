package Romb;

import java.util.Scanner;

public class Main {

    private static String AddSpaces(int count){
        String spaces = "";
        for (int i = 0;i < count;i++){
            spaces += " ";
        }
        return spaces;
    }

    private static String MakePyramid(String w, int magic){
        String before = "", after = "\n";
        for(int i = magic;i > 0;i--){
            before += AddSpaces(i) + w.substring(i, w.length() - i) + "\n";
        }
        for(int i = 1;i <= magic;i++){

            after += AddSpaces(i) + w.substring(i, w.length() - i) +"\n";
        }
        return before + w + after;
    }

    public static String Pyramid(String word){
        if(word.length() <= 2){
            return word;
        }else if(word.length() % 2 == 0){
            return MakePyramid(word,word.length() / 2 - 1);
        }else {
            return MakePyramid(word,word.length() / 2);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Pyramid(scanner.next()));
    }
}