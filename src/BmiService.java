public class BmiService {
    public int bmi(double hM, int mKg) {
        double index = 0.0;


        if (hM > 0) {
            index = (int) mKg / (hM * hM);
        }
        return (int) index;
    }
}
