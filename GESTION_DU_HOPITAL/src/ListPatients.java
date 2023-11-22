import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient{
    private List<Patient> listP;
    public ListPatients(){
        listP = new ArrayList<>();
    }
    public void ajouterPatient(Patient p) {
       listP.add(p);
    }
    public void supprimerPatient(Patient p) {
       listP.remove(p);
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
       return  listP.stream().anyMatch(patient -> patient.equals(p));
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        return  listP.stream().anyMatch(patient -> patient.getCin() == cin);

    }
    /* Avec l’api Stream */
    public void afficherPatients() {
 listP.stream().forEach(p-> System.out.println(p));

    }
    /* Avec l’api Stream */
    public void trierPatientsParNom() {
        // Tri des patients par nom en utilisant l'API Stream
        List<Patient> patientsTries = listP.stream()
                .sorted(Comparator.comparing(Patient::getNom))
                .collect(Collectors.toList());

        // Affichage des patients triés par nom
        patientsTries.forEach(System.out::println);
    }

    public void PatientSansRedondance() {
        listP.stream().distinct().forEach(patient -> System.out.println(patient));
    }
}