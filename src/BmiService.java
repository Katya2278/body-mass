public class BmiService {
    public int calculate(int maight, double height) {
        int index;


        double stature = (height * height);

        index = (int) (maight / stature);

        return index;
    }
}
