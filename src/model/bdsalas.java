package model;

import java.util.ArrayList;

public class bdsalas {
    private ArrayList<datasalas>salas;

public  bdsalas(){
salas=new ArrayList<>();
salas.add(new datasalas("en uso","sala1"));
salas.add(new datasalas("fuera de servicio","sala1"));
salas.add(new datasalas("libre","sala1"));
salas.add(new datasalas("fuera de uso","sala1"));
salas.add(new datasalas("libre","sala1"));
salas.add(new datasalas("en uso","sala1"));
salas.add(new datasalas("fuera de servicio","sala1"));
salas.add(new datasalas("en uso","sala1"));
salas.add(new datasalas("libre","sala1"));
salas.add(new datasalas("libre","sala1"));
salas.add(new datasalas("libre","sala1"));
salas.add(new datasalas("en uso","sala1"));
}
public ArrayList<datasalas>getSalas(){return salas;}
}
