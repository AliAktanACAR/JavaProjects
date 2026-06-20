public class TalipHoca19 {
    public static void main(String[] args) {
        String [][] list = {
                {"We are the Champions", "You shook Me All Night Long", "We found Love"},
                {"Bleeding Love", "Stairway to Heaven", "Won't Get Fooled Again"},
                {"I'd Do Anything for Love", "Stupid Crazy Love", "Love in This Club"},
                {"Since U Been gone", "One More Time", "Walk this Way"}
        };

        System.out.println(findCount(list, "Love"));
    }


    public static int findCount(String [][] arr, String target) {


        int result = 0;

        for (String[] row : arr) {
            for (String element : row) {
                if (element.indexOf(target) >= 0) {
                    result ++;
                }
            }
        }

        return result;
    }
}

