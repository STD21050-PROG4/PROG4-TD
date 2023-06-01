public class TestClassUniqueInstance {
    public static void main(String[] args){
        ClassUniqueInstance classUniqueInstance1 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance classUniqueInstance2 = ClassUniqueInstance.INSTANCE.getInstance();
        System.out.println("Test ClassUniqueInstance");
        System.out.println("1: "+classUniqueInstance1.getClick());
        System.out.println("2: "+classUniqueInstance2.getClick());
    }
}
