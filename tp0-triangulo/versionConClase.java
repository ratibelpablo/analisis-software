package figGeometrica;

public class Program {

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		if (t.ingresar())
			System.out.println(t.clasificacion());
	}
}
public class Triangulo {
	private Integer a;
	private Integer b;
	private Integer c;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(isr);

	public Boolean ingresar() {
		String line = "";
		try {
			System.out.println("Ingrese los lados separados por un espacio: ");
			line = bf.readLine();
			String[] data = line.split(" ");
			this.a = Integer.parseInt(data[0]);
			this.b = Integer.parseInt(data[1]);
			this.c = Integer.parseInt(data[2]);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public Boolean esTriangulo() {
		return (a + b > c && a + c > b && b + c > a);
	}

	public String clasificacion() {
		if (this.esTriangulo())
			if (a == b && a == c)
				return "Equilareto";
			else if (a != b && a != c && b != c)
				return "Escaleno";
			else
				return "Isosceles";
		else
			return "No forma triangulo";
	}

	public Integer perimetro() {
		return a + b + c;
	}

	public Double area() {
		Double s = Double.parseDouble(this.perimetro().toString()) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public Triangulo() {
		this.a = -1;
		this.b = -1;
		this.c = -1;
	}

	public Triangulo(Integer a, Integer b, Integer c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
