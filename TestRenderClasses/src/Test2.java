import java.io.File;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

public class Test2 {
   public static void main(String[] args) {
       // Load the ontology
       OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
       try {
           // Replace "/path/to/your/ontology.owl" with the actual path to your ontology file
       	File file = new File("C:\\Users\\makar\\OneDrive\\Documents\\Sai_Makarand_office_book\\PIZZA OWL FILE\\pizza_ontology.owx");
           OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
           // Print ontology information
           System.out.println("Loaded ontology: " + ontology);
           System.out.println("Ontology IRI: " + ontology.getOntologyID().getOntologyIRI().orElse(IRI.create("")));
           for (OWLClass cls : ontology.getClassesInSignature()) {
               System.out.println(cls.getIRI());
           }
       } catch (OWLOntologyCreationException e) {
           System.out.println("Error loading ontology: " + e.getMessage());
       }
   }
}

