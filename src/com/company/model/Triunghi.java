package com.company.model;

public class Triunghi extends Forme {

    public String culoare;

    public Triunghi(int nrLaturi,int nrUnghiuri,String tip,String culoare){
        super(nrLaturi,nrUnghiuri,"cerc");
        this.culoare=culoare;
    }

    public Triunghi(String line){
        super(line);
        this.culoare=line.split(",")[3];

    }
   public String descriereTriunghi(){
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
