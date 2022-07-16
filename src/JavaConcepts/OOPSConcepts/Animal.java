package JavaConcepts.OOPSConcepts;

public abstract class Animal {
    protected  String name;
    public Animal(String name) {
      this.name=name;
    }

    public void print() {
        System.out.println(name);
    }

}
