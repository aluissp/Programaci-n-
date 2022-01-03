/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraArbol;

/**
 *
 * @author Armando Perugachi
 */
public class ArbolBB {

    private NodoABB raiz;

    public ArbolBB() {
        this.raiz = null;
    }

    public String ingresarElemento(Object elemento) {
        NodoABB aux = new NodoABB(elemento);

        if (raiz == null) {
            raiz = aux;
        } else {
            NodoABB nodo = this.raiz;
            int comparar;
            while (aux != null) {
                comparar = ((Votante) aux.getInformacion()).getCedula().compareTo(((Votante) nodo.getInformacion()).getCedula());
                if (comparar > 0) {
                    if (nodo.getHDerecho() != null) {
                        nodo = nodo.getHDerecho();
                    } else {
                        nodo.setHDerecho(aux);
                        aux = null;
                    }
                } else if (comparar < 0) {
                    if (nodo.getHIzquierdo() != null) {
                        nodo = nodo.getHIzquierdo();
                    } else {
                        nodo.setHIzquierdo(aux);
                        aux = null;
                    }
                } else {
                    return "Votante ya registrado";
                }
            }
        }
        return "Votante registrado correctamente";
    }

    public NodoABB buscarElemento(String cedula) {
        NodoABB aux = this.raiz;
        int comparar;
        while (aux != null) {
            comparar = ((Votante) aux.getInformacion()).getCedula().compareTo(cedula);

            if (comparar < 0) {
                aux = aux.getHDerecho();

            } else if (comparar > 0) {
                aux = aux.getHIzquierdo();

            } else {
                return aux;
            }
        }
        return aux;

    }

//    public Object eliminarElemento(String cedula) {
//
//        NodoABB nodoArbol = this.raiz;
//        NodoABB nodoAbuelo = nodoArbol;
//        Votante elemento = (Votante) buscarElemento(cedula);
//        int comparar;
//        if (elemento != null) {
//            while (nodoArbol != null) {
//                comparar = ((Votante) nodoArbol.getInformacion()).getCedula().compareTo(cedula);
//                if (comparar > 0) {
//                    nodoAbuelo = nodoArbol;
//                    nodoArbol = nodoArbol.getHIzquierdo();
//                } else if (comparar < 0) {
//                    nodoAbuelo = nodoArbol;
//                    nodoArbol = nodoArbol.getHDerecho();
//                } else {
//                    comparar = elemento.getCedula().compareTo(((Votante) nodoAbuelo.getInformacion()).getCedula());
//                    if (nodoArbol.getHIzquierdo() == null && nodoArbol.getHDerecho() == null) {
//                        if (comparar < 0) {
//                            nodoAbuelo.setHDerecho(null);
//                        } else if (comparar > 0) {
//                            nodoAbuelo.setHIzquierdo(null);
//                        } else if (comparar == 0) {
//                            raiz = null;
//                        }
//                    } else if (nodoArbol.getHIzquierdo() != null && nodoArbol.getHDerecho() == null) {
//                        nodoArbol = nodoArbol.getHIzquierdo();
//                        nodoAbuelo.setHIzquierdo(nodoArbol);
//                    } else if (nodoArbol.getHIzquierdo() == null && nodoArbol.getHDerecho() != null) {
//                        nodoArbol = nodoArbol.getHDerecho();
//                        nodoAbuelo.setHDerecho(nodoArbol);
//                    } else if (nodoArbol.getHIzquierdo() != null && nodoArbol.getHDerecho() != null) {
//                        nodoArbol = sucesorArbol(nodoArbol);
//                        if (comparar < 0) {
//                            nodoAbuelo.setHDerecho(nodoArbol);
//                        } else if (comparar > 0) {
//                            nodoAbuelo.setHIzquierdo(nodoArbol);
//                        } else if (comparar == 0) {
//                            nodoArbol = nodoAbuelo.getHIzquierdo();
//                            NodoABB hDerecho = nodoAbuelo.getHDerecho();
//                            nodoAbuelo = antecesorArbol(nodoAbuelo);
//                            eliminarElemento(((Votante) nodoAbuelo.getInformacion()).getCedula());
//                            nodoAbuelo.setHIzquierdo(nodoArbol);
//                            nodoAbuelo.setHDerecho(hDerecho);
//                        }
//                    }
//                    nodoArbol = null;
//                }
//
//            }
//        }
//        return elemento;
//    }
    private NodoABB antecesorArbol(NodoABB nodo) {
        NodoABB antecesor = null;
        if (nodo != null) {
            antecesor = antecesorArbol(nodo.getHIzquierdo());
        }
        return antecesor;
    }

