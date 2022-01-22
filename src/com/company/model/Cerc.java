package com.company.model;

public class Cerc extends Forme {

    public String culoare;

    public Cerc(int nrLaturi,int nrUnghiuri,String tip,String culoare){
        super(nrLaturi,nrUnghiuri,"cerc");
        this.culoare=culoare;
    }

    public Cerc(String line){
        super(line);
        this.culoare=line.split(",")[3];
    }

    public String descriereCerc(){
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
