interface Speaker {
    void speak(String text);
}

interface Translator {
    void translate(String text, String language);
}

class AIAssistant implements Speaker, Translator {

    public void speak(String text) {
        System.out.println("Speaking: " + text);
    }

    public void translate(String text, String language) {
        System.out.println("Original Text: " + text);
        System.out.println("Translated to " + language);
    }
}

public class AssistantDemo {
    public static void main(String[] args) {
        try {
            AIAssistant assistant = new AIAssistant();

            assistant.speak("Welcome to AI Assistant");
            assistant.translate("Good Morning", "French");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}