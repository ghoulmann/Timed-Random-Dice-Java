class Main {

    public static void main(String[] args) {
        final int SIDES = 6;
        // UtilDie Timed
        long startTime = System.nanoTime();
        UtilDie myDie = new UtilDie(SIDES);

        long stopTime = System.nanoTime();
        long duration = stopTime - startTime;
        System.out.print("[java.util.Random] I rolled: " + myDie.roll() + " (d" + myDie.sides + ")");
        System.out.print(" [Execution Time: ");
        System.out.format("%,8d%n", duration);
        System.out.println(" ns]");

        // Math Die Timed
        startTime = System.nanoTime();
        MathDie myDie2 = new MathDie(SIDES);
        stopTime = System.nanoTime();
        duration = stopTime - startTime;
        System.out.print("[java.Math.random] I rolled: " + myDie2.roll() + " (d" + myDie2.sides + ")");
        System.out.print(" [Execution Time: ");
        System.out.format("%,8d%n", duration);
        System.out.println(" ns]");
    }
}