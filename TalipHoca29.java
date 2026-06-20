import java.util.ArrayList;

public class TalipHoca29 {
    public static void main(String[] args) {

        ArrayList <Double> tc1 = new ArrayList <Double> ();

        tc1.add(200.0);
        tc1.add(100.0);
        tc1.add(150.0);
        tc1.add(50.0);
        tc1.add(100.0);
        tc1.add(60.0);

        Train train1 = new Train(300.0, tc1);
        System.out.println(train1.getTotalWeight());
        System.out.println(train1.removeExcessTrainCars());

    }
}

class Train {

    private double maxWeight;
    private ArrayList <Double> trainCars;


    public Train(Double max, ArrayList <Double> tc) {
        this.maxWeight = max;
        this.trainCars = tc;

    }

    public Double getTotalWeight() {
        Double sum = 0.0;

        for (int i = 0; i < trainCars.size(); i++) {
            sum += trainCars.get(i);

        }
        return sum;
    }

    public ArrayList <Double> removeExcessTrainCars() {
        ArrayList <Double> removed = new ArrayList <Double> ();

        while (getTotalWeight() >= maxWeight){

            int i = trainCars.size()-1;

            if (getTotalWeight() > maxWeight){
            removed.add(trainCars.remove(i));

            }
        }
        return removed ;
    }
}


