import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Wassim\\IdeaProjects\\simplecompiler\\src\\text.txt");
        ReadFiles reader = new ReadFiles(path);
        String code = reader.readToString(String.valueOf(path));

        Lexer myLexer = new Lexer(reader.readToString(String.valueOf(path)));
//
//        System.out.println("Length is: " + myLexer.getCodeLength());
//        String tokenized = String.valueOf(myLexer.tokenizer(code));
//        System.out.println("Tokenized: " + tokenized);
//
//        System.out.println("My token size is: " + myLexer.tokenizer(code));
//        System.out.println((Arrays.toString(myLexer.tokenizer(code))));

        Object[] outputs;
        outputs = myLexer.tokenizer(code);

        try {
            for (int i = 0; i < code.length(); i++) {
                System.out.println(outputs[i].toString());
            }
        } catch (Exception e) {

        }

    }
}