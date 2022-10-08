public class Main {
    public static void main(String[] args) {
        Klass klass=new Klass();
        klass.setName("Math");
        klass.setMethod(" math.sqart , math.pow , math.round , math.ceil , math.floor ");
        klass.setType(" string , type casting jana random sandar");
        klass.setSymbol(" + , - , * , / , %");

        System.out.println(klass.getName());
        System.out.println(klass.getMethod());
        System.out.println(klass.getType());
        System.out.println(klass.getSymbol());
    }
}