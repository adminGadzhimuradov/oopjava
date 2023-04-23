import java.util.Random;

public class Sobstvenik {
    Random random = new Random();
    String name;
    int age;

    public Sobstvenik(String name, int age) {
        if(name.isEmpty()){
            throw new RuntimeException();
        }else {
            this.name = name;
        }
        if(age>5) {
            this.age = age;
        }else{
            throw new RuntimeException("Age more 5!");
        }
    }
    public Sobstvenik(String name){
        this(name,27);
    }
    public Sobstvenik(){
        this("Sabir",27);
    }

    public boolean checkCats(Cat[] cats){
        for (Cat cat:cats) {
            if (!cat.getFull()){
                return false;
            }
        }
        return true;
    }
    public void performFood (Plate plate, boolean solution){
        if(!solution){
            plate.setFood(plate.getFood()+ random.nextInt(5,27));
        }
    }
}