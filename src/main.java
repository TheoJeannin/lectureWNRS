public class main {
    public static void main(String[] args) {

    }

    public String pickCard(int deck, int level){
        String str = "";
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

        return str;
    }
}
