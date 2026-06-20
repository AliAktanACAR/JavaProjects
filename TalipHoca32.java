import java.util.ArrayList;

public class TalipHoca32 {
    public static void main(String[] args) {
        TravelPlan p1 = new TravelPlan("Capetown");
        Tour t1 = new Tour(1312020, 800, 1230, "Bungee jumping");
        Tour t2 = new Tour(1312020, 900, 1430, "Body surfing");
        System.out.println(p1.addTour(t1));
        System.out.println(p1.addTour(t2));
        Tour t3 = new Tour(2012020, 900, 1200, "Shark cage diving");
        Tour t4 = new Tour(2012020, 1300, 1500, "Shark cage diving");
        Tour t5 = new Tour(2012020, 700, 800, "Shark cage diving");
        System.out.println(p1.addTour(t3));
        System.out.println(p1.addTour(t4));
        System.out.println(p1.addTour(t5));

    }
}

class Tour {
    private int actDate;
    private int startTime;
    private int endTime;
    private String activity;

    Tour(int actDate, int startTime, int endTime, String activity) {

        this.actDate = actDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
    }

    public int getActDate() {
        return actDate;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getActivity() {
        return activity;
    }

}

class TravelPlan {
    private String destination;
    private ArrayList <Tour> plans;


    TravelPlan(String destination) {
        this.destination = destination;
        plans = new ArrayList<Tour>();
    }

    public boolean checkForConflicts(Tour t) {
        for (int i = 0; i < plans.size(); i++) {
            if (plans.get(i).getActDate() == t.getActDate()) {
                /*
                if (plans.get(i).getStartTime() >= t.getStartTime() && plans.get(i).getStartTime() <= t.getEndTime() ||
                    plans.get(i).getEndTime() >= t.getEndTime() && plans.get(i).getEndTime() <= t.getStartTime()) {
                    return true;

                } else if ( t.getStartTime() >= plans.get(i).getStartTime() && t.getStartTime() <= plans.get(i).getEndTime() ||
                            t.getEndTime() >= plans.get(i).getEndTime() && t.getEndTime() <= plans.get(i).getStartTime()) {
                    return true;
                }
                */
                if (!(plans.get(i).getEndTime() < t.getStartTime() || plans.get(i).getStartTime() > t.getEndTime())){
                    return true;
                }
            }
        }
                return false;
    }

    public boolean addTour(Tour t){
        if (checkForConflicts(t) == false){
            plans.add(t);
            return true;
        }
        return false;
    }

}