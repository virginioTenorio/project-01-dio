package main;

import java.time.LocalDate;

import br.com.dio.desafio.domini.Curso;
import br.com.dio.desafio.domini.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargahoraria(8);
       
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso);
        System.out.println(mentoria);





    }
    
}
