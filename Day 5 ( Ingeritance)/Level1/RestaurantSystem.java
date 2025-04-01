interface Worker {
    void performDuties();
}

class Person1 {
    String name;
    int id;
    
    Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person1 implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " is cooking food.");
    }
}

class Waiter extends Person1 implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Mark", 202);
        
        chef.performDuties();
        waiter.performDuties();
    }
}