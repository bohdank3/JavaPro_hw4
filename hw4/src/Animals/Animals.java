package Animals;

public abstract class Animals {

    private static int cntAnimals = 0;
    private static String name;


    public Animals(String name) {
        this.name = name;
        cntAnimals = cntAnimals + 1;
    }

    public static void answerAnimalСnt() {
        System.out.println("created by animals " + cntAnimals);
    }

    public abstract void run(int longDistance);

    public abstract void swim(int longDistance);

    public static String getName(){
        return name;
    }
}
