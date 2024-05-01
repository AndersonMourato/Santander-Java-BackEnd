package com.component.aparelho;

import com.component.Internet.Internet;
import com.component.musical.Musical;
import com.component.telefonico.Telefonico;

public class AparelhoiPhone implements Internet, Musical, Telefonico {

	@Override
	public void ligar() {
		System.out.println("LIGANDO PARA CONTATO");
	}
	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");
	}
	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("ENVIANDO CORREIO DE VOZ");
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("NAVEGANDO NA INTERNET");
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("ABRINDO NOVA ABA");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA");
	}
	
	@Override
	public void  tocar() {
		System.out.println("TOCANDO MUSICA");
	}
	@Override
	public void  pausar() {
		System.out.println("PAUSANDO MUSICA");
	}
	@Override
	public void  selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA");
	}

}
