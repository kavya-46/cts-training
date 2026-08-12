package com.FunctionalInterface;
import java.util.*;
import java.util.List;
import java.util.Optional;
class Children {
    private int id;
    private String name;
    private String city;
    public Children(int id,String name,String city) {
        this.id = id;
        this.name = name;
        this.city=city;
    }
    public int getId() { return id; }
    public String getName() { return name; }
   // public String getCity() { return city; }

    public Optional<String> getCity() {
     return Optional.ofNullable(city);
      //  return Optional.of(city); - doesnt accept null values
    }
}

public class OptionalClass {
    public static void main(String[] args) {
        List<Children> child =  List.of(
                new Children(101,"ramesh","bbsr"),
                new Children(102,"sanjk",null),
                new Children(103,"adnka","bbsr")

        );
        Children c = child.get(0);



        Optional<String> city = c.getCity();

     //   city.ifPresent(s-> System.out.println(s.length()));
        city.ifPresent(System.out::println);


//        if(city.isPresent())
//           System.out.println(city.get().length());
//
//        else
//            System.out.println("Na");


        String name = c.getName();
        System.out.println(name.toUpperCase());

        int id= c.getId();
        System.out.println(id);
    }
}
