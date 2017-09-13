package com.example.md.myfirstapp;

/**
 * Created by Mihnea on 27.08.2017.
 */

public class PandaResponse {
    private int _id;
    private String _content;

    public PandaResponse() {
    }

    public PandaResponse(String _content) {
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
