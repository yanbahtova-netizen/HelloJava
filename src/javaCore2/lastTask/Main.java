package javaCore2.lastTask;

public class Main {
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            Label result = analyzers[i].processText(text);
            if(result != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }
}
class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    protected String[] getKeywords() {
        return keywords;
    }

    protected Label getLabel() {
         return Label. SPAM;
    };
}
class NegativeTextAnalyzer extends KeywordAnalyzer {
    public NegativeTextAnalyzer() {
    }
    private final String[] smiles = {":(", "=(", ":|"};

    protected String[] getKeywords() {
        return smiles;
    }

    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    };
}
class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processText(String text) {
        if (text.length() >= maxLength) {
            return Label.TOO_LONG;
        } else return Label.OK;
    }
}
abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    public Label processText(String text) {
        String[] words = getKeywords();
        for (int i = 0; i < words.length; i++) {
            if(text.contains(words[i])) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
interface TextAnalyzer {
    Label processText(String text);
}
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK;
}