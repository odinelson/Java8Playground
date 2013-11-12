/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java8playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java8playground.model.Contato;

/**
 *
 * @author Odilon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Contato> contatos = Arrays.asList(
            new Contato("Fulano Silva", "8800-0000", "fulano@localhost"),
            new Contato("José Silva", "8800-0001", "ze@localhost"),
            new Contato("Sicrano Oliveira", "8800-0002", "sicrano@localhost"),
            new Contato("Maria Silva", "8800-0099", "silvamaria@localhost"),
            new Contato("Josefa Alves", "8800-0090", "zefa@localhost")
        );
        
        System.out.println("-- Ordenando por nome:");
        contatos.sort((c1,c2) -> c1.getNome().compareTo(c2.getNome()));
        contatos.forEach(c -> System.out.println(c));
        
        System.out.println("-- Ordenando por telefone:");
        contatos.sort((c1,c2) -> c1.getFone().compareTo(c2.getFone()));
        contatos.forEach(System.out::println);  //referenciando diretamente o metodo
        
        System.out.println("-- Ordenando por e-mail:");
        contatos.sort((c1,c2) -> c1.getEmail().compareTo(c2.getEmail()));
        contatos.forEach(System.out::println);
        
        System.out.println("-- Apenas os Silva:");
        contatos.stream().filter(
            (c) -> c.getSobreNome().equals("Silva")
        ).forEach(System.out::println);
                
    }
    
}
