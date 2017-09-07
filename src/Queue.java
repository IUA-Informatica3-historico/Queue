public class Queue<T> {
    private Nodo<T> frente;
    private Nodo<T> fondo;

    public Queue() {
        frente = null;
        fondo = null;
    }

    public void poner(T dato) {
        if (null == fondo) {
            fondo = new Nodo<T>(dato, null);
            frente = fondo;
        } else {
            fondo.setNext(new Nodo<T>(dato, null));
            fondo = fondo.getNext();
        }
    }


}
