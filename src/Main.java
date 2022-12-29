import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new  Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        List<String> palavras = new ArrayList<>();

        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("mentoria curso Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//       System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootmcap java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlunos = new Dev();
        devAlunos.setNome("Ellen");
        devAlunos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Insritos" + devAlunos.getConteudosInscritos());
        devAlunos.progedir();
        System.out.println("-" );
        System.out.println("Conteudos Insritos" + devAlunos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devAlunos.getConteudoConcluidos());
        System.out.println("XP"+ devAlunos.calcularTotalXp());

        System.out.println("----------------" );

        Dev devAlunos1 = new Dev();
        devAlunos1.setNome("Joana");
        devAlunos1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Insritos" + devAlunos1.getConteudosInscritos());
        devAlunos1.progedir();
        devAlunos1.progedir();
        System.out.println("-" );
        System.out.println("Conteudos Insritos" + devAlunos1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devAlunos1.getConteudoConcluidos());
        System.out.println("XP"+ devAlunos1.calcularTotalXp());




    }
}
