package com.example.mcalculator;

public class MortgageModel {

    public String p="";
    public String a="";
    public String i="";

    public MortgageModel(String p, String a, String i){
        this.p = p;
        this.a=a;
        this.i=i;
    }

    public String computePayment(){

        double pDBL = Double.parseDouble(p);
        double aDBL = Double.parseDouble(a);
        double iDBL = Double.parseDouble(i);
        double iD = (iDBL/100)/12;
        double aD = aDBL*12;
        double answer = (iD*pDBL)/(1-(Math.pow(1+iD,-aD)));
        return String.format("$%,.2f", answer);


    }
}
