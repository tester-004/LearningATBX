package ex_Primitve_Data_Type_130724;

public class Lab006 {
    public static void main(String[] args) {
        int age = 98;
        System.out.println("Your age is -> " + age);

        // now using formatting
          // %d - int, byte, short, long
          // %c - char
          // %f - float
          // %s - string
        int age1 = 99;
        System.out.printf("Your age is -> %d", age1);

        System.out.println("\n");
        char a = 'Z';
        System.out.printf("%c", a);

        String name = "\nBajaj";
        System.out.printf("%s", name);

    }
}
