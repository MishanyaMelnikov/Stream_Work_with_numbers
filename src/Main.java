import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        ArrayList<Integer> result1 = new ArrayList<>();

        for (int i = 0; i< input.length; i++){
            if (input[i]>0){
                result1.add(input[i]);
            }
        }
        ArrayList<Integer> result2 = new ArrayList<>();
        for (int i = 0; i< result1.size(); i++){
            if (result1.get(i)%2==0){
                result2.add(result1.get(i));
            }
        }
        ArrayList<Integer> result3 = new ArrayList<>();
        result3 = (ArrayList)result2.clone();
        Collections.sort(result3);







        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);



    }


}

