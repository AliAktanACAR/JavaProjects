public class TalipHoca38 {
    public static void main(String[] args) {

    }
}
class Robot {
    private int[] hall;
    private int pos;
    private boolean facingRight;


    private boolean forwardMoveBlocked() {
        if (pos == hall.length - 1) {
            return true;
        }
        return false;
    }

    private void move() {
        if (hall[pos] > 0) {
            hall[pos] = hall[pos] - 1;
        }
        if (hall[pos] > 0) {
            return;
        }

        if (forwardMoveBlocked() == true) {
            if (facingRight == true) {
                pos++;
            } else {
                pos--;
            }
        } else {
            facingRight = !facingRight;
        }
    }

    public boolean hallIsClear(){
        return true;
    }

    public int clearHall() {
        int moveCount = 0;

        while (!hallIsClear()){
            move();
            moveCount++;
        }

        return moveCount;

    }
}




