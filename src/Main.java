public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float Bmi = service.calculate(1.72F, 55F);
        System.out.println(Bmi);
    }
}



