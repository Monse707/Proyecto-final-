public class Main {
    public static void main(String[] args){
        TreeMap arbol= new TreeMap();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(53);
        System.out.println(" ");
        arbol.dispararinorden();
        System.out.println("INORDEN");
        System.out.println(" ");
        arbol.dispararposorden();
        System.out.println("POSORDEN");
        System.out.println(" ");
        arbol.dispararPreorden();
        System.out.println("PREORDEN");
        System.out.println(" ");
        arbol.dispararPreorden();

    }
}
