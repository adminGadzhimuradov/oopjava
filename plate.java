public class Plate {
    private int food;

    public Plate(int food) {
        if (food > 15) {
            System.out.println("call the cats to eat!");
            this.food = food;
        } else {
            throw new RuntimeException("Food should be more than 15!");
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}