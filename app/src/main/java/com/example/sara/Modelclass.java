package com.example.sara;

public class Modelclass {

    String Question;
    String oA;
    String oB;
    String oC;
    String oD;
    String ans;
    public Modelclass(){

    }

    public Modelclass(String question, String oA, String oB, String oC, String oD, String ans) {
        Question = question;
        this.oA = oA;
        this.oB = oB;
        this.oC = oC;
        this.oD = oD;
        this.ans = ans;
    }

    public String getQuestion() {

        return Question;
    }



    public String getoA() {
        return oA;
    }


    public String getoB() {
        return oB;
    }


    public String getoC() {
        return oC;
    }



    public String getoD() {
        return oD;
    }



    public String getAns() {
        return ans;
    }


}