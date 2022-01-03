package Ventana_SoloCodigo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int año;
    private Calendar date = new GregorianCalendar();

    public Fecha() {
        dia = this.date.get(Calendar.DAY_OF_MONTH);
        mes = this.date.get(Calendar.MONTH) + 1;
        año = this.date.get(Calendar.YEAR);
    }

    public Fecha(int dia, int mes, int año) {
        if (año > 1900) {
            this.año = año;

            if (mes > 0 && mes <= 12) {
                this.mes = mes;

                if (dia > 0 && dia <= 31) {
                    if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                        this.dia = dia;
                    } else if (mes == 2 && dia <= 28 && añoBisiesto() == false) {
                        this.dia = dia;
                    } else if (mes == 2 && dia <= 29 && añoBisiesto() == true) {
                        this.dia = dia;
                    } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                        this.dia = dia;
                    } else {
                        //System.out.println("Dia ingresado incorrecto");
                        this.dia = 0;
                    }
                } else {
                    this.dia = 0;
                }

            } else if (mes < 1 && mes > 12) {
                //System.out.println("Mes ingresado incorrecto");
                this.mes = 0;
            }
        } else {
            //System.out.println("Año ingresado incorrecto");
            this.año = 0;
        }
    }

    /**
     * Descripcion: Comprueba si el año es bisiesto
     *
     * @return boolean Retorna true o false dependiendo del año
     */
    public boolean añoBisiesto() {
        boolean bisiesto;
        if (año % 4 == 0) {

            if (año % 100 == 0) {

                if (año % 400 == 0) {
                    bisiesto = true;
                } else {
                    bisiesto = false;
                }
            } else {
                bisiesto = true;
            }

        } else {
            bisiesto = false;
        }
        return bisiesto;
    }

    /**
     * Drescripcion: Comprueba cuantos dias tiene el mes
     *
     * @return diasMes Devuelve los dias que tiene el mes
     */
    public int diasMes() {
        int dias = 0;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2 && añoBisiesto() == false) {
            dias = 28;
        } else if (mes == 2 && añoBisiesto() == true) {
            dias = 29;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        }
        return dias;
    }

    /**
     * Drescripcion: Suma 1 dia al mes
     */
    public void incrementaDia() {
        dia++;
        if (diasMes() == 31) {
            if (dia > 31) {
                dia = dia - diasMes();
                mes++;
                if (mes > 12) {
                    mes = mes - 12;
                    año++;
                }
            }
        } else if (diasMes() == 30) {
            if (dia > 30) {
                dia = dia - diasMes();
                mes++;
            }
        } else {
            if (dia > diasMes()) {
                dia = dia - diasMes();
                mes++;
            }
        }
    }

    /**
     * Drescripcion: Suma los dias que el usuario decida
     */
    public void incrementaDia(int diaSumar) {

        dia += diaSumar;
        while (dia > diasMes()) {
            dia--;
            incrementaDia();
        }
    }

    /**
     * Drescripcion: Decrementa un dia al mes
     */
    public void decrementarDia() {
        dia--;
        if (diasMes() == 31) {
            if (dia < 1) {
                mes--;
                if (mes == 0) {
                    mes = 12;
                    año--;
                }
                dia = dia + diasMes();

            }
        } else if (diasMes() == 30) {
            if (dia < 1) {
                mes--;
                dia = dia + diasMes();
            }
        } else {
            if (dia < 1) {
                mes--;
                dia = dia + diasMes();
            }
        }
    }

    /**
     * Drescripcion: Decrementa los dias que el usuario requiere
     */
    public void decrementaDia(int diaRestar) {

        dia -= diaRestar;
        while (dia < 1) {
            dia++;
            decrementarDia();
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia <= 31) {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                this.dia = dia;
            } else if (mes == 2 && dia <= 28 && añoBisiesto() == false) {
                this.dia = dia;
            } else if (mes == 2 && dia <= 29 && añoBisiesto() == true) {
                this.dia = dia;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                this.dia = dia;
            }
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año >= 0) {
            this.año = año;
        }
    }

    public String Edad(int dia, int mes, int año) {
        int auxDia = 0;
        int auxMes = 0;
        int auxAño = 0;

        if (compararFecha(dia, mes, año) >= 1) {
            if (dia < this.dia) {
                mes--;
                dia = dia + 30;
            }

            if (mes < this.mes) {
                año--;
                mes = mes + 12;
            }

            auxDia = dia - this.dia;
            auxMes = mes - this.mes;
            auxAño = año - this.año;
        }
        return +auxAño + " Años con " + auxMes + " Meses y " + auxDia + " Dias";
    }

    public String Edad() {
        return Edad(date.get(Calendar.DAY_OF_MONTH), date.get(Calendar.MONTH) + 1, date.get(Calendar.YEAR));
    }

    public String Edad(Fecha fecha) {
        return Edad(fecha.dia, fecha.mes, fecha.año);
    }

    /**
     * Drescripcion: Compara la fecha del objeto con la fecha actual
     *
     * @return diasMes Devuelve un valor entero -1 si es menor, 0 si es igual o
     * 1 si es mayor
     */
    public int compararFecha() {
        return compararFecha(date.get(Calendar.DAY_OF_MONTH), date.get(Calendar.MONTH) + 1, date.get(Calendar.YEAR));
    }

    /**
     * Drescripcion: Compara la fecha del objeto con la fecha que se le pasa
     * como parametro
     *
     * @param dia recibe los dias en un valor tipo entero
     * @param mes recibe los meses en un valor tipo entero
     * @param año recibe los años en un valor tipo entero
     * @return diasMes Devuelve un valor entero -1 si es menor, 0 si es igual o
     * 1 si es mayor
     */
    public int compararFecha(int dia, int mes, int año) {
        boolean comprobar = false;
        Integer valor = null;
        if (año > 0) {
            if (mes > 0 && mes <= 12) {
                if (dia > 0 && dia <= 31) {
                    if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                        comprobar = true;
                    } else if (mes == 2 && dia <= 28 && añoBisiesto() == false) {
                        comprobar = true;
                    } else if (mes == 2 && dia <= 29 && añoBisiesto() == true) {
                        comprobar = true;
                    } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                        comprobar = true;
                    } else {
                        comprobar = false;
                    }
                } else {
                    comprobar = false;
                }

            } else if (mes < 1 && mes > 12) {
                comprobar = false;
            }
        } else {
            comprobar = false;
        }

        if (año > this.año) {
            valor = 1;
        } else {
            if (año == this.año) {
                if (mes > this.mes) {
                    valor = 1;
                }
                if (mes == this.mes) {
                    if (dia > this.dia) {
                        valor = 1;
                    }
                    if (dia == this.dia) {
                        valor = 0;
                    } else {
                        valor = -1;
                    }
                } else {
                    valor = -1;
                }
            } else {
                valor = -1;
            }
        }
        return valor;
    }

    /**
     * Drescripcion: Compara la fecha del objeto con un objeto tipo Fecha
     *
     * @param fecha recibe una referencia de un objeto tipo fecha
     * @return diasMes Devuelve un valor entero -1 si es menor, 0 si es igual o
     * 1 si es mayor
     */
    public int compararFecha(Fecha fecha) {
        return compararFecha(fecha.dia, fecha.mes, fecha.año);
    }

    public String imprimirDatos() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }

    public String imprimirDatos(Boolean tipo) {
        if (tipo) {
            return this.dia + "/" + nombreMes(this.mes) + "/" + this.año;
        } else {
            return this.dia + "/" + this.mes + "/" + this.año;
        }
    }

    private String nombreMes(int mes) {
        String nMes = null;
        switch (mes) {
            case 1:
                nMes = "Enero";
                break;
            case 2:
                nMes = "Febrero";
                break;
            case 3:
                nMes = "Marzo";
                break;
            case 4:
                nMes = "Abril";
                break;
            case 5:
                nMes = "Mayo";
                break;
            case 6:
                nMes = "Junio";
                break;
            case 7:
                nMes = "Julio";
                break;
            case 8:
                nMes = "Agosto";
                break;
            case 9:
                nMes = "Septiembre";
                break;
            case 10:
                nMes = "Octubre";
                break;
            case 11:
                nMes = "Noviembre";
                break;
            case 12:
                nMes = "Diciembre";
                break;
        }
        return nMes;
    }
    
    
    @Override
    public String toString(){
        return this.imprimirDatos();
    }

}
