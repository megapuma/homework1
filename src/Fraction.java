public class Fraction {
    public int num;
    public int den;

    Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        this.normalize();
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    private int getGcd() {
        int a = num;
        int b =den;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;}
            else {
                b %= a;}
        }
        return a + b;}
    void normalize(){
        int gcd = getGcd();
        num /= gcd;
        den /= gcd;
    }















}
