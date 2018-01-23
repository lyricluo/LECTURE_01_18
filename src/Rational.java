public class Rational {

    private int num;
    private int denom;

    public Rational(int num, int denom){
	this.num = num;
	this.denom = denom;
    }

    public static void main(String [] args) {
	Rational r = new Rational(3,4);
	System.out.println("r = " + r);
	// System.out.println("r = " + r.toString());
    }

    @Override
    public String toString() {
	return this.num + "/" + this.denom;
    }
    
}

