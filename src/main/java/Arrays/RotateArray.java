/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author hp
 */
public class RotateArray {

    public String encrypt(String input, int steps) {
        if (input.isEmpty()) return "";
        char[] char_array = input.toCharArray();
        char[] buffer = new char[char_array.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < char_array.length; i++) {
            int index = i - steps;
            if (index < 0) index = char_array.length + index;
            buffer[index] = char_array[i];
        }
        for (int i = 0; i < buffer.length; i++) {
            result.append(buffer[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        String name = "David";
        System.out.println(rotate.encrypt(name, 4));
    }
}
