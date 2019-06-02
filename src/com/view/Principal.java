package com.view;

import com.controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller.listaFuncionarios().forEach((Funcionario) -> System.out.println(Funcionario));

	}

}
