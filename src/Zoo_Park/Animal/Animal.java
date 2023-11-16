package Zoo_Park.Animal;

public abstract class Animal {

    String type;
    int height;
    double weight;

    public Animal(String type, int height, double weight) {
        this.type = type;
        this.height = height;
        this.weight = weight;
    }

    public abstract void beDangerous();
    public void play(){
        System.out.println("We all like to play!");
    }
}
