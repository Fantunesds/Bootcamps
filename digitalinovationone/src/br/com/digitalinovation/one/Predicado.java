package br.com.digitalinovation.one;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Preticate<String> estaVazio = valor -> valor.isEmpty();
		System.out.println(estaVazio.test(t: ""));
		System.out.println(estaVazio.test(t: "Joao"));

	}

}
