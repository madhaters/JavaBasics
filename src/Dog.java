public class Dog extends Animals {

    public Dog(String name, int legs, int price, String bread, int stiffness, int softness) {
        super(name, legs, price, bread, stiffness, softness);
    }

    public void Barking() {
        System.out.print("the Dog barks:\n boo boo boo");
    }
}
