package com.example.md.myfirstapp.Feelings;

/**
 * Created by Mihnea on 22.08.2017.
 */

public class FeelingSad {
    private int _id;
    private String _content;

    public FeelingSad() {
    }

    public FeelingSad(String _content) {
        this._content = _content;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }
}
