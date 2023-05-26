
public class ArrayBidimensional1 {

	public static void main(String[] args) {
		String[][]nombresDeClase =new String [4][7];
		
		nombresDeClase [0][0]=null;
		nombresDeClase [0][1]=null;
		nombresDeClase [0][2]="Luis";
		nombresDeClase [0][3]="Espe";
		nombresDeClase [0][4]="Dani";
		nombresDeClase [0][5]="May";
		nombresDeClase [0][6]="David";
		
		nombresDeClase [1][0]="Moises";
		nombresDeClase [1][1]="Luis";
		nombresDeClase [1][2]="Miguel";
		nombresDeClase [1][3]="Francisco";
		nombresDeClase [1][4]="Abdela";
		nombresDeClase [1][5]="Manuel";
		nombresDeClase [1][6]="Jorge";
		
		nombresDeClase [2][0]="Lola";
		nombresDeClase [2][1]="Manu";
		nombresDeClase [2][2]="Pilar";
		nombresDeClase [2][3]=null;
		nombresDeClase [2][4]=null;
		nombresDeClase [2][5]="Jesus";
		nombresDeClase [2][6]="Edu";
		
		nombresDeClase [3][0]="Brioso";
		nombresDeClase [3][1]="Nadia";
		nombresDeClase [3][2]=null;
		nombresDeClase [3][3]=null;
		nombresDeClase [3][4]=null;
		nombresDeClase [3][5]="Alberto";
		nombresDeClase [3][6]=null;
		
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<7;j++) {
			System.out.println("Valor["+i+"]["+j+"]:"+ nombresDeClase[i][j]);
		}

	}
	}
}

