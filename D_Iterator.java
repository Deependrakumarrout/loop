package Loop;

import java.util.ArrayList;
import java.util.Arrays;
public class D_Iterator {
    public static void main(String[] args) {

        /*
        // I am using arraylist and also using for loop.
        ArrayList<Double> itemPrice = new ArrayList<Double>();
        itemPrice.add(43.53);
        itemPrice.add(53.23);
        itemPrice.add(32.43);
        itemPrice.add(35.45);
        itemPrice.add(45.23);
        itemPrice.add(45.56);

        double totalAmount = 0;

        // Iterate over expenses
        for(int i=0; i<itemPrice.size(); i++) {
            totalAmount = totalAmount + itemPrice.get(i);
        }
        System.out.println(totalAmount);
         */


        // here by using array.
        double total = 0;
        double[] itemPrice = {43.54, 64.23, 45.46, 23.43};
        // double convert = Arrays.toString(itemPrice);
        for (int i = 0; i < itemPrice.length; i++) {
            total += itemPrice[i];
        }
        System.out.println(total);
        System.out.println(itemPrice.length);

        int randomNum =43;
        // Another program to add 1 number for each item.
        for (int j = 0; j <itemPrice.length; j++) {
            itemPrice[j]+=randomNum;
        }
        System.out.println(Arrays.toString(itemPrice));
    }
}
