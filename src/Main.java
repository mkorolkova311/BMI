public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.6;
        double weight = 60;
        double BMI = service.calculate(height,weight);
        System.out.println(BMI);
    }
}
