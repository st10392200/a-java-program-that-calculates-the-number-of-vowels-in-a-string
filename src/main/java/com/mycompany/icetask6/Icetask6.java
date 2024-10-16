/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6;

/**
 *
 * @author RC_Student_lab
 */
public class Icetask6 {

    public static int countVowels(String sentence) {
       
        sentence = sentence.toLowerCase();
 int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        
       String sentence = " welcome ";
      int numberOfVowels = countVowels(sentence);

        System.out.println("The number of vowels ie: " + numberOfVowels);

        
    }
}
