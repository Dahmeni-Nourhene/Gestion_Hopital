import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecins {
    private Set<Medecin> setM;

    public SetMedecins(Set<Medecin> setM) {
        this.setM = setM;
    }


    public void ajouterMedecin(Medecin m) {
      setM.add(m);
    }
    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(patient -> patient.getCin()==cin);
    }
    /* Avec l’api Stream */
    public void afficherMedecins() {
   setM.stream().forEach(medecin -> System.out.println(medecin));}
    /* Avec l’api Stream */
    public long nombreMedecins(){
        return setM.stream().count();
    }
    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins(){
        return setM.stream()
                .collect(Collectors.toCollection(()-> new TreeSet<>()));
    }
}