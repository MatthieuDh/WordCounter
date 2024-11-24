package org.spring;

import org.spring.counter.Counter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


import java.util.Scanner;
@Component
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Counter wordCounter = context.getBean(Counter.class);

        System.out.println(wordCounter.countWords(readInput()));



    }

    public static String readInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}