package com.StreamAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.io.File;
import java.util.Map;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.stream.Collectors;

public class StreamDemo7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt"));
        Map<String, Integer> map= br.lines()
                .map(line->line.split(" "))
                .flatMap(wordsArr -> Arrays.stream(wordsArr))
                //.collect(Collectors.toMap(word->word, word->word.length(),
                .collect(Collectors.filtering(word->word.startsWith("h"),
                    Collectors.toMap(
                   word->word,
                   word->word.length(),
        //.collect(Collectors.groupingBy(word ->word.length()));
               //.collect(Collectors.joining(" ")); - it joins all the lines by the given value
       (s,e)-> s    //r(existing value),e(ne wvalue trying to get in) - for repeating or duplicate text
       )
                        ));
        System.out.println(map);

    }

}


/*
{all=3, hi=2} - it prints in random order, bcoz HashMap stores valus in random order
 */
