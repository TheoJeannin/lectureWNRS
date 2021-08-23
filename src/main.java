import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    }

    public String nameFile(int deck, int level){
        String fileName ="";
        switch (deck){
            default : //main
                fileName = "main";
                break;
            case 1 : //Honest Dating
                fileName = "dating";
                break;
            case 2 : //Inner Circle
                fileName = "innerCircle";
                break;
            case 3 : //ownIt
                fileName = "ownIt";
                break;
            case 4 : //Quarantine
                fileName = "quarantine";
                break;
            case 5 : //relationship
                fileName = "relationship";
                break;
        }
        if(deck != 3){
            fileName+="Level"+String.valueOf(level);
        }
        fileName+=".txt";
        return fileName;
    }

    public String readFile(String fileName){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
