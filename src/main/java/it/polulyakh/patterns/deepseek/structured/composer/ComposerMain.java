package it.polulyakh.patterns.deepseek.structured.composer;

public class ComposerMain {
    public static void main(String[] args) {
        File f1 = new File(10);
        File f2 = new File(20);
        File f3 = new File(30);
        File f4 = new File(40);

        Directory d1 = new Directory();
        d1.addItem(f1);
        d1.addItem(f4);

        Directory d2 = new Directory();
        d2.addItem(f2);
        d2.addItem(f3);
        d1.addItem(d2);


        System.out.println("d1 directory size = " + d1.getSize());
        System.out.println("d2 directory size = " + d2.getSize());

    }
}
