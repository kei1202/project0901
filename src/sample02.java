import newsample.Sample;

public class sample02 {

    int a;

    void varTest(Sample sample) {
        sample.a++;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 1;
        sample.varTest(sample);
        System.out.println(sample.a);
    }
}
