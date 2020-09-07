package com.example.mycovid;

public class Patient {
    public int age;

    public String gender;
    public String kidney;
    public String heart;
    public String respiratory;
    public String diabetes;
    public String pregnant;

    public String aayushmaan;
    public String aarogya;
    public String insurance;

    public String updated;

    Patient() {
        age = 0;

        gender = "male";
        kidney = "false";
        heart = "false";
        respiratory = "false";
        diabetes = "false";
        pregnant = "false";

        aayushmaan = "false";
        aarogya = "false";
        insurance = "false";

        updated = "true";
    }
}
