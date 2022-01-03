package NReinas;

import java.util.ArrayList;

public class NReinas {

    private boolean[] horizontal;
    private boolean[] vertical;
    private boolean[] diagonalSuperior;
    private boolean[] diagonalInferior;
    private int n;
    private int[] solucion;
    private boolean haySolucion;
    private ArrayList soluciones = new ArrayList();

    public NReinas(int tamanio) {
        if (tamanio < 4) {
            throw new NullPointerException();
        }
        this.n = tamanio;
        inicializar();
    }

    private void inicializar() {
        this.horizontal = new boolean[n];
        this.vertical = new boolean[n];
        this.solucion = new int[n];
        for (int i = 0; i < n; i++) {
            this.horizontal[i] = true;
            this.vertical[i] = true;
            this.solucion[i] = -1;
        }
        this.diagonalInferior = new boolean[2 * n - 1];
        this.diagonalSuperior = new boolean[2 * n - 1];
        for (int i = 0; i < 2 * n - 1; i++) {
            this.diagonalInferior[i] = true;
            this.diagonalSuperior[i] = true;
        }
        haySolucion = false;
    }

    private void buscarSolucion(int fila) {
        int col = 0;
        while (col < n && !haySolucion) {
            if (horizontal[fila] && vertical[col] && diagonalInferior[col - fila + n - 1] && diagonalSuperior[col + fila]) {

                solucion[fila] = col;
                horizontal[fila] = false;
                vertical[col] = false;
                diagonalInferior[col - fila + n - 1] = false;
                diagonalSuperior[col + fila] = false;

                if (fila == n - 1 && solucionNueva(this.solucion)) {
                    haySolucion = true;
                } else {
                    if (fila + 1 < n) {
                        buscarSolucion(fila + 1);
                    }
                    if (!haySolucion) {
                        solucion[fila] = -1;
                        horizontal[fila] = true;
                        vertical[col] = true;
                        diagonalInferior[col - fila + n - 1] = true;
                        diagonalSuperior[col + fila] = true;

                    }
                }
            }
            col++;
        }
    }

    public void buscarSoluciones() {
        boolean flag = true;
        while (flag) {
            buscarSolucion(0);
            if (solucionNueva(solucion)) {
                flag = true;
                agregarSolucion();

            } else {
                flag = false;
            }
            inicializar();
        }
    }

    public void buscarUnaSolucion() {
        buscarSolucion(0);
        agregarSolucion();
    }

    private void agregarSolucion() {
        soluciones.add(this.solucion);
    }

    private boolean solucionNueva(int[] nuevaSolucion) {
        if (nuevaSolucion[0] == -1) {
            return false;
        }
        boolean esNueva = true;
        int i = 0;
        while (i < soluciones.size() && esNueva) {
            int[] unaSol = (int[]) soluciones.get(i);
            esNueva = !sonIguales(unaSol, nuevaSolucion);
            i++;
        }

        return esNueva;
    }

    private boolean sonIguales(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        boolean flag = true;
        while ((i < a.length) && (j < b.length)) {
            if (a[i] != b[j]) {
                return false;
            }
            i++;
            j++;
        }
        return flag;
    }

    public ArrayList getSoluciones() {
        return this.soluciones;
    }

}
