public class TalipHoca9 {
    public static void main(String[] args) {

        DreamVacation myDream = new DreamVacation("Sivas",150);
        DreamVacation myDream2 = new DreamVacation();

        System.out.println(myDream.getName());
        System.out.println(myDream.getCost());

        myDream.setName("Ankara");
        System.out.println(myDream.getName());

        myDream.setCost(150);
        System.out.println(myDream.getCost());


    }
}

class DreamVacation{
    private String name;
    private double cost;

    DreamVacation(){

    }

    DreamVacation(String name,double cost){
        this.name = name;
        this.cost = cost;
    }
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public void setName(String name){
       this.name = name;
    }
    public void setCost(double cost){
        this.cost = cost;

    }

}