    private NodoABB sucesorArbol(NodoABB nodo) {
        NodoABB sucesor = null;
        if (nodo != null) {
            sucesor = sucesorArbol(nodo.getHDerecho());
        }
        return sucesor;
    }

    private String ingresarElementoRecursivo(Object elemento, boolean recursivo) {
        if (recursivo) {
            NodoABB aux = new NodoABB(elemento);
            if (this.raiz == null) {
                this.raiz = aux;
                return "Votante registrado correctamente";
            }
            NodoABB nodo = this.raiz;
            return ingresarRecursivo(aux, nodo);
        } else {
            return ingresarElemento(elemento);
        }
    }

    private String ingresarRecursivo(NodoABB aux, NodoABB nodo) {
        int comparar = ((Votante) aux.getInformacion()).getCedula().compareTo(((Votante) nodo.getInformacion()).getCedula());

        if (comparar > 0) {
            if (nodo.getHDerecho() != null) {
                return ingresarRecursivo(aux, nodo.getHDerecho());
            } else {
                nodo.setHDerecho(aux);
                return "Votante registrado correctamente";
            }
        } else if (comparar < 0) {
            if (nodo.getHIzquierdo() != null) {
                return ingresarRecursivo(aux, nodo.getHIzquierdo());
            } else {
                nodo.setHIzquierdo(aux);
                return "Votante registrado correctamente";
            }
        } else {
            return "Votante ya registrado";
        }
    }

    public String recorrerPreOrder(NodoABB nodo) {
        String s = "";
        if (nodo != null) {
            s += (Votante) nodo.getInformacion() + "\n";
            s += recorrerPreOrder(nodo.getHIzquierdo());
            s += recorrerPreOrder(nodo.getHDerecho());
        }
        return s;
    }

    public String recorrerInOrder(NodoABB nodo) {
        String s = "";
        if (nodo != null) {
            s += recorrerInOrder(nodo.getHIzquierdo());
            s += (Votante) nodo.getInformacion() + "\n";
            s += recorrerInOrder(nodo.getHDerecho());
        }
        return s;
    }

    public String recorrerPostOrder(NodoABB nodo) {
        String s = "";
        if (nodo != null) {
            s += recorrerPostOrder(nodo.getHIzquierdo());
            s += recorrerPostOrder(nodo.getHDerecho());
            s += (Votante) nodo.getInformacion() + "\n";
        }
        return s;
    }

//    public static void main(String[] args) {
//        ArbolBB arbol = new ArbolBB();
//
////        arbol.ingresarElemento(new Votante("7", "Juan", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("15", "Maria", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("4", "Emilio", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("18", "Matias", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("2", "Kevin", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("11", "Jose", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("f", "Juan", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("c", "Maria", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("p", "Emilio", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("a", "Matias", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("e", "Kevin", 1, 1, 1, null, 1));
////        arbol.ingresarElemento(new Votante("s", "Jose", 1, 1, 1, null, 1));
//        arbol.ingresarElementoRecursivo(new Votante("f", "Juan", 1, 1, 1, null, 1), true);
//        arbol.ingresarElementoRecursivo(new Votante("c", "Maria", 1, 1, 1, null, 1), true);
//        arbol.ingresarElementoRecursivo(new Votante("p", "Emilio", 1, 1, 1, null, 1), true);
//        arbol.ingresarElementoRecursivo(new Votante("a", "Matias", 1, 1, 1, null, 1), true);
//        arbol.ingresarElementoRecursivo(new Votante("e", "Kevin", 1, 1, 1, null, 1), true);
//        arbol.ingresarElementoRecursivo(new Votante("s", "Jose", 1, 1, 1, null, 1), true);
//
//    }
    public NodoABB getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoABB raiz) {
        this.raiz = raiz;
    }
    //Examen recuperacion

    public Object nodoMayor(NodoABB r) {
        Object m = null;
        if (r != null) {
            r = r.getHDerecho();
            while (r.getHIzquierdo() != null) {
                r = r.getHIzquierdo();
            }
            m = r.getInformacion();
        }
        return m;
    }
}
