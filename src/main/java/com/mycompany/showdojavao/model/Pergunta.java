/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.showdojavao.model;

import java.util.ArrayList;

/**
 *
 * @author LUISHENRIQUEPEDROSOS
 */
 public class Pergunta {
     private String enunciado;
    private String[] alternativas;
    private String correta;

    public Pergunta(String enunciado, String[] alternativas, String correta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.correta = correta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public String getCorreta() {
        return correta;
    }
}

