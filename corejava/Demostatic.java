public class Demostatic {
    static int age;
static{
    age =18;
    System.out.println("staic block executed first");
    System.out.println(age);

    }

    public static void main(String[] args) {
        System.out.println("second miain block");

    }

}
