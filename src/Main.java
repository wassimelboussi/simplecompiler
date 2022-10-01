import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Wassim\\IdeaProjects\\simplecompiler\\src\\text.txt");
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