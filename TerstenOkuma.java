public class TerstenOkuma {
    public static void main(String[] args) {
    String kelime1 = "ALİ ACAR";
    System.out.println(tersOku(kelime1));


    }
    public static String tersOku(String kelime1){
        String ters1 ="";
        for (int i = kelime1.length()-1;  i>=0; i--){
           ters1 += kelime1.substring(i,i+1);
        }
        return ters1;
    }
}


