
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author MacArthur
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        Calendar fecha = new GregorianCalendar();

        this.año = fecha.get(Calendar.YEAR);
        this.mes = fecha.get(Calendar.MONTH) + 1;
        this.dia = fecha.get(Calendar.DAY_OF_MONTH);
    }

    public Fecha(int dia, int mes, int año) {

        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        if ((this.mes == 2)) {
            if ((this.año % 4) == 0 && (this.año % 100) != 0 || (this.año % 400) == 0) {
                if ((dia > 29) || (dia <= 0)) {
                    this.año = 1;
                    this.mes = 1;
                    this.dia = 1;
                } else {
                    this.dia = dia;
                }
            } else {
                if ((dia > 28) || (dia <= 0)) {
                    this.año = 1;
                    this.mes = 1;
                    this.dia = 1;
                } else {
                    this.dia = dia;
                }
            }

        } else {
            if ((this.mes == 4) || (this.mes == 6) || (this.mes == 9) || (this.mes == 11)) {
                if ((dia > 30) || (dia <= 0)) {
                    this.año = 1;
                    this.mes = 1;
                    this.dia = 1;
                } else {
                    this.dia = dia;
                }
            } else {
                if ((dia > 31) || (dia <= 0)) {
                    this.año = 1;
                    this.mes = 1;
                    this.dia = 1;
                } else {
                    this.dia = dia;

                }
            }
        }
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        if ((mes > 12) || (mes <= 0)) {
            this.año = 1;
            this.mes = 1;
            this.dia = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setAño(int año) {
        if (año <= 0) {
            this.año = 1;
            this.mes = 1;
            this.dia = 1;
        } else {
            this.año = año;
        }
    }

    public int getAño() {
        return this.año;
    }

    public boolean AñoBisiesto() {
        return (this.año % 4 == 0) && (this.año % 100 != 0) || (this.año % 400 == 0);
    }

    public void IncrementarDia() {

        if (this.dia == DiasMes()) {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
                this.año++;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }

    public void IncrementarDia(int n) {
        this.dia += n;
        while (this.dia > DiasMes()) {
            this.dia = this.dia - DiasMes();
            mes++;
            if (mes == 13) {
                mes = 1;
                año++;
            }
        }

    }

    public void IncrementarDia1(int n) {
        for (int i = 1; i <= n; i++) {
            IncrementarDia();
        }
    }

    public void DecrementarDia() {

        if (this.dia == 1) {
            this.dia = DiasMes();
            if (this.mes == 1) {
                this.mes = 12;
                this.año--;
            } else {
                this.mes--;
            }
        } else {
            this.dia--;
        }
    }

    public void DecrementarDia(int n) {
        this.dia -= n;
        while (this.dia < 1) {
            this.mes--;

            if (this.mes < 1) {
                this.mes = 12;
                this.año--;
            }

            this.dia = this.dia + DiasMes();
        }

    }

    public int DiasMes() {

        int resp = 0;

        if (this.mes >= 1 && this.mes <= 12) {
            if (this.mes == 2) {
                if ((this.año % 4) == 0 && (this.año % 100) != 0 || (this.año % 400) == 0) {
                    resp = 29;
                } else {
                    resp = 28;
                }
            } else {
                if ((this.mes == 1) || (this.mes == 3) || (this.mes == 5) || (this.mes == 7) || (this.mes == 8) || (this.mes == 10) || (this.mes == 12)) {
                    resp = 31;
                } else {
                    resp = 30;
                }
            }
        }

        return resp;
    }

    public int Comparar() {
        return Comparar(Calendar.DAY_OF_MONTH, Calendar.MONTH + 1,
                Calendar.YEAR);
    }

    public int Comparar(Fecha f) {
        return Comparar(f.dia, f.mes, f.año);
    }

    public int Comparar(int dia, int mes, int año) {
        if (año > this.año) {
            return -1;
        } else {
            if (año == this.año) {
                if (mes > this.mes) {
                    return -1;
                }
                if (mes == this.mes) {
                    if (dia > this.dia) {
                        return -1;
                    }
                    if (dia == this.dia) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
    }

    /**
     *
     * @param dia
     * @param mes
     * @param año
     * @return Edad si la fecha del parametro es mayor que la del objeto
     *
     * Null si la fecha del parametro es menor que la del objeto
     */
    public Fecha Edad(int dia, int mes, int año) {
        if (Comparar(dia, mes, año) <= 0) {
            Fecha edadR;
            if (this.dia > dia) {
                dia += 30;
                mes--;
            }
            if (this.mes > mes) {
                mes += 12;
                año--;
            }
            edadR = new Fecha(dia - this.dia, mes - this.mes, año - this.año);
            return edadR;
        }
        return null;
    }

    public Fecha Edad(Fecha f) {
        return Edad(f.dia, f.mes, f.año);
    }

    public Fecha Edad() {
        Calendar fecha = new GregorianCalendar();

        return Edad(fecha.get(Calendar.DAY_OF_MONTH), fecha.get(Calendar.MONTH) + 1,
                fecha.get(Calendar.YEAR));
    }

    public String Imprimir() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }

    public String Imprimir(boolean tipo) {

        String[] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        if (tipo == true) {
            return "Fecha: " + this.dia + "/" + this.mes + "/" + this.año;
        } else {
            return "Fecha: " + this.dia + "/" + Meses[this.mes - 1] + "/" + this.año;
        }

    }
}
