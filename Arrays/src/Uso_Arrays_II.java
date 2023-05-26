
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises=new String[8];
		
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		/*for(int i=0; i<paises.length; i++) {//asi declare todos los arrays con for normal
			System.out.println("Pais " + (i+1) + " " + paises[i]);
		}*/
		
		for(String elemento:paises) {//de esta manera con el nuevo bucle for, no preocuparse de que posicion partes y
									//hasta que posición llegas
			System.out.println("Pais: " + elemento);
		}

	}

}
