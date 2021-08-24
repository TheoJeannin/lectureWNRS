import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Request {

    public Request(){}

    public String nameFile(int deck, int level){
        String fileName ="questions/";
        switch (deck){
            default : //main
                fileName += "main";
                break;
            case 1 : //Honest Dating
                fileName += "dating";
                break;
            case 2 : //Inner Circle
                fileName += "innerCircle";
                break;
            case 3 : //ownIt
                fileName += "ownIt";
                break;
            case 4 : //Quarantine
                fileName += "quarantine";
                break;
            case 5 : //relationship
                fileName += "relationship";
                break;
        }
        if(deck != 3){
            fileName += "Level"+String.valueOf(level);
        }
        return fileName;
    }

    public void readFile(String fileName){

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            String numberOfLines = myReader.nextLine();
            int nbLines = Integer.parseInt(numberOfLines);
            int randomLine = (int) (Math.random()*nbLines);
            for  (int i = 1 ; i<=randomLine-1 ; i++) {
                myReader.nextLine();
            }
            String line = myReader.nextLine();
            System.out.println(line);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File could not be opened. Not found?");
            e.printStackTrace();
        }
    }
}
