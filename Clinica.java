package IMC;


public class Clinica {
   public static void main(String[] args) {
	
	Doctor pm = new Doctor();
	
	pm.registroObserver(new Pessoa());
	
	pm.setMesurements(80.0, 1.72);
	
} 
}
