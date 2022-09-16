enum TokenType {
    NUMBER, IDENTIFIER, EQUAL, CONDITION, OTHER
}

public class Token {
    private TokenType type;
    private String value;
    private int positionStart;
    private int positionEnd;

    Token(TokenType type, String value, int positionStart, int positionEnd) {
        this.type = type;
        this.value = value;
        this.positionStart = positionStart;
        this.positionEnd = positionEnd;
    }

    Token(TokenType type, String value, int positionStart) {
        this.type = type;
        this.value = value;
        this.positionStart = positionStart;
        this.positionEnd = positionStart + 1;
    }


    Token(TokenType type) {
        this.type = type;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
