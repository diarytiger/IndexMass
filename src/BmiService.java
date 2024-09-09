public class BmiService {
    public int calculate(double height, int weight) {
        int index = (int) (weight / Math.pow(height, 2));
        return index;
    }
}
