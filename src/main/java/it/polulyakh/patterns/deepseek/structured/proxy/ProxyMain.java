package it.polulyakh.patterns.deepseek.structured.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Document publicDoc = new DocumentProxy(
                "Публичный документ",
                "Общедоступная информация",
                "public"
        );

        Document secretDoc = new DocumentProxy(
                "Секретный документ",
                "Секретные данные",
                "confidential"
        );
        User user1 = new User("John",  false);
        User user2 = new User("Jane",  true);

        publicDoc.displayContent(user1);
        secretDoc.displayContent(user2);
    }
}
