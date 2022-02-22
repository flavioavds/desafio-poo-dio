package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);		
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescrcao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devFlavio = new Dev();
		devFlavio.setNome("Flavio");
		devFlavio.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Flavio " + devFlavio.getConteudoInscritos());
		
		devFlavio.progredir();
		devFlavio.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Flavio " + devFlavio.getConteudoInscritos());
		System.out.println("Conteudos Concluidos Flavio " + devFlavio.getConteudoConcluidos());
		System.out.println("XP: " + devFlavio.calcularXp());
		
		System.out.println("---------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudoInscritos());
		
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudoInscritos());
		System.out.println("Conteudos Concluidos Camila " + devCamila.getConteudoConcluidos());
		System.out.println("XP: " + devCamila.calcularXp());
		

	}

}
