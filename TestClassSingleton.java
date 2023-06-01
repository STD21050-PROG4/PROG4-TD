public class TestClassSingleton {
    public static void main(String[] args) {
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        ClassSingleton classSingleton2 = ClassSingleton.getInstance();

        System.out.println("Test ClassSingleton");
        System.out.println("1: "+classSingleton1.getDescription());
        System.out.println("2: "+classSingleton2.getDescription());
    }
}
