package a.metodos;

import a.musica.Pausar;
import a.musica.Tocar;
import a.musica.SelecionarMusica;

public class ReprodutorMusical implements SelecionarMusica, Pausar, Tocar {

	@Override
	public void Tocando() {
		System.out.println("Tocando");		
	}

	@Override
	public void Pausando() {
		System.out.println("Pausando");		
	}

	@Override
	public void SelecionandoMusica() {
		System.out.println("Selecionando Musica" + "Payphone Coldplay");		
	}
}
