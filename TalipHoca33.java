public class TalipHoca33 {
    public static void main(String[] args) {

        Height height1 = new Height(117);

        Height height2 = new Height(15);

        System.out.println(height1);
        height1.add(height2);
        System.out.println(height1);

    }

// 5. ünite,

}

class Height{
    int feet;
    int inches;

    Height(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
        simplify();
    }

    Height(int inches){
        this.inches = inches;
        simplify();
    }

    private void simplify(){
        if(inches >= 12){
            this.feet += inches / 12;
            this.inches %= 12;
        }
    }

    public void add(int inches){
        this.inches += inches;
        simplify();
    }

    public void add(Height ht){
        this.feet += ht.feet;
        this.inches += ht.inches;
        simplify();
    }

    @Override
    public String toString() {
        return feet + " " + inches;
    }
}

