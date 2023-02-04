import Animals.*;

public class Main {
    public static void main(String[] args) {
        Animals  cat1 = new Cat("Igor");
        Animals  cat2 = new Cat("Avrosim");
        Animals  cat3 = new Cat("Kot");

        Animals  dog1 = new dog("Pupupu");
        Animals  dog2 = new dog("Java");
        Animals  dog3 = new dog("Rur");

        Animals.answerAnimalСnt();
        Cat.answerCatsCount();
        dog.answerDogsCount();


    }
}