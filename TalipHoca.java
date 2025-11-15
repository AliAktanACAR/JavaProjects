public class TalipHoca {
    public static void main(String[] args) {

        /*
        intigerda method çalışmaz (casting işlemi)


        static methodlar objeye ihtiyaç durmaz.
        dinamic methodlar objeye ihtiyaç duyar.


        random sayı üretirken double döner


        (high - low + 1) + low



        int max value
        2^31 -1


        int min value
        -2^31    1 ekliyoruz


        autoboxing yaparsak double'ı integer' a çevirebiliyoruz

        unboxing integer ı double yapma


        rapid review yap
        ödevi yap




        önce geliyorsa -1
        sonra geliyorsa +1





        if else de ==
        string de .equals
        double toleranslı



        &&    ve
        ||    ve ya


        süslü parantezin içindeki değişken oranın değişkeni

        rapid review


        dinamik değişkenler paranteze bağlı
        statik değişkenler full var



        for ve while

        for, kaç kere yapacağını biliyorsak
        while, bilmiyorsak, nerde biteceğini biliyorsak



        sayfa 216 falan iyi örnekler var

        */

        int result = (int) (Math.random() * 14 ) + 3; /* sayı herzaman 14 den 1 küçük ama +3 var yani              3 ile 17 arasında çıkar. */
        System.out.println(result);


        int num = 10;

        Integer MyInteger = new Integer(8);

        Integer valueClass = Integer.valueOf(22);


        int value = valueClass;

        double value2 = valueClass.doubleValue();









    }
}
