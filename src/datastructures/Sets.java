package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args){
//        1. Define a collection
//        LinkedHashSet - is in the order we have entered
//        HashSet - Random order
//        TreeSet - Alphabetical order
        Set<String> animals = new LinkedHashSet<>();

        //2. Adding elements to collection
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Pig");
        animals.add("Horse");
        System.out.println("No of animals are: "+animals.size()+". They are"+animals);
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
animals.add("Duck");

        System.out.println("No of animals are: "+animals.size()+". They are"+animals);

//        1. Define a collection
        Set<String> farmAnimals = new TreeSet<>();

        //2. Adding elements to collection
        farmAnimals.add("cow");
        farmAnimals.add("sheep");
        farmAnimals.add("pig");
        farmAnimals.add("chicken");
        System.out.println("Farm animals number is: "+farmAnimals.size()+". They are "+farmAnimals);


        //IntersectionSet (Only animals "and" farm animals)
Set<String> intercectionSet = new HashSet<>(animals);
        intercectionSet.retainAll(farmAnimals);
        System.out.println("Intersection of animals and farm animals is: "+intercectionSet);

//UnionSet (in both animals and farm animals
        Set<String> unionSet = new HashSet<>(animals);
        unionSet.addAll(farmAnimals);
        System.out.println("Union of animals and farm animals is: "+unionSet);

//Difference (anials but not in farmanimals)
        Set<String> differenceSet = new HashSet<>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("Differnce of animals and farm animals is: "+differenceSet);

    }
}
