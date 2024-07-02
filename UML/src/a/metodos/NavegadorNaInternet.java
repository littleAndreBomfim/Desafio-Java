package a.metodos;

import a.navegar.AdicionarNovaAba;
import a.navegar.AtualizarPagina;
import a.navegar.ExibirPagina;

public class NavegadorNaInternet implements AdicionarNovaAba, AtualizarPagina, ExibirPagina {

	@Override
	public void ExibindoPagina() {
		System.out.println("Exibindo Pagina");		
	}

	@Override
	public void AtualizandoPagina() {
		System.out.println("Atualizando Pagina");		
	}

	@Override
	public void AdicionandoNovaAba() {
		System.out.println("Adicionando Nova Aba");		
	}
}
