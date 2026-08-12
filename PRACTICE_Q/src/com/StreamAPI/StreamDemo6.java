package com.StreamAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;


/*
stream sources
- stream from i/o- files,buffered reader,filereader
stream operations
-intermediate opr
--flatmap
-terminal opr
--collect
 */
public class StreamDemo6 {
    public static void main(String[] args) throws Exception {
//Files.list(Path.of("C:\\Org Eclipse IDE 2025-09 R\\FileHandling")) //returns the entries(files and directories in the given directory
//Files.lines(Path.of("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt")) //returns the lines of text from the file
//        .map(line->line.toUpperCase())
//        .forEach(System.out::println);
           //     .filter(path->new File(path.toUri()).isDirectory())


        /*
        A URI stands for Uniform Resource Identifier.
        It’s a standardized way to identify or locate a resource
        (like a file, webpage, or image) using a string of characters.
        we use toUri(),when you need a universal identifier. or
        passing the resource to APIS that expect URIs for network operations
         */

       // .forEach(System.out::println);



      //  BUFFERED READER
        BufferedReader br = new BufferedReader(new FileReader("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt"));
br.lines()
                //
        // long count = br.lines()
        /*This is a transforming operation. It takes each item in a stream,
        passes it through a function you provide,
         and replaces the original item with the result of that function.*/

                .map(line->line.split(" ")) //prints the objs of array - stream of string of array
               // .count();
                .flatMap(wordsArr -> Arrays.stream(wordsArr)) //Stream<String> + Stream<String>= Stream<String>

               .forEach(System.out::println);
//.collect(Collectors.toList());
//.collect(Collectors.toCollecction(ArrayList::new));
// .collect(Collectors.toMap(null,null));
            //    .count(); //stream
       // System.out.println(count);
                //.forEach(arr -> System.out.println(Arrays.toString(arr)));
//sout(count);


    }
}
