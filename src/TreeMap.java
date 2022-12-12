public class TreeMap {
    Nodo inicial;
    public TreeMap(){
        this.inicial=null;
    }
    public void insertar(int valor){
        if(this.inicial == null){
            this.inicial=new Nodo(valor);
        }else{
            this.inicial.insertr(valor);
        }
    }
    public void dispararPreorden(){
        this.preorden(this.inicial);
    }
    public void preorden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
            System.out.print(nodo.getpuntuacion()+ ", ");
            preorden((nodo.getNodoIzquierdo()));
            preorden(nodo.getNodoDerecho());
        }
    }
    public void dispararinorden(){
        this.inorden(this.inicial);
    }
    public void inorden(Nodo nodo){
        if(nodo == null){
            return;
        }else{

            inorden((nodo.getNodoIzquierdo()));
            System.out.print(nodo.getpuntuacion()+ ", ");
            inorden(nodo.getNodoDerecho());
        }
    }
    public void dispararposorden(){
        this.posorden(this.inicial);
    }
    public void posorden(Nodo nodo){
        if(nodo == null){
            return;
        }else{

            posorden((nodo.getNodoIzquierdo()));
            posorden(nodo.getNodoDerecho());
            System.out.print(nodo.getpuntuacion()+ ", ");
        }
    }






}