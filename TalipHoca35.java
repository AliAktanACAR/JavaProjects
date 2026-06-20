public class TalipHoca35 {
    public static void main(String[] args) {
    CalorieCount sunday = new CalorieCount(1500);
    sunday.addMeal(716,38,38,45);
    sunday.addMeal(716,38,38,45);
    System.out.println(sunday.onTrack());

    }
}

class CalorieCount{
    private int dailyLimit;
    private int dailyTake;
    private int protein;
    private int carbs;
    private int fat;

   public CalorieCount(int dailyLimit){
       this.dailyLimit = dailyLimit;

   }
   public void addMeal(int dailyTake, int protein, int carbs, int fat){
       this.dailyTake += dailyTake;
       this.protein += protein;
       this.carbs += carbs;
       this.fat += fat;
   }
   public boolean onTrack(){
       return dailyTake <= dailyLimit;
   }
}