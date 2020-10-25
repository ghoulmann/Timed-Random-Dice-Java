public class MathDie {
    int sides;

    MathDie(int size) {
        sides = size;
        
    }
    
    public int roll() {
        
        //int result = (int) (generator.nextInt(this.sides)  + 1 );
        int result = (int) (Math.random() * this.sides) + 1;
        return result;
    }
}