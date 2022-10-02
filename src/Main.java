import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathOfFile = "C:\\Users\\Wassim\\IdeaProjects\\simplecompiler\\src\\text.txt";
        Path path = Path.of(pathOfFile);
        ReadFiles reader = new ReadFiles(path);
        String code = reader.readToString(String.valueOf(path));

        ArrayList<Token> listOfTokens = new Lexer().tokenizer(code);
        try {
            for (Token token : listOfTokens) {
                System.out.println(token.getValue());
                System.out.println(token.getType());
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }
}
