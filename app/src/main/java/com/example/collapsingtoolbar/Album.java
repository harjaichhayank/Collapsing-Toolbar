package com.example.collapsingtoolbar;

class Album {
    private int img_id;

    Album(int img_id){
        setImg_id(img_id);
    }

    int getImg_id() {
        return img_id;
    }

    private void setImg_id(int img_id) {
        this.img_id = img_id;
    }
}
