package HW8;
import java.awt.*;
import java.util.*;
import java.util.regex.Pattern;

public class RandomString {
    public static String random(int stringLength){
        StringBuilder result = new StringBuilder();
        String alphabetWithNumbers = "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz".toUpperCase() + "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" + "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toUpperCase() + "0123456789";
        Random r = new Random();
        for (int i = 0; i < stringLength; i++){
           result.append(alphabetWithNumbers.charAt(r.nextInt(alphabetWithNumbers.length())));
        }
        return result.toString();
    }

}
