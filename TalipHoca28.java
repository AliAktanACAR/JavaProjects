import java.awt.print.Book;

public class TalipHoca28 {
    public static void main(String[] args) {

    ISBN book1 = new ISBN(930640611);
    System.out.println(book1.generateNumber());
    }
}
class ISBN {  //PUBLIC
    private int isbnNumber;   //PRIVATE

    public ISBN (int num){
        this.isbnNumber = num;
    }

    public String calculateCheckDigit(){
        int sum = 0;
        int weight = 2;
        int temp = isbnNumber;

        while (temp > 0){

            int digit = 0;
            digit += temp % 10;
            temp /= 10;
            sum += digit * weight;
            weight++;
        }

        int check = 11 - (sum % 11);

        if (check == 10){
            return "X";
        }

        else {
            return "" + check;
        }
    }

    public String generateNumber() {
        return isbnNumber + "-" + calculateCheckDigit();
    }
}

