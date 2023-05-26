
public class GuardarNombresConLength {

	public static void main(String[] args) {
	

			
				//  De esta forma voy guardando directamente los valores del String
				String[] nombres= {"Luis", "Esperanza", "Dani", "May", "David"};
				
				for(int i=0; i<nombres.length;i++) {
					if(nombres[i].equals("Esperanza"))
						System.out.println("Su apellido es: "+nombres[i]+" Olmedo");
					
					System.out.println(nombres[i]);
				}

	}		
}
