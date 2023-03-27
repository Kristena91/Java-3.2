public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.bmi(1.68, 65);
        System.out.println(index);

    }
}