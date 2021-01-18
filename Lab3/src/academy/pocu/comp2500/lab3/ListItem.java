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
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%c %s%s", this.bulletStyle, this.text, System.lineSeparator()));
        confirmSublist(sb, this.sublistItems, 4);
        return sb.toString();
    }
    public void setBulletStyle(char bulletStyle) {
        this.bulletStyle = bulletStyle;
    }
    public void removeSublistItem(int index) {
        this.sublistItems.remove(index);
    }
    private void confirmSublist (StringBuilder sb, ArrayList<ListItem> sublistItems, int level) {
        for (ListItem sublistItem : sublistItems) {
            sb.append(" ".repeat(Math.max(0, level)));
            sb.append(String.format("%c %s%s", sublistItem.bulletStyle, sublistItem.text, System.lineSeparator()));
            if (sublistItem.text != null) {
                confirmSublist(sb, sublistItem.sublistItems, level + 4);
            }
        }
    }
}
