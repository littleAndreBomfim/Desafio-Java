package a.Apple;

import a.metodos.AparelhoTelefonico;
import a.metodos.NavegadorNaInternet;
import a.metodos.ReprodutorMusical;

public class Iphone {
	public static void main(String[] args) {
		ReprodutorMusical reprodutormusical = new ReprodutorMusical();
		reprodutormusical.Pausando();
		reprodutormusical.SelecionandoMusica();
		reprodutormusical.Tocando();
		
		AparelhoTelefonico aparelhotelefonico = new AparelhoTelefonico();
		aparelhotelefonico.Atendendo();
		aparelhotelefonico.CorreioVoz();
		aparelhotelefonico.Ligando();
		
		NavegadorNaInternet navegadornainternet = new NavegadorNaInternet();
		navegadornainternet.AdicionandoNovaAba();
		navegadornainternet.AtualizandoPagina();
		navegadornainternet.ExibindoPagina();
	}
}
