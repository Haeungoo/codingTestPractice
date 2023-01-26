package org.example.programmers.Lv2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lv2_printer_v2 {


    public static void main(String[] args) {
        System.out.println(function_queue(new int[]{2,1,3,2},2));
        System.out.println(function_queue(new int[]{1,1,9,1,1,1},0));
    }

    public static int function_queue(int[] priorities, int location){
        Documents documents = IntStream.range(0, priorities.length)
                .mapToObj(id -> new Document(id, priorities[id]))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Documents::new));
        return Printer.calculateOrderOf(documents, Document.of(location));
    }

    private static class Printer{
        public static Integer calculateOrderOf(Documents documents, Document targetDocument){
            Integer popCount = 1;

            while(!documents.popNextDocument().equals(targetDocument)){
                popCount++;
            }

            return popCount;
        }
    }

    private static class Documents{
        private final List<Document> documents;

        public Documents(List<Document> documents){
            this.documents = documents;
        }

        public Document popNextDocument(){
            Document highestPriorityDocument = Collections.max(documents);
            Integer index = documents.indexOf(highestPriorityDocument);
            documents.remove(highestPriorityDocument);

            for(int i = 0; i < index; i++){
                documents.add(documents.get(0));
                documents.remove(0);
            }

            return highestPriorityDocument;
        }
    }

    private static class Document implements Comparable<Document>{
        private final Long id;
        private final Integer priority;

        public Document(Integer id, Integer priority){
            this(id.longValue(), priority);
        }

        public static Document of(Integer id){
            return new Document(id, 0);
        }

        public Document(Long id, Integer priority){
            this.id = id;
            this.priority = priority;
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            Document document = (Document)o;
            return Objects.equals(id, document.id);
        }

        @Override
        public int hashCode(){
            return Objects.hash(id);
        }

        @Override
        public int compareTo(Document other){
            return this.priority.compareTo(other.priority);
        }
    }



}
