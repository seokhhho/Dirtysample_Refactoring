package ac.kr.ajou.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public List<String> filterString(List<String> stringList, String filterString){
       return  stringList.stream()
                .filter(string -> string.equals(filterString))
                .collect(Collectors.toList());


//
//        List<String> resultList = new ArrayList<>();
//        for (String string : stringList){
//            if(string.equals(filterString)){
//                resultList.add(string);
//            }
//        }
//        return resultList;
    }
//    public List<Person> filterByName(List<Person> personList, String filterName){
//        return  personList.stream()
//                .filter(string -> string.equals(filterName))
//                .map(person -> person.getAddress())
//                    .collect(Collectors.toList());
//    }
//
//    public int getAggregationAge(List<Person> personList, String filterName){
//        return  personList.stream()
//                .filter(string -> string.equals(filterName))
//                .mapToInt(person -> person.getAddress())
//                .sum();
//    }
}
