import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes","Sair"));
		int opcao = mainMenu.getSelection();
		while(opcao!= 4){
			
			System.out.println(opcao  + "foi selecionada");
			
			opcao = mainMenu.getSelection();
			
		}
		System.out.println("Fim");
	}

}