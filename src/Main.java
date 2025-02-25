public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int maight = 98;// кг
        double height = 1.87;//м

        int index = service.calculate(maight, height);
        System.out.println(index);
    }
}