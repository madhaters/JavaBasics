public class Animals {
    int legs;
    String name;
    String bread;
    int price;
    int stiffness;
    int softness;


    public Animals(String name, int legs, int price, String bread, int stiffness, int softness) {
        this.legs = legs;
        this.name = name;
        this.price = price;
        this.bread = bread;
        this.stiffness = stiffness;
        this.softness = softness;

    }

    public int getlegs() {
        return this.legs;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getBread() {
        return this.bread;
    }

    public int getStiffness() {
        return this.stiffness;
    }

    public int getSoftness() {
        return this.softness;
    }
}





