package main;

import java.time.LocalDate;

import br.com.dio.desafio.domini.Bootcamp;
import br.com.dio.desafio.domini.Curso;
import br.com.dio.desafio.domini.Dev;
import br.com.dio.desafio.domini.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElias = new Dev();
        devElias.setNome("Camila");
        devElias.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devElias.getConteudosInscritos());
        devElias.progredir();
        devElias.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devElias.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devElias.getConteudosConcluidos());
        System.out.println("XP:" + devElias.calcularTotalXp());

        System.out.println("-------");

        Dev devTenorio = new Dev();
        devTenorio.setNome("Joao");
        devTenorio.increverBootcamp(bootcamp);;
        System.out.println("Conteúdos Inscritos João:" + devTenorio.getConteudosInscritos());
        devTenorio.progredir();
        devTenorio.progredir();
        devTenorio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devTenorio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devTenorio.getConteudosConcluidos());
        System.out.println(devTenorio.calcularTotalXp());

    }

}
