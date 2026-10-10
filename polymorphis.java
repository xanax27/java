public class greet {

    static int powercal(int volt, int current) {
        int power = volt * current;
        System.out.println("Power is low");
        return power;
    }

    public static void main(String[] args) {
        int var;
        var = powercal(12, 2);

        System.out.println("The value of power is " + var);
    }
}


public class greet2 {

    void powercal() {
        int volt = 12;
        int current = 2;
        int power = volt * current;

        System.out.println("The value of power is " + power);
    }

    public static void main(String[] args) {
        greet2 obj = new greet2();
        obj.powercal();
    }
}


public class greet3 {

    int powercal() {
        int volt = 12;
        int current = 2;
        int power = volt * current;

        return power;
    }

    public static void main(String[] args) {
        greet3 obj = new greet3();

        int var = obj.powercal();

        System.out.println("The value of power is " + var);
    }
}



public class greet4 {

    void powercal(int volt, int current) {
        int power = volt * current;

        System.out.println("The value of power is " + power);
    }

    public static void main(String[] args) {
        greet4 obj = new greet4();

        obj.powercal(12, 2);
    }
}



public class greet5 {

    int powercal(int volt, int current) {
        int power = volt * current;
        return power;
    }

    public static void main(String[] args) {
        greet5 obj = new greet5();

        int var = obj.powercal(12, 2);

        System.out.println("The value of power is " + var);
    }
}