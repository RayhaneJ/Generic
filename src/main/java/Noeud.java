import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud implements IArbre {
    private List<IArbre> feuilles;

    public Noeud(List<IArbre> feuilles){
        this.feuilles = feuilles;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for(final IArbre a : feuilles){
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(Integer val) {
        for(final IArbre a : feuilles){
            if(a.contient(val))
                return true;
        }
        return false;
    }

    @Override
    public Set<Integer> valeurs() {
        Set<Integer> valeurs = new HashSet<Integer>();
        for(IArbre noeud : feuilles) {
            valeurs.addAll(noeud.valeurs());
        }
        return valeurs;
    }

    @Override
    public Integer somme() {
        int somme = 0;
        for(IArbre noeud : feuilles) {
            somme = somme + noeud.somme();
        }
        return somme;
    }

    @Override
    public Integer min() {
        int min = 0;
        for(IArbre noeud : feuilles) {
            if(noeud.min() < min)
                min = noeud.min();
        }
        return min;
    }

    @Override
    public Integer max() {
        int max = 0;
        for(IArbre noeud : feuilles) {
            if(noeud.min() > max)
                max = noeud.max();
        }
        return max;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
