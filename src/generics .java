class demo<T> {
    T i;
    public void add( T i1){
        i=i1;

    }
    public T Return(){
        return i;
    }




}
    public class Generics_class{
    public static void main(String[] args) {
        demo<Integer> d=new demo<Integer>();
        demo<String> d2=new demo<String>();
        d.add(4);
        d2.add("hello");
        System.out.println(d.Return());
        System.out.println(d2.Return());




    }

}
