package DataTypes;

public class Methods {
    public static void main(String [] args){
        int intValue = 45;
        long longValue = 1234;
        short shortValue = 2;
        double doubleValue = 2.3;
        float floatValue = 3.5f;
        byte byteValue = 5;

        long sum = intValue + longValue;
        double sub = floatValue - doubleValue;
        float mul = shortValue * floatValue;
        int div = intValue / shortValue;
        int mod = byteValue % shortValue;

        System.out.println("subtraction float and double: " + sub);
        System.out.println("sum int and long: " + sum);
        System.out.println("multiplication float and short: " + mul);
        System.out.println("division int and short: " + div);
        System.out.println("remainder of the division byte and short:" + mod);

        System.out.println("\nРезультаты, полученные с помощью методов:\n");
        subFloatAndDouble(floatValue, doubleValue);
        sumIntAndLong(intValue, longValue);
        mulFloatAndShort(floatValue, shortValue);
        divIntAndShort(intValue, shortValue);
        modByteAndShort(byteValue, shortValue);
    }


    public static void subFloatAndDouble(float a, double b) {
        System.out.println("subtraction float and double: " + (a - b));
    }

    public static void sumIntAndLong(int a, long b){
        System.out.println("sum int and long: " + (a + b));
    }

    public static void mulFloatAndShort(float a, short b) {
        System.out.println("multiplication float and short: " + (a * b));
    }

    public static void divIntAndShort(int a, short b){
        System.out.println("division int and short: " + (a / b));
    }

    public static void modByteAndShort(byte a, short b){
        System.out.println("remainder of the division byte and short:" + (a % b));
    }
}
