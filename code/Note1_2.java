public class Note1_2 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        System.out.println("\ntest1:");
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        System.out.println(i == j); //false
        System.out.println(i.equals(j)); //true
    }

    public static void test2() {
        System.out.println("\ntest2:");
        Integer i = new Integer(100);
        int j = 100;
        System.out.println(i.equals(j)); //true
        System.out.println(i == j);//true
    }
    public static void test3() {
        System.out.println("\ntest3:");
        Integer i = new Integer(100);
        Integer j = 100;
        System.out.println(i == j); //false
    }
    public static void test4() {
        System.out.println("\ntest4:");
        Integer i = 100;
        Integer j = 100;
        System.out.println(i == j); //true
    }
    public static void test5() {
        System.out.println("\ntest5:");
        Integer i = 200;
        Integer j = 200;
        System.out.println(i == j); //false
    }
}