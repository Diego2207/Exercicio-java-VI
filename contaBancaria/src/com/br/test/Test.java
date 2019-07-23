package com.br.test;

import java.util.ArrayList;
import java.util.List;

import com.br.modelo.Brasileiro;
import com.br.modelo.Conta;

public class Test {

public static void main(String[] args) {
		
		//Criando a lista
		List<Brasileiro> listaPessoas = new ArrayList<Brasileiro>();
		
		
		Conta c = new Conta("0254-6", "Itaú", "6587", 200000.00) ;
		Brasileiro br = new Brasileiro("Diego", "Neris", 19, "Português", true, c);
		
		listaPessoas.add(br);
		
		for (Brasileiro conta : listaPessoas) {
			System.out.println(c);
		}	
	}
}
