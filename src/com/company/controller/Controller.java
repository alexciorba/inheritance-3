package com.company.controller;

import com.company.model.Cerc;
import com.company.model.Forme;
import com.company.model.Patrat;
import com.company.model.Triunghi;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Forme>lisaForme;

    public Controller(){
        lisaForme=new ArrayList<>();
        load();
    }

    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model3\\src\\com\\company\\source\\forme.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                switch (line.split(",")[2]){
                    case "patrat" : this.lisaForme.add(new Patrat(line));
                    break;
                    case "cerc" : this.lisaForme.add(new Cerc(line));
                    break;
                    case "triunghi" : this.lisaForme.add(new Triunghi(line));
                }
            }
        }catch (Exception e){

        }
    }
    public String toSaveForma(){
        String text="";
        for(Forme forma : lisaForme){
            text+=forma.toSave()+"\n";
        }
        return text;
    }


    public void saveAuto(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model3\\src\\com\\company\\source\\forme.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveForma());
            printWriter.close();
        }catch (Exception e){

        }
    }

}
