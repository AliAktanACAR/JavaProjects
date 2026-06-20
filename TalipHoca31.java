import java.util.ArrayList;

public class TalipHoca31 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(1);




        //removeEvens(list);
        System.out.println(palindrome((list)));
    }

    public static boolean palindrome(ArrayList <Integer> list){

        boolean isPalindrome = false;

        ArrayList<Integer> right = new ArrayList<Integer>();
        ArrayList<Integer> left = new ArrayList<Integer>();

        int mid = (list.size()/2);

        for(int i = 0; i < mid; i++){
            left.add(list.get(i));
        }

        for(int i = list.size()-1; mid <= i; i--){
            right.add(list.get(i));
        }

        int count = 0;

        for (int i = 0; i < left.size(); i++){
            if(left.get(i) == right.get(i)){
                count++;
            }
        }

        if (count == left.size()){
            isPalindrome = true;
        }
        return isPalindrome;

    }



    public static int biggest(ArrayList <Integer> list){
        int highest = 0;
        int sechighest = 0;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > highest){
                highest = list.get(i);
            }
            else if(list.get(i) > sechighest){
                sechighest = list.get(i);
            }
        }
        return sechighest;

    }

    public static void removeEvens(ArrayList <Integer> list) {


        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }

    public static int count(ArrayList <Integer> list){
        int sum = 0;

        for (int i = 0; i < list.size() ; i++){
            if (list.get(i) % 2 == 0){
                sum++;
            }
        }
        return sum;
    }



    public static double avg (ArrayList <Integer> list) {

        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return (sum / list.size());

    }


}