public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Safari", 15),
                new Cat("Best Dinne", 27),
                new Cat("Delicana", 30),
                new Cat("Puffins", 25),
        };
        Plate plate = new Plate(100);
        plate.info();
        Sobstvenik sobstvenik = new Sobstvenik("May", 31);
        while (!sobstvenik.checkCats(cats)){
            for (Cat cat:cats) {
                cat.eat(plate);
                plate.info();
            }
            sobstvenik.performFood(plate,sobstvenik.checkCats(cats));
        }
        System.out.println("Cats are full!!");
    }
}