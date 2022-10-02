enum TokenType {
    NUMBER, IDENTIFIER, OPERATOR, WHITESPACE, STRING, CONDITION
}

public class Token {

    private String tokenValue;
    private TokenType tokenType;

    public Token(String tokenValue, TokenType tokenType) {
        this.tokenValue = tokenValue;
        this.tokenType = tokenType;
    }

    public TokenType getType() {
        return tokenType;
    }

    public String getValue() {
        return tokenValue;
    }
}
