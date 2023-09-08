package com.example.sara;

public class vocmodelclass {
    String Word1;
    String Meaning1;
    String Word2;
    String Meaning2;
    String Word3;
    String Meaning3;
    public vocmodelclass(){}


    public vocmodelclass(String Word1, String Meaning1, String Word2, String Meaning2, String Word3, String Meaning3) {
        this.Word1 = Word1;
        this.Meaning1 = Meaning1;
        this.Word2 = Word2;
        this.Meaning2 = Meaning2;
        this.Word3 = Word3;
        this.Meaning3 = Meaning3;
    }

    public String getWord1() {
        return Word1;
    }


    public String getMeaning1() {
        return Meaning1;
    }



    public String getWord2() {
        return Word2;
    }


    public String getMeaning2() {
        return Meaning2;
    }



    public String getWord3() {
        return Word3;
    }



    public String getMeaning3() {
        return Meaning3;
    }


}