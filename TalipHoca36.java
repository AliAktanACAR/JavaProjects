public class TalipHoca36 {
    public static void main(String[] args) {
        Name[] nameList = {new Name("Acar", "Ali"), new Name("Böke", "Talip"),
                new Name("Böke1", "Talip1"), new Name("Acar1", "Ali1"),
                new Name("Böke2", "Talip2"), new Name("Acar2", "Ali2"),};

        SeatingChart msJones = new SeatingChart(nameList,3,3);
        System.out.println(msJones);
    }
}

class Name{
    private String lastName;
    private String firstName;

    Name(String lName, String fName){
        lastName = lName;
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
class SeatingChart{
    private String [][] chart;
    private Name[] names;
    private int rows;
    private int cols;

    SeatingChart(Name[] names, int rows, int cols){
        this.names  = names;
        this.rows = rows;
        this.cols = cols;
        this.chart  = new String[rows][cols];

            int a = 0;
            while(a < names.length) {

                for(int i = 0; i < names.length; i++) {

                    String temp1 = names[i].getFirstName() + "," + names[i].getLastName();

                    int row = (int) (Math.random() * rows);
                    int col = (int) (Math.random() * cols);

                    while (chart[row][col] == null) {
                        chart[row][col] = temp1;
                        a++;
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "";

        for (String[] row : chart) {
            for (String element : row) {
                result += element + " ";
            }
            result += "\n";
        }

        return result;
    }
}

