package com.company.model;

public class Patrat extends Forme{
    public String culoare;

    public Patrat(int nrLaturi,int nrUnghiuri,String tip,String culoare){
        super(nrLaturi,nrUnghiuri,"patrat");
        this.culoare=culoare;
    }

    public Patrat(String line){
        super(line);
        this.culoare=line.split(",")[3];

    }

    public String descrierePatrat(){
        String text=super.descriereForma();
        text+="culoare : " + culoare + "\n";
        return text;
    }

    public String getCuloare() {
        return this.culoare;
    }

    @Override

    public String toSave(){
        String text=super.toSave();
        text+="," + culoare;
        return text;
     }
}
