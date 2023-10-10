import java.util.LinkedList;

class LenkedLest {
    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<>();
        
        animals.add("Dog");
        animals.addFirst("Cat");
        animals.addLast("Elephant");
        animals.add(1, "Lion");
        
        System.out.println("LinkedList: " + animals);
        
        animals.size();
        System.out.println(animals.size());
               
//        animals.remove();
//        animals.remove(1);
//        animals.removeFirst();
//        animals.removeLast();
        
//        System.out.println("LinkedList: " + animals);        
//        boolean containsLion = animals.contains("Lion");
//        System.out.println(containsLion);
        
        if(animals.contains("Lion")){
        System.out.println("True");
    }else{
            System.out.println("False");
        }
    }
}