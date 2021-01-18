package academy.pocu.comp2500.lab3;

import java.util.ArrayList;

public class ListItem {
    private String text;
    private char bulletStyle;
    private ArrayList<ListItem> sublistItems = new ArrayList<>();

    public ListItem(String text) {
        this(text, '*');
    }
    public ListItem(String text, char bulletStyle) {
        this.text = text;
        this.bulletStyle = bulletStyle;
    }
    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public char getBulletStyle() {
        return this.bulletStyle;
    }
    public ListItem getSublistItem(int index) {
        return this.sublistItems.get(index);
    }
    public void addSublistItem(ListItem sublistItem) {
        this.sublistItems.add(sublistItem);
    }
    public String toString() {
        String stringListItem;
        stringListItem = this.bulletStyle + " " + this.text + System.lineSeparator();
        for (ListItem subListItem : this.sublistItems) {
            stringListItem += "    " + subListItem.bulletStyle + " " + subListItem.text + System.lineSeparator();
            for (ListItem subSubListItem : subListItem.sublistItems) {
                stringListItem += "        " + subSubListItem.bulletStyle + " " + subSubListItem.text + System.lineSeparator();
            }
        }
        return stringListItem;
    }
    public void setBulletStyle(char bulletStyle) {
        this.bulletStyle = bulletStyle;
    }
    public void removeSublistItem(int index) {
        this.sublistItems.remove(index);
    }
}
