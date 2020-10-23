import java.util.Scanner;
public class Final{

	public static int sumatoria(int numero){
		int contador = numero;
		int sumatoria = 0;

		while(contador != 0){
			sumatoria = sumatoria + contador;
			contador--;
		}
		return sumatoria;
	}

	public static int factorial(int numero){
		if(numero < 0){    
            System.out.println("No se puede calcular el factorial de un numero negativo");
            return -1;
        }

        if(numero == 0 || numero == 1){
            return 1;
        }
        
        int resultado = numero;
        for(int i=(numero-1);i>1;i--){
            resultado = resultado*i;
        }
        return resultado;        
    }

    public static double promedio(){
    	Scanner scan = new Scanner(System.in);
    	int cantidaddenumeros = 0, sumatoria = 0;
    	double promedio = 0;
    	int[] numerosprom;

    	System.out.println("Ingrese a cuantos numeros se les sacara un promedio: ");
    	cantidaddenumeros = scan.nextInt();
    	numerosprom = new int[cantidaddenumeros];

    	System.out.println("Ingrese los numeros: ");
    	for(int i=0; i<numerosprom.length; i++){
    		numerosprom[i] = scan.nextInt();
    		sumatoria = sumatoria + numerosprom[i];
    	}
    	promedio = (double) sumatoria/cantidaddenumeros;
    	System.out.println("El promedio de los numeros ingresados es: " + promedio);
    	return promedio;
    }

	public static double raizenesima(double indice, int numero){
		double resultado;

		resultado = Math.pow(numero,1/indice);
		return resultado;
	}
	public static void main(String[] args) {
		int opcion = 0;
		int numero = 0;
		int indice = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Hola, tenemos las siguientes opciones: ");
		System.out.println("1. Sumatoria de un numero.");
		System.out.println("2. Factorial de un numero.");
		System.out.println("3. Promedio de numeros.");
		System.out.println("4. Raiz enesima (la que tu quieras) de un numero.");
		System.out.println("Por favor ingresa el numero (del 1 al 4) de la operacion que quieres realizar: ");
		opcion = scan.nextInt();

		switch(opcion){
			case 1: 
			System.out.println("Por favor ingresa el numero al cual le quieres calcular la sumatoria (debe ser entero): ");
			numero = scan.nextInt();
			System.out.println("La sumatoria del numero " + numero + ", es " + sumatoria(numero));
			break;

			case 2:
			System.out.println("Por favor ingresa el numero al cual le quieres calcular el factorial (debe ser entero): ");
			numero = scan.nextInt();
			System.out.println("El factorial del numero " + numero + ", es " + factorial(numero));
			break;

			case 3:
			promedio();
			break;

			case 4:
			System.out.println("Por favor ingresa el numero al cual le quieres sacar una raiz: ");
			numero = scan.nextInt();
			System.out.println("Por favor ingresa el indice de la raiz (Por ejemplo, raiz cuadrada es 2, raiz cubica es 3, etc): ");
			indice = scan.nextInt();
			System.out.println("El valor de la raiz enesima, con indice " + indice + ", del numero " + numero + ", es " + raizenesima(indice,numero));
			break;

		}

	}
}
