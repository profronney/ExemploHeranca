package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Funcionario;
import br.ufjf.dcc.poo.model.Pessoa;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Afú");
		aluno.setCpf("001.654.678-87");
		aluno.setRg("MG-765432");
		aluno.setSexo("M");
		aluno.setMatricula("123456789");
		
		Professor professor = new Professor();
		professor.setNome("Ronney");
		professor.setCpf("001.867.765-98");
		professor.setRg("M-5432456");
		professor.setSexo("M");
		professor.setSiape("123546");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Carol");
		funcionario.setCpf("004.543.765-76");
		funcionario.setRg("MG-654321");
		funcionario.setSexo("F");
		funcionario.setRegistro("F567899");
		
		

	}

}
