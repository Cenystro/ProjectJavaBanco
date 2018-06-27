public class Banco {
	public static void main (String args[]) {
		//Constutor é um metodo
		//construtor tem o mesmo nome da classe
		//uma classe pode ter mais de um construtor
		//um construtor pode ter zero, um ou mais parametros.
		//um construtor nao tem valor de retorno
		//um construtor é sempre chamado com o valor new
	Correntista c1 = new Correntista("Joao");
	Correntista c2 = new Correntista("Maria");
	Correntista c3 = new Correntista("Claudio");
	Correntista c4 = new Correntista("Maura");
	
	System.out.println(c1.getCodigo() + " - " + c1.getNome());
	System.out.println(c2.getCodigo() + " - " + c2.getNome());
	System.out.println(c3.getCodigo() + " - " + c3.getNome());
	System.out.println(c4.getCodigo() + " - " + c4.getNome());
	}

}
