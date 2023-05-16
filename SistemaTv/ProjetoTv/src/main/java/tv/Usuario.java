package tv;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		System.out.println("Tv Ligada ? " + smartTv.ligada);
		
		System.out.println("Canal Atual: " +smartTv.canal);
		smartTv.mudarCanal(14);
		System.out.println("Mudando de Canal " +smartTv.canal);
		
		System.out.println("Volume Atual: " +smartTv.volume);
		smartTv.adiminuirVolume();
		smartTv.adiminuirVolume();
		System.out.println("Ajustando Volume  " +smartTv.volume);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Ajustando Volume  " +smartTv.volume);
		
		
		smartTv.ligar();
		System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
	
	
	
	
	
	
	
	}

}
