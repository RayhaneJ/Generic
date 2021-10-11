import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Noeud implements IArbre {
    private List<IArbre> feuilles;

    public Noeud(List<IArbre> feuilles){
        this.feuilles = feuilles;
    }

    @Override
    public int taille() {
        return feuilles.size();
    }

    @Override
    public boolean contient(Integer val) {
        return feuilles.contains(val);
    }

    @Override
    public Set<Integer> valeurs() {
        ArrayList<Integer> valeurs = new ArrayList<Integer>();
        foreach(Noeud var: ArrayList)
        return feuilles;
    }

    @Override
    public Integer somme() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
