import java.util.Random;

public class UtilDie {
    int sides;

    UtilDie(int size) {
        sides = size;
        
    }
    
    public int roll() {
        Random generator = new Random();
        sides = this.sides;
        int result = (int) (generator.nextInt(sides)); //* this.sides + 1 );
        
        return result;
    }
}