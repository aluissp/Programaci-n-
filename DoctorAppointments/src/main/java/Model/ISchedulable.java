package Model;

import java.util.Date;

public interface ISchedulable {

    //Valor o atributo en interfaz
    public static final double VALORFINAL = 0501.2002;

    void schedulable(Date date, String time);
}
