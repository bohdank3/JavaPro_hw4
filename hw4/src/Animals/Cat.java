package Animals;

public  class Cat extends Animals {
    private static int cntCat = 0;

    public Cat(String name) {
        super(name);
        cntCat = cntCat + 1;
    }

    public static void answerCatsCount(){
        System.out.println("created by cats " + cntCat);
    }

    @Override
    public  void run (int longDistance){
        if(longDistance <= 200 &&  longDistance > 0){
            System.out.println("name Cat " + getName() + "\nCat run " + longDistance);
        }else{
            System.out.println("name Cat " + getName() + "can't run that much");
        }
    }

    @Override
    public void swim(int longDistance) {
        System.out.println("name Cat " + getName() + "can't swim");
    }
}
