import java.util.ArrayList;

public class Lexer {
    private String code;
    private int codeLength;
    private int currentChar;
    private Token currentToken;
    private Token previousToken;

    Lexer(String code) {
        this.code = code;
        this.codeLength = code.length();
        this.currentChar = getCurrentChar();
        this.currentToken = getCurrentToken();
        this.previousToken = getPreviousToken();
    }

    boolean nextToken() {
        return nextToken();
    }

    private boolean isEndOfCode() {
        return false;
    }

    Token getCurrentToken() {
        return this.currentToken;
    }

    Token getPreviousToken() {
        return this.previousToken;
    }

    TokenType readOperator() {
        return null;
    }

    int getCurrentChar() {
        return currentChar;
    }

    int getCodeLength() {
        return codeLength;
    }

    private ArrayList<Character> initialize(String code) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < getCodeLength(); i++) {
            list.add(code.charAt(i));
        }
        return list;
    }

    int tokenizer(String code) {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters = initialize(code);
        ArrayList<Token> tokens = new ArrayList<Token>();
        Token abc = new Token(TokenType.CONDITION);
        for (int i = 1; i < characters.size() - 1; i++) {
            if (characters.get(i) == 'i' && characters.get(i + 1) == 'f' && characters.get(i + 2) == '(') {
                tokens.add(new Token(TokenType.CONDITION, "if", i, i + 1));
                tokens.add(new Token(TokenType.CONDITION, "(", characters.get('('), characters.get('(') + 1));
                tokens.add(abc);
                System.out.println("Token found. True");
            }
        }
        return tokens.size();
    }

//    String createToken(LinkedList ll) {
//        for (Object c: ll) {
//            c.toString();
//        }
//    }
}
