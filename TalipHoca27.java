public class TalipHoca27 {
    public static void main(String[] args) {

        Password pass1 = new Password(5,15);
        boolean result = pass1.isValid("duhıdada!Aao");
        System.out.println(result);

        String randompass = pass1.generatePassword();
        System.out.println(randompass);

    }
}

class Password {

    private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lower = "abcdefghıjklmnopqrstuvwxyz";
    private String symbols = "!@#$%^&*";
    private int minLength;
    private int maxLength;


    public Password(int min, int max) {
        this.minLength = min;
        this.maxLength = max;
    }

    public boolean isValid(String password) {
        if (password.length() < minLength || password.length() > maxLength) {
            return false;
        }

        int upCount = 0;
        int lowCount = 0;
        int symbolCount = 0;


        for (int i = 0; i < password.length(); i++) {
            String letter = password.substring(i, i + 1);
            if (upper.indexOf(letter) > -1) {
                upCount++;
            }
            else if (lower.indexOf(letter) > -1) {
                lowCount ++;
            }
            else if (symbols.indexOf(letter) > -1) {
                symbolCount++;

            }
        }

        return (upCount > 0 && lowCount > 0 && symbolCount > 0 && (upCount + lowCount + symbolCount) == password.length());
    }

    public String generatePassword(){
        String randomPass1= "";

            int up = (int) (Math.random() * upper.length());
            int low = (int) (Math.random() * lower.length());
            int symbol = (int) (Math.random() * symbols.length());

            randomPass1 += upper.substring(up, up + 1);
            randomPass1 += lower.substring(low, low + 1);
            randomPass1 += symbols.substring(symbol, symbol + 1);

    return randomPass1;

    }
}



/*
        int a = 0;
        boolean b = false;

        if (password.length() >= minLength){
            a++;
        }
        if (password.length() <= maxLength){
            a++;
        }
        if (a==2){
        for (int i = 0; i < upper.length(); i++) {
            String letter = (upper.substring(i, i + 1));
            if (password.indexOf(letter) >= 0) {
                a++;
            }
            else {
                a--;
            }
        }
    }
        if (a==3){
            for (int i = 0; i < lower.length(); i++) {
                String letter = (lower.substring(i, i + 1));
                if (password.indexOf(letter) >= 0) {
                    a++;
                }
                else {
                    a--;
                }
            }
        }
        if (a==4){
            for (int i = 0; i < symbols.length(); i++) {
                String letter = (symbols.substring(i, i + 1));
                if (password.indexOf(letter) >= 0) {
                    a++;
                }
                else {
                    a--;
                }
            }
        }
        if (a==5){
            return true;
        }
    }

}

*/
