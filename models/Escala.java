package models;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Escala {

    private DayOfWeek diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;

    public Escala(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana; 
        this.horaInicio = LocalTime.of(7, 0, 0);
        this.horaFim = LocalTime.of(12, 0, 0);
    }

    public void setDia(int day) {
        this.diaSemana = DayOfWeek.of(day); 
    }

    public void setInicio(int h, int m) {
        this.horaInicio = LocalTime.of(h, m, 0); 
    }

    public void setFim(int h, int m) {
        this.horaFim = LocalTime.of(h, m, 0); 
    }

    public DayOfWeek getDiaSemana() {
        return this.diaSemana;
    }

    public LocalTime getHoraInicio() {
        return this.horaInicio;
    }

    public LocalTime getHoraFim() {
        return this.horaFim;
    }

    public String getEscala() {
        return this.diaSemana + " " + this.horaInicio + " - " + this.horaFim;
    }

    @Override
    public String toString() {
        return getEscala();
    }
}
