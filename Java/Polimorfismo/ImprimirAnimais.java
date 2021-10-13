package polimorfismo3;

public class ImprimirAnimais {

	public static void main(String[] args) {
		TestaAnimais t = new TestaAnimais();
		Cachorro novoDog = new Cachorro();
		Cavalo novoHorse = new Cavalo();
		Preguica novaPreg = new Preguica();
		
		novoDog.setNome("Rex");
		novoDog.setIdade(5);
		
		novoHorse.setNome("Trovão");
		novoHorse.setIdade(6);
		
		novaPreg.setNome("Felipe");
		novaPreg.setIdade(30);
		
		System.out.println("O dog se chama: " + novoDog.getNome());		
		System.out.println(novoDog.getNome() + " tem " + novoDog.getIdade() + " anos." );
		t.fazerAnimaisSom(new Cachorro());
		
		System.out.println();
		
		System.out.println("O cavalo se chama: " + novoHorse.getNome());		
		System.out.println(novoHorse.getNome() + " tem " + novoHorse.getIdade() + " anos." );
		t.fazerAnimaisSom(new Cavalo());
			
		System.out.println();
		
		System.out.println("A preguiça se chama: " + novaPreg.getNome());		
		System.out.println(novaPreg.getNome() + " tem " + novaPreg.getIdade() + " anos." );
		t.fazerAnimaisSom(new Preguica());
	}
}
