package Inheritance;
interface Worker {
    void performDuties();
}

class RestaurantPerson {
    String name;
    int id;

    RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends RestaurantPerson implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        displayDetails();
        System.out.println("Duty: Preparing meals.");
        System.out.println("-----------------------------");
    }
}

class Waiter extends RestaurantPerson implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        displayDetails();
        System.out.println("Duty: Serving customers.");
        System.out.println("-----------------------------");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Chef chef = new Chef("Amit", 201);
        Waiter waiter = new Waiter("Rohit", 202);

        chef.performDuties();
        waiter.performDuties();
    }
}
