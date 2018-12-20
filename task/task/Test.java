package task;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Test {

    public static void main(String[] args) {

        List<String> student = Stream.of("Valery Popov","Semyon Korzhev", "Peter Ivanov","Kolya Nesterenko","Maria Semenova").collect(Collectors.toList());
        List<String>subject = Stream.of("Mathematics", "Physics", "Astronomy", "History" ,"Ethics").collect(Collectors.toList());
        List<String> mark = Stream.of("3","4","5").collect(Collectors.toList());
        for(int i = 0;i<4; i++){
        System.out.println(student.get(i)+" "+ subject.get(0) + " - "+ mark.get(0)
                + subject.get(1) + " - "+ mark.get(1) +" "
                + subject.get(2) + " - " + mark.get(0) +" "
                + subject.get(3) + " - "+ mark.get(1) +" "
                + subject.get(4) + " - "+ mark.get(0));}

        System.out.println(student.get(4)+" "+ subject.get(0) + " - "+ mark.get(1)
                +" "+ subject.get(1) + " - "+ mark.get(1)  +" "
                +" "+ subject.get(2) + " - "+ mark.get(1) +" "
                +" "+ subject.get(3) + " - "+ mark.get(2) +" "
                +" "+ subject.get(4) + " - "+ mark.get(2));

    }
}
