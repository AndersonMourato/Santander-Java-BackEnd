package com.component.loja;

import com.component.aparelho.AparelhoiPhone;

public class LojaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AparelhoiPhone iPhone = new AparelhoiPhone();
		
		System.out.println("\n-------------- TELEFONICO --------------------");
		iPhone.atender();
		iPhone.ligar();
		iPhone.iniciarCorrerioVoz();
		
		System.out.println("\n-------------- INTERNET ----------------------");
		iPhone.exibirPagina();
		iPhone.adicionarNovaAba();
		iPhone.atualizarPagina();
		
		System.out.println("\n-------------- MUSICAL -----------------------");
		iPhone.selecionarMusica();
		iPhone.tocar();
		iPhone.pausar();
	}

}
