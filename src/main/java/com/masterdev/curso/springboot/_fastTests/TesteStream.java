package com.masterdev.curso.springboot._fastTests;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.masterdev.curso.springboot.clube.api.dto.ClubeRequestDTO;

public class TesteStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // adiciona dados ao list
        list.add( "Lisboa");
        list.add( "Porto");
        
        //list.stream().map(x-> x.toUpperCase()).forEach(System.out::println); 

        Stream<String> myStream = list.stream().map(i-> i+"----");

        myStream.forEach(System.out::println);


        
    }

}
