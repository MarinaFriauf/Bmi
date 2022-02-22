public class BmiService {
    public float calculate(float growth, float weight) {
    float Bmi = weight / (growth * growth);
        return Bmi;
    }
}
