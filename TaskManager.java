import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TaskManager implements TaskOperations {
 static TaskManager taskManager = new TaskManager();

    // create un scanner pour lire les entrées de l'utilisatur 
    // Estancier le scanner pour l'utiliser
    static Scanner scanner = new Scanner(System.in);


    // Create une list pour stocker les tasks
    static ArrayList<Task> taskList = new ArrayList<>(); // C'est un typage de taskList qui est type Task
    static int id = 1;

    @Override
    public void  ajouterUnTask(){
        System.out.println("Entrez le titre de la tâche ");
        String title = scanner.nextLine();
        Task task = new Task(id++, title);
        taskList.add(task);
    };


    @Override
    public void AfficherTousLesEmployer(){
        System.out.println("Liste des tâches");
  for(Task task : taskList) {
    System.out.println("iD : " + task.getId());
    System.out.println("Title : " + task.getTitle());
    System.out.println("Status : " + task.getStatus());
  }
    };

    public void sauvegarder() {
        String tasksFil = "tasks.txt";
        //ecriture dans le fichier

        try{
             FileWriter myWriter = new FileWriter("tasks.txt");
             myWriter.write(taskList.toString());
             myWriter.close();
             System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

     public void menu() {
        while (true) {
            System.out.println("Task Management Systeme");
            System.out.println("1. Ajouter une Tâche");
            System.out.println("2. Supprimer une Tâche");
            System.out.println("3.Afficher tous les Tâches");
            System.out.println("4. Affichez une Tâche par son id");
            System.out.println("5. Modifiez une Tâche");
            System.out.println("6. Quitez");
            System.out.println("NB. Le 2 et 4 en cours de developpement");
            System.out.print("Choisir une option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consomme la ligne restante
            switch (choice) {
                case 1:
                   ajouterUnTask();
                   sauvegarder();
                    break;
                case 2:
                    System.out.println("Invalid choice, please try again.");
                
                case 3:
                    AfficherTousLesEmployer();
                    break;
                case 4:
                   System.out.println("Invalid choice, please try again.");
                
                case 5:
                  System.out.println("Invalid choice, please try again.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }


  public static void main(String[] args) {
   taskManager.menu();
 }

}