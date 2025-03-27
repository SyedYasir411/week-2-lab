
interface Worker {
    void performDuties();
}


class Persons {
    String name;
    int id;

    Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Persons implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " (Chef) is cooking delicious food!");
    }
}


class Waiter extends Persons implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers!");
    }
}


public class P10 {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101);
        Waiter waiter = new Waiter("John Doe", 202);

        chef.performDuties();
        waiter.performDuties();
    }
}
