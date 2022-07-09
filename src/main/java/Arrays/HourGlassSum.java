/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class HourGlassSum {

    static ArrayList<Integer> rows = new ArrayList<>();
    static ArrayList<Integer> columns = new ArrayList<>();

    public static int hourGlassSum(List<List<Integer>> arr) {
        int maxSum = 0;
        setCordinates(arr.size());

        if (rows.size() == columns.size()) {
            for (int i = 0; i < rows.size(); i++) {
                int tempSum = getSum(rows.get(i), columns.get(i), arr);
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
        return maxSum;
    }

    public static int getSum(int row, int column, List<List<Integer>> arr) {
        int left = column - 1;
        int right = column + 1;
        int top = row - 1;
        int bottom = row + 1;

        int topSum = arr.get(top).get(left) + arr.get(top).get(column)
                + arr.get(top).get(right);
        int bottomSum = arr.get(bottom).get(left) + arr.get(bottom).get(column)
                + arr.get(bottom).get(right);
        int middle = arr.get(row).get(column);

        return topSum + middle + bottomSum;
    }

    public static void setCordinates(int length) {
        int max = length - 1;
        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
                rows.add(i);
                columns.add(j);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> control = new ArrayList<>();
        control.add(1);
        control.add(1);
        control.add(1);
        control.add(0);
        control.add(0);
        control.add(0);
        list.add(control);

        control = new ArrayList<>();
        control.add(0);
        control.add(1);
        control.add(0);
        control.add(0);
        control.add(0);
        control.add(0);
        list.add(control);

        control = new ArrayList<>();
        control.add(1);
        control.add(1);
        control.add(1);
        control.add(0);
        control.add(0);
        control.add(0);
        list.add(control);

        control = new ArrayList<>();
        control.add(0);
        control.add(0);
        control.add(2);
        control.add(4);
        control.add(4);
        control.add(0);
        list.add(control);

        control = new ArrayList<>();
        control.add(0);
        control.add(0);
        control.add(0);
        control.add(2);
        control.add(0);
        control.add(0);
        list.add(control);

        control = new ArrayList<>();
        control.add(0);
        control.add(0);
        control.add(1);
        control.add(2);
        control.add(4);
        control.add(0);
        list.add(control);

        System.out.println(hourGlassSum(list));
    }
}
