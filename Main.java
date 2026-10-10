class Power {

    int voltage;
    int current;

    // Type 1: Without arguments and without return value
    void powercal1() {
        voltage = 220;
        current = 5;
        int power = voltage * current;

        System.out.println("Type 1: " + power);
    }

    // Type 2: With arguments and without return value
    void powercal2(int v, int i) {
        int power = v * i;

        System.out.println("Type 2: " + power);
    }

    // Type 3: Without arguments and with return value
    int powercal3() {
        voltage = 220;
        current = 5;
        int power = voltage * current;

        return power;
    }

    // Type 4: With arguments and with return value
    int powercal4(int v, int i) {
        int power = v * i;

        return power;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating an object
        Power obj = new Power();

        // Calling Type 1
        obj.powercal1();

        // Calling Type 2
        obj.powercal2(220, 5);

        // Calling Type 3
        int result1 = obj.powercal3();
        System.out.println("Type 3: " + result1);

        // Calling Type 4
        int result2 = obj.powercal4(220, 5);
        System.out.println("Type 4: " + result2);
    }
}