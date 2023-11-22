import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Création de patients
        Patient patient1 = new Patient(111, "Doe", "Jane", 123456);
        Patient patient2 = new Patient(222, "Smith", "Bob", 789012);
        Patient patient3 = new Patient(333, "Johnson", "Alice", 456789);

        // Création de la liste de patients
        ListPatients listPatients = new ListPatients();

        // Ajout de patients à la liste
        listPatients.ajouterPatient(patient1);
        listPatients.ajouterPatient(patient2);
        listPatients.ajouterPatient(patient3);

        // Affichage des patients
        System.out.println("Affichage de la liste des patients :");
        listPatients.afficherPatients();

        // Recherche d'un patient par objet
        System.out.println("\nRecherche du patient 111 : " + listPatients.rechercherPatient(patient1));

        // Recherche d'un patient par numéro de cin
        System.out.println("Recherche du patient avec cin 222 : " + listPatients.rechercherPatient(222));

        // Tri des patients par nom
        System.out.println("\nPatients triés par nom :");
        listPatients.trierPatientsParNom();

        // Affichage des patients sans redondance
        System.out.println("\nPatients sans redondance :");
        listPatients.PatientSansRedondance();
    }
}
