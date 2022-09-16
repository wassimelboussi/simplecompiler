import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Wassim\\IdeaProjects\\simplecompiler\\src\\text.txt");
        ReadFiles reader = new ReadFiles(path);
        String code = reader.readToString(String.valueOf(path));

        System.out.println(code);
        System.out.println("\n\n\n Lexer: \n");

        Lexer myLexer = new Lexer(reader.readToString(String.valueOf(path)));

        System.out.println("Length is: " + myLexer.getCodeLength());
        String tokenized = String.valueOf(myLexer.tokenizer(code));
        System.out.println("Tokenized: " + tokenized);

        System.out.println(myLexer.tokenizer(code));

    }
}