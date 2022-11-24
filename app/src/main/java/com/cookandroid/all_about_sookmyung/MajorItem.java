package com.cookandroid.all_about_sookmyung;

public class MajorItem {
    // major의 아이템을 정의하는 클래스
    private String majorName_textview;
    private String majorRoom_textview;
    private String majorOffice_textview;
    private String locker_textview;

    public String getMajorName_textview() {
        return majorName_textview;
    }

    public void setMajorName_textview(String majorName_textview) {
        this.majorName_textview = majorName_textview;
    }

    public String getMajorRoom_textview() {
        return majorRoom_textview;
    }

    public void setMajorRoom_textview(String majorRoom_textview) {
        this.majorRoom_textview = majorRoom_textview;
    }

    public String getMajorOffice_textview() {
        return majorOffice_textview;
    }

    public void setMajorOffice_textview(String majorOffice_textview) {
        this.majorOffice_textview = majorOffice_textview;
    }

    public String getLocker_textview() {
        return locker_textview;
    }

    public void setLocker_textview(String locker_textview) {
        this.locker_textview = locker_textview;
    }

    public MajorItem(String majorName_textview, String majorRoom_textview, String majorOffice_textview, String locker_textview) {
        this.majorName_textview = majorName_textview;
        this.majorRoom_textview = majorRoom_textview;
        this.majorOffice_textview = majorOffice_textview;
        this.locker_textview = locker_textview;
    }
}
