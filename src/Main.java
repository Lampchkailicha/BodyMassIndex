public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        long bodyMassIndex = service.calculate(65, 170);
        System.out.println(bodyMassIndex);
    }
}
