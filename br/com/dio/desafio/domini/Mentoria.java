package br.com.dio.desafio.domini;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{
   
    private LocalDate data;

    
    public Mentoria(){

    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    
   @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return  XP_PADRAO + 20d;
    }
    
    @Override
    public String toString(){
        return "Titulo = "+getTitulo() + " descrição = "+ getDescricao()+ " data =  "+ data;
        
    }

    
}
