public class Paire<T1, T2> implements IPaire {
    private T1 x;
    private T2 y;

    public Paire(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public T1 fst() {
        return x;
    }

    public T2 snd(){
        return y;
    }

    public <T3> Paire<T3, T2> changeFst(T3 x){
        return new Paire<T3, T2>(x, y);
    }

    public <T4> Paire<T1, T4> changeSnd(T4 y){
        return new Paire<T1, T4>(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + " " + y + ") :: Paire[" + x.getClass() + "," + y.getClass() + "]";
    }
}
