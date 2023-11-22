import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new TreeMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            ListPatients listPatients = medecinPatients.get(m);
            listPatients.ajouterPatient(p);
        } else {
            // Vous pouvez choisir de lever une exception ou ajouter le médecin automatiquement
            // en fonction de vos besoins. Pour l'exemple, ajout automatique ici.
            ajouterMedecin(m);
            ajouterPatient(m, p);
        }
    }

    public void afficherMap() {
        // À compléter : afficher le contenu de medecinPatients
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Médecin: " + medecin);
            System.out.println("Patients: ");
            patients.afficherPatients();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        // À compléter : afficher les patients d'un médecin donné
        if (medecinPatients.containsKey(m)) {
            ListPatients patients = medecinPatients.get(m);
            System.out.println("Patients du médecin " + m.getNom() + ": ");
            patients.afficherPatients();
        } else {
            System.out.println("Médecin non trouvé dans l'hôpital.");
        }
    }
}
