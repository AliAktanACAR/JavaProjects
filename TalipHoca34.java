import java.util.ArrayList;

public class TalipHoca34{
    public static void main(String[] args) {
        DiceSimulation s1 = new DiceSimulation(10,6);
        System.out.println(s1.runSimulation());

    }

}
class DiceSimulation{
    // 1. 2. ünite
    private int numSampleSize;
    private int numFaces;

    public DiceSimulation(int numSample, int faces){
        numSampleSize = numSample;
        numFaces = faces;

    }

    public int roll(){
            return (int) (Math.random() * numFaces) + 1;
        }

    public int runSimulation(){
        int count = 0;

        for (int i = 0; i<= numSampleSize; i++){
            int die1 = roll();
            int die2 = roll();

            System.out.println(die1 + " " + die2);
            if(die1 == die2){
                count++;
            }
        }

        int percantage = count * 100 / numSampleSize ;
        return percantage;
    }
}
