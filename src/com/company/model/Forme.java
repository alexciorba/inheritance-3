package com.company.model;

public class Forme {

    private int nrLaturi;
    private int nrUnghiuri;
    private String tip;

    public Forme(int nrLaturi,int nrUnchiuri,String tip){
        this.nrLaturi=nrLaturi;
        this.nrUnghiuri =nrUnchiuri;
        this.tip=tip;
    }

    public Forme(String line){
        this(Integer.parseInt(line.split(",")[0]),
                Integer.parseInt(line.split(",")[1]),
                line.split(",")[1]);


    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setNrLaturi(int nrLaturi) {
        this.nrLaturi = nrLaturi;
    }

    public void setNrUnghiuri(int nrUnghiuri) {
        this.nrUnghiuri = nrUnghiuri;
    }

    public String getTip() {
        return this.tip;
    }

    public int getNrLaturi() {
        return this.nrLaturi;
    }

    public int getNrUnghiuri() {
        return this.nrUnghiuri;
    }

    public String descriereForma(){
        String text="";
        text+="numarul de laturi : " + nrLaturi + "\n";
        text+="numarul de unghiuri : " + nrUnghiuri + "\n";
        text+="tipul formei : " + tip + "\n";
        return text;
    }

    public String toSave(){
        String  text="";
        text+=nrLaturi + "," + nrUnghiuri + ","  + tip;
        return text;

    }
}
