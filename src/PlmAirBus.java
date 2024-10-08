import java.util.Scanner;

public class PlmAirBus {

    public static void main(String[] args) {
        // Crée une instance de Scanner pour lire les entrées
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS \nFaites votre choix dans le menu, saisissez le chiffre correspondant :\n ");

        System.out.println("✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈");
        
        // Tableau 2 dimensions de chaînes pour stocker les avions
        String[][] aircrafts = {
            {"1=[A320", "PLM_AIRBUS_IN_SERVICE", "Passenger]"},
            {"2=[A400M", "PLM_AIRBUS_DEFINITION", "Cargo]"},
            {"3=[A350", "PLM_AIRBUS_FEASIBILITY", "Passenger]"},
            {"4=[A380", "PLM_AIRBUS_STOPPED", "Passenger]"}
        };
        
        System.out.print("1 : Affichez tous les avions\n");
        System.out.print("2 : Afficher tous les avions contenant un mot clé dans le programme\n");
        System.out.print("3 : Afficher ou supprimer une pièce pour un avion donné\n");
        System.out.print("4 : Afficher un avion avec les infos détaillées de chaque pièce\n");
        System.out.print("5 : Quitter l'application\n");
        String choice = scan.nextLine();
        System.out.println("✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈");
 
        // Affiche tous les avions
        if (choice.equals("1")) {
            for (String[] aircraft : aircrafts) {
                System.out.println(aircraft[0] + " - " + aircraft[1] + " (" + aircraft[2] + ")");
            }
            System.out.println("✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈");
        }

        // Affiche les avions contenant un mot-clé donné
        else if (choice.equals("2")) {
            System.out.print("Entrez le mot-clé à rechercher : ");
            String keyword = scan.nextLine().toLowerCase(); // Lire le mot-clé entré par l'utilisateur

            boolean found = false;
            for (String[] aircraft : aircrafts) {
                // Vérifier si l'avion contient le mot-clé
                if (aircraft[0].toLowerCase().contains(keyword) || 
                    aircraft[1].toLowerCase().contains(keyword) || 
                    aircraft[2].toLowerCase().contains(keyword)) {
                    System.out.println(aircraft[0] + " - " + aircraft[1] + " (" + aircraft[2] + ")");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Aucun avion ne correspond au mot-clé donné.");
            }
            System.out.println("✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈✈");
        }
        else if (choice.equals("3")) {
            System.out.println("1 : Acheter une pièce\n2 : Supprimer une pièce");
            String subChoice = scan.nextLine();

            if (subChoice.equals("1")) {
                System.out.println("Veuillez entrer le nom de la pièce à acheter :");
                String piece = scan.nextLine();
                
                System.out.println("Veuillez entrer la quantité à acheter :");
                int quantite = scan.nextInt();
                scan.nextLine(); // Consomme la nouvelle ligne

                // Ajoutez ici la logique pour traiter l'achat de la pièce
                System.out.println("Vous avez acheté " + quantite + " de " + piece + ".");
            } else if (subChoice.equals("2")) {
                System.out.println("Veuillez entrer le nom de la pièce à supprimer :");
                String piece = scan.nextLine();

                // Ajoutez ici la logique pour traiter la suppression de la pièce
                System.out.println("Vous avez supprimé la pièce " + piece + ".");
            } else {
                System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        // Quitter l'application
        else if (choice.equals("5")) {
            System.out.println("Vous avez quitté l'application.");
        } else {
            System.out.println("Choix invalide, veuillez réessayer.");
        }
        
        scan.close();
    }
}