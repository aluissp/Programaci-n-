/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranformarInfijoPostfijo;

import EstructuraPila.Pila;

/**
 *
 * @author Armando Perugachi
 */
public class TransfInfPost {

    private Pila p;
    private String ExpInf;
    private char[] AInf;
    private char[] APost;
    private int nCaracteres;

    public TransfInfPost(String ExpInf) {
        this.ExpInf = ExpInf;
        this.nCaracteres = ExpInf.length();
        this.AInf = new char[this.nCaracteres];
        this.APost = new char[this.nCaracteres];
        this.p = new Pila(this.nCaracteres);
    }

    public void ConvertirArregloInfijo() {
        for (int i = 0; i < nCaracteres; i++) {
            AInf[i] = ExpInf.charAt(i);
        }
    }

    public int prioridad(char car) {
        int prior = -1;
        switch (car) {
            case '+':
            case '-': {
                prior = 1;
                break;
            }
            case '*':
            case '/': {
                prior = 2;
                break;
            }
            case '^': {
                prior = 3;
                break;
            }
        }
        return prior;
    }

//    public void TransformarPostfijo() {
//        int j = 0;
//        for (int i = 0; i < this.nCaracteres; i++) {
//            if (p.Vacia() && prioridad(AInf[i]) != -1) {
//                p.Apilar(AInf[i]);
//            } else {
//                if (prioridad(AInf[i]) == -1) {
//                    this.APost[j] = AInf[i];
//                    j++;
//                } else {
//                    if (prioridad(AInf[i]) > prioridad((char) p.Cima())) {
//                        p.Apilar(AInf[i]);
//                    } else {
//                        if (prioridad(AInf[i]) <= prioridad((char) p.Cima())) {
//                            while (!p.Vacia() && (prioridad(AInf[i]) <= prioridad((char) p.Cima()))) {
//                                APost[j] = (char) p.Desapilar();
//                                j++;
//                            }
//                            p.Apilar(AInf[i]);
//                        }
//                    }
//                }
//            }
//
//        }
//        while (!p.Vacia()) {
//            APost[j] = (char) p.Desapilar();
//            j++;
//        }
//
//    }
    public String RetornarExpPostfija() {
        String r = "";
        for (int i = 0; i < nCaracteres; i++) {
            r += APost[i];
        }
        return r;
    }

    public void TransformarPostfijo() {
        int j = 0;
        for (int i = 0; i < this.nCaracteres; i++) {
            if (p.Vacia() && prioridad(AInf[i]) != -1) {
                p.Apilar(AInf[i]);

            } else if (prioridad(AInf[i]) == -1) {
                this.APost[j] = AInf[i];
                j++;

            } else if (prioridad(AInf[i]) > prioridad((char) p.Cima())) {
                p.Apilar(AInf[i]);

            } else if (prioridad(AInf[i]) <= prioridad((char) p.Cima())) {
                while (!p.Vacia() && (prioridad(AInf[i]) <= prioridad((char) p.Cima()))) {
                    APost[j] = (char) p.Desapilar();
                    j++;
                }
                p.Apilar(AInf[i]);

            }
        }

        while (!p.Vacia()) {
            APost[j] = (char) p.Desapilar();
            j++;
        }

    }
}
