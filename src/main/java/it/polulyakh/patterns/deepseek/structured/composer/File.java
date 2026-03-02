package it.polulyakh.patterns.deepseek.structured.composer;

public class File implements FileSystemItem{

    private int fileSize;

    public File(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public int getSize() {
        return fileSize;
    }
}
