
public class Main {
    public static void main(String[] args){
        node test = new node(5);
        test = test.add(test, 3);
        test = test.add(test, 4);
        test.print(test);
        test.append(test,12);
        test.print(test);
        test = test.remove(test);
        test.print(test);
        test.pop(test);
        test.print(test);
        System.out.println(test.length(test));
        test.insert(test, 14,1);
        test.print(test);
    }
}
