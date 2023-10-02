package flujoControl;

public class EstructurasDeControl { //Debe coincidir la clase con el nombre de nuestro documento.

	public static void main(String[] args) {//Todo dentro del metodo main
		
//Recordar que para que algo se ejecute, siempre debe ir dentro del metodo principal.
		
		
		//Primero se define una variable de tipo string donde almaceno un dato.
		String citaProgramada = "28-09-23"; //Dejamos en null y despues lo cambiamos a una fecha "28-09-23".
		//La variable declarada se inicia en null a proposito, para tener un  espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		System.out.println("Ya hay una cita programada, suerte pa' la proxima"); //Porque la variable ya está ocupada o llena
		
////////////////////////////////////////////////////////////////////////
		
		//Seleccionando una opcion y almacenando la variable opcion
		
		int opcion = 3;
		
		//Creamos un menú
		System.out.println("Menú del constulorio Diente Feliz");
		System.out.println("1. ¿Desea programar una cita?");
		System.out.println("2. Verificar cita programada");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir el menú");
		System.out.print("Seleccione una opción del menú (1-4): ");

		switch (opcion) {
		case 1: 
			System.out.println("Usted ha seleccionado la opción programar cita"); //Se agrega la logica para programar una cita
			break;
		case 2: 
			System.out.println("Verifique su cita, por favor");
			break;
		case 3: 
			System.out.println("Usted ha seleccionado la opción para cancelar cita, por favor confirme la cancelacion de su cita");
			break;
		case 4: 
			System.out.println("Usted ha seleccionado la opción salir del menú, gracias por comunicarse");
			break;
			default:
				System.out.println("La opción que ha seleccionado, no es valida, por favor seleccione una opción de nuestro menú (1-4).");
				break;
		}//Cierre del switch
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
//- Verificar de si la edad del paciente es apta para cierto tratamiento
//- Investigar operador ternario ?:
//- Ejemplo de consultorio

//Ingresando una edad del paciente
		int edadPaciente = 20;

		System.out.println("Evaluando si el paciente es apto para medicamento...");

		//Condicion if
		if (edadPaciente >= 18){
			System.out.println("Podemos otorgar su medicamento respectivo :)");
		} else {
			System.out.println("Lo sentimos, no podemos otorgarle un medicamento :(");
		} 

// - Operador ternario ejercicio

				String estado = (edadPaciente >= 60) ? " es de la tercera edad, requiere atención especial" : "no es de la tercera edad, no requiere atencion especial";

				System.out.println("El paciente " + estado);
		
		
		
		
		
	}// metodo 

}//clase
