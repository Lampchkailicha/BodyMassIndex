public class BmiService {
    public long calculate(long bodyMass, long height) {
        long bodyMassIndex = bodyMass * 10000 / (height * height);
        return bodyMassIndex;
    }
}
