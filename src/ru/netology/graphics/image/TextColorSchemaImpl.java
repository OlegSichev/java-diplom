package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema{
    @Override
    public char convert(int color) {
        if (color >=0 && color <= 30){
            return '#';
        } else if (color > 30 && color <= 60) {
            return '$';
        } else if (color > 60 && color <= 90) {
            return '@';
        } else if (color > 90 && color <= 120) {
            return '%';
        } else if (color > 120 && color <= 155) {
            return '*';
        } else if (color > 155 && color <= 184) {
            return '+';
        } else if (color > 184 && color <= 230) {
            return '-';
        } else if (color > 230 && color <= 255) {
            return ' ';
        }
        return 0;
    }
}
