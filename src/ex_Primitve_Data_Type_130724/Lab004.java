package ex_Primitve_Data_Type_130724;

public class Lab004 {
    public static void main(String[] args) {
        byte a = 10;
        System.out.println(a);
       // int age = 122; // its a bigger container and byte takes -127 to 128. If we will take int memory loss.
        byte age1 = 122;

        System.out.println(age1);

        //byte c = 128; // giving error because its take only -127 to 128 value, so we take int because its take more memory
        int c = 128;
        System.out.println(c);

    }
}
