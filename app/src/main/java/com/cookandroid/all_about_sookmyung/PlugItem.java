package com.cookandroid.all_about_sookmyung;

public class PlugItem {
    // plug의 아이템을 정의하는 클래스
    private String building_textview;
    private String floor_textview;
    private String room_textview;
    private String plug_textview;
    private String etc_textview;

    public String getBuilding_textview() {
        return building_textview;
    }

    public void setBuilding_textview(String building_textview) {
        this.building_textview = building_textview;
    }

    public String getFloor_textview() {
        return floor_textview;
    }

    public void setFloor_textview(String floor_textview) {
        this.floor_textview = floor_textview;
    }

    public String getRoom_textview() {
        return room_textview;
    }

    public void setRoom_textview(String room_textview) {
        this.room_textview = room_textview;
    }

    public String getPlug_textview() {
        return plug_textview;
    }

    public void setPlug_textview(String plug_textview) {
        this.plug_textview = plug_textview;
    }

    public String getEtc_textview() {
        return etc_textview;
    }

    public void setEtc_textview(String etc_textview) {
        this.etc_textview = etc_textview;
    }

    public PlugItem(String building_textview, String floor_textview, String room_textview, String plug_textview, String etc_textview) {
        this.building_textview = building_textview;
        this.floor_textview = floor_textview;
        this.room_textview = room_textview;
        this.plug_textview = plug_textview;
        this.etc_textview = etc_textview;
    }
}
