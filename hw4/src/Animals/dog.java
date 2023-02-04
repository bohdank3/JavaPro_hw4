package Animals;

public class dog  extends Animals{

    private static int cntCat = 0;

    public dog (String name) {
        super(name);
        cntCat = cntCat + 1;
    }

    public static void answerDogsCount(){
        System.out.println("created by dogs " + cntCat);
    }

    @Override
    public void run(int longDistance) {
        if(longDistance <= 500 &&  longDistance > 0){
            System.out.println("name dog " + getName() + "\nDog run " + longDistance);
        }else{
            System.out.println("name dog " + getName() + "can't run that much");
        }
    }

    @Override
    public void swim(int longDistance) {
        if(longDistance <= 10 &&  longDistance > 0){
            System.out.println("name dog " + getName() + "\nDog swim " + longDistance);
        }else{
            System.out.println("name dog " + getName() + "can't run that much");
        }
    }
}
