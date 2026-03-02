package it.polulyakh.patterns.deepseek.structured.proxy;

public class ConfidentialDocument implements Document {


    private String title;
    private String classification;
    private String documentContent;

    public ConfidentialDocument(String title, String classification, String documentContent) {
        this.title = title;
        this.classification = classification;
        this.documentContent = documentContent;
    }

    @Override
    public String getAccessLevel() {
        return classification;
    }

    @Override
    public void displayContent(User user) {
        System.out.println(documentContent);
    }



}
