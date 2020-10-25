class Main {

    public static void main(String[] args) {
        final int SIDES = 6;
        // UtilDie Timed
        
        UtilDie myDie = new UtilDie(SIDES);


        
        long startTime = System.nanoTime();System.out.print("[java.util.Random] I rolled: " + myDie.roll() + " (d" + myDie.sides + ")");
        long stopTime = System.nanoTime();
        long duration = stopTime - startTime;
        System.out.print(" [Execution Time: ");
        System.out.format("%,8d%n", duration);
        System.out.println(" ns]");

        // Math Die Timed
        
        MathDie myDie2 = new MathDie(SIDES);
        

        startTime = System.nanoTime();
        System.out.print("[java.Math.random] I rolled: " + myDie2.roll() + " (d" + myDie2.sides + ")");
        stopTime = System.nanoTime();
        duration = stopTime - startTime;
        System.out.print(" [Execution Time: ");
        System.out.format("%,8d%n", duration);
        System.out.println(" ns]");
    }
}
