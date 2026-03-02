package it.polulyakh.patterns.deepseek.structured.proxy;

public class DocumentProxy implements Document {

    private String title;
    private String classification;
    private String content;

    private Document realDocument;

    public DocumentProxy(String title, String classification, String content) {
        this.title = title;
        this.classification = classification;
        this.content = content;
    }

    @Override
    public String getAccessLevel() {
        return classification;
    }

    @Override
    public void displayContent(User user) {
        // Проверка прав доступа
        if (classification.equals("public") || user.isAdmin()) {
            // Ленивая инициализация
            if (realDocument == null) {
                realDocument = new ConfidentialDocument(title, content, classification);
            }
            realDocument.displayContent(user);
        } else {
            System.out.println("Access Denied for user: " + user.getName());
        }
    }

}

