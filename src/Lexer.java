import java.util.ArrayList;

public class Lexer {
   public TokenType nextTokenType(String input, int marker) {
       char nextChar = input.charAt(marker);
       if (Character.isAlphabetic(nextChar)) {
           return TokenType.IDENTIFIER;
       } else if (Character.isDigit(nextChar) || nextChar == '.') {
           return TokenType.NUMBER;
       } else if (Character.isWhitespace(nextChar)) {
           return TokenType.WHITESPACE;
       } else if (nextChar == '"') {
           return TokenType.STRING;
       } else if (nextChar == 'i' && input.charAt(marker + 1) == 'f') {
           return TokenType.CONDITION;
       } else {
           return TokenType.OPERATOR;
       }
   }

   public ArrayList<Token> tokenizer(String input) {
       ArrayList<Token> result = new ArrayList<Token>();
       int marker = 0;
       try {
           while (marker < input.length()) {
               TokenType nextTokenType = nextTokenType(input, marker);
               if (nextTokenType == TokenType.IDENTIFIER || nextTokenType == TokenType.CONDITION || nextTokenType == TokenType.NUMBER && marker < input.length()) {
                   String tokenValue = "";
                   while (nextTokenType(input, marker) == nextTokenType) {
                       tokenValue += input.charAt(marker);
                       marker++;
                   }
                   Token newToken = new Token(tokenValue, nextTokenType);
                   result.add(newToken);
               } else if (nextTokenType == TokenType.WHITESPACE) {
                   while (nextTokenType(input, marker) == TokenType.WHITESPACE && marker < input.length()) {
                       marker++;
                   }
               } else if (nextTokenType == TokenType.STRING) {
                   String tokenValue = "";
                   marker++;
                   while (marker < input.length() && input.charAt(marker) != '"') {
                       tokenValue += input.charAt(marker);
                       marker++;
                   }
                   if (marker == input.length()) {
                       throw new RuntimeException("Missing ending quote");
                   }
                   marker++;
                   result.add(new Token(tokenValue, nextTokenType));
               } else {
                   final String[] VALID_OPERATORS = {"==", ">=", "<=", "!=", "=", "+", "-", "/", "*", "(", ")"};
                   final String[] VALID_STATEMENTS = {"if"};
                   boolean foundOperator = false;
                   boolean foundStatement = false;
                   for (String operator : VALID_OPERATORS) {
                       if (input.substring(marker).startsWith(operator)) {
                           result.add(new Token(operator, TokenType.OPERATOR));
                           marker += operator.length();
                           foundOperator = true;
                           break;
                       }
                   }
                   if (!foundOperator) {
                       throw new RuntimeException("Invalid operator" + input.charAt(marker));
                   }
                   for (String statement : VALID_STATEMENTS) {
                       if (input.substring(marker).startsWith(statement)) {
                           result.add(new Token(statement, TokenType.CONDITION));
                           marker += statement.length();
                           foundStatement = true;
                           break;
                       }
                   }
//                   if (!foundStatement) {
//                       throw new RuntimeException("Invalid statement" + input.charAt(marker));
//                   }
               }
           }
       } catch(StringIndexOutOfBoundsException ignored){

       }
       return result;
   }
}
