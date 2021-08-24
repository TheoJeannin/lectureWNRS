import system.Request;

public class main {
    public static void main(String[] args) {
        Request rq = new Request();
        String nameFile = rq.nameFile(1,2);
        rq.readFile(nameFile);
    }
}
