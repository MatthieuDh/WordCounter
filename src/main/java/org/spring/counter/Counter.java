package org.spring.counter;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Counter {


    public Map<String,Integer> countWords(String sentence){
        //Remove punctuation and split the sentence into words
        String[]words = sentence.toLowerCase()
                .replaceAll("[^a-zA-Z\\s]", "")
                .split("\\s");

        Map<String,Integer>wordCounts = new HashMap<>();

        for (String word:words){
            if(!word.isEmpty()){ //Ignore empty strings
                wordCounts.put(word, wordCounts.getOrDefault(word,0)+1);//If the word already exists in the Map, increase the value (count) by 1
            }
        }
        return wordCounts;
    }
}
