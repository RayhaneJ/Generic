import java.util.Set;

public interface IArbre {
    int taille(); // nombre de valeurs
    boolean contient(final Integer val); // vrai si val est contenue dans l'arbre,

    Set<Integer> valeurs(); // ensemble des valeurs différentes dans l'arbre
    Integer somme(); // somme des valeurs
    Integer min(); // valeur minimale
    Integer max(); // valeur maximale
    boolean estTrie(); // vrai si l'arbre est trié, faux sinon
}