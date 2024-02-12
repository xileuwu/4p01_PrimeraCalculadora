import java.util.Scanner; 
	public class A {
		public static void main (String [] args) {
			Scanner in = new Scanner(System.in);
			String saborhelado; //Declararlo
			System.out.println("Cual es tu sabor de helado favorito?");
			saborhelado = in.nextLine (); 
			System.out.println("Tu sabor elegido fue: " + saborhelado);
		}
	}