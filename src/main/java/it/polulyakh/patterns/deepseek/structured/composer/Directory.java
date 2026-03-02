package it.polulyakh.patterns.deepseek.structured.composer;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem{
    List<FileSystemItem> fileSystemItems = new ArrayList<FileSystemItem>();


    public void addItem(FileSystemItem fileSystemItem) {
        fileSystemItems.add(fileSystemItem);
    }

    public void removeItem(FileSystemItem fileSystemItem) {
        fileSystemItems.remove(fileSystemItem);
    }

    @Override
    public int getSize() {
        int fullSize = 0;
        for(FileSystemItem fileSystemItem : fileSystemItems){
            fullSize += fileSystemItem.getSize();
        }
        return fullSize;
    }
}
