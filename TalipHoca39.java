public class TalipHoca39 {
    public static void main(String[] args) {

    }
}

class FrogSimulation{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist,int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance(){
        return (int) (Math.random() * maxHops * 2) - maxHops;
    }

    public boolean simulate() {
        int position = 0;

        for (int i = 0; i < maxHops; i++) {
            int hop = hopDistance();
            position += hop;

            if (position >= goalDistance) {
                return true;
            }
            if (position < 0) {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num){
        int count = 0;
        int reached = 0;

        while (count < num){
            if (simulate() == true){
                reached++;
            }
            count++;
        }
        return (double) reached / num ;
    }

}
