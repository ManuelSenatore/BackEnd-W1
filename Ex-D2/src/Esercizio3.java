import java.util.Arrays;

public class Esercizio3 {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "Mario", "Rossi", "abc@abc.it", "22/09/22\n");
		c1.Print();
		
		Articolo a1 = new Articolo("Note Book", 759.99, 12);
		Articolo a2 = new Articolo("Mouse", 39.99, 26);
		Articolo a3 = new Articolo("Cuffie", 29.99, 6);
		a1.Print();
		a2.Print();
		a3.Print();
		Carrello carr1 = new Carrello();
		carr1.setCliente(c1.idCliente);
		carr1.setArticoli(new String[] {a1.descrizioneArticolo, a2.descrizioneArticolo, a3.descrizioneArticolo});
		carr1.setPrezzo(new double[] {a1.prezzo + a2.prezzo + a3.prezzo});
	}
}

class Articolo{
	int codiceArticolo;
	String descrizioneArticolo;
	double prezzo;
	int numeroPezziDisp;
	
	private static int internalId = 1234;
	
	Articolo( String descrizioneArticolo, double prezzo, int numeroPezziDisp){
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.numeroPezziDisp = numeroPezziDisp;
		this.setId();
	}
	void Print() {
		System.out.println("Codice: " + codiceArticolo + "\nDescrizione: "
	+ descrizioneArticolo + "\nPrezzo: " + prezzo + " €\nDisponibili: " + numeroPezziDisp + "\n");
	}
	private void setId() {
		this.codiceArticolo = internalId++;
	}
}

class Cliente{
	int idCliente;
	String nome;
	String cognome;
	String email;
	String data;
	
	Cliente(int idCliente, String nome, String cognome, String email, String data){
		this.idCliente = idCliente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.data = data;
	}
	void Print() {
		System.out.println("Id: " + idCliente + "\nNome: "
	+ nome + "\nCognome: " + cognome + "\nEmail: " + email + "\nIscrizione: " + data);
	}
}

class Carrello{
	
	
	void setCliente(int id) {
		 System.out.println("Cliente: " + id);
	}
	void setArticoli(String[] art) {
		System.out.println("\nArticoli: " +Arrays.toString(art));
	}
	void setPrezzo(double[] prezzo) {
		System.out.println("\nPrezzo: " + Arrays.toString(prezzo));
	}
	
}
