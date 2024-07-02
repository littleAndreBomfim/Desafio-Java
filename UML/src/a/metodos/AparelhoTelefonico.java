package a.metodos;

import a.telefonar.Atender;
import a.telefonar.IniciarCorreioVoz;
import a.telefonar.Ligar;

public class AparelhoTelefonico implements Atender, IniciarCorreioVoz, Ligar  {
	@Override
	public void Ligando() {
		System.out.println("Ligando para: " + 344123566);
	}

	@Override
	public void CorreioVoz() {
		System.out.println("Iniciando Correio de voz.");		
	}

	@Override
	public void Atendendo() {
		System.out.println("Atendendo");		
	}

}
