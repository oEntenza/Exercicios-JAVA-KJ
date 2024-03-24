package kao;

	public class TrianguloEquilatero {
	    private double lado;

	    public TrianguloEquilatero(double lado) {
	        this.lado = lado;
	    }

	    public double calcArea() {
	        return (lado * lado * Math.sqrt(3)) / 4;
	    }

	    public double calcPerimetro() {
	        return 3 * lado;
	    }

	    public double getLado() {
	        return lado;
	    }

	    public double getArea() {
	        return calcArea();
	    }

	    public double getPerimetro() {
	        return calcPerimetro();
	    }
}
