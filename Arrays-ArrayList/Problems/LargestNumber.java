package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(scanner.nextInt());
        }

        int maxNumber = list.get(0);

        for(int num : list){
            if(num > maxNumber){
                maxNumber = num;
            }
        }

        System.out.println("Max : " + maxNumber);
        System.out.println("List : " + list);
        scanner.close();
    }
}
