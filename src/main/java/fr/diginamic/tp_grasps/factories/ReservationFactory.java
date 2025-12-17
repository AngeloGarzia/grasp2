package fr.diginamic.tp_grasps.factories;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

import java.time.LocalDateTime;

public class ReservationFactory implements IResevationFactory{
    public Reservation getInstance(Client client,LocalDateTime dateReservation, int nbPlaces, double total){

        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);
        reservation.setTotal(total);
        return reservation;
    }
}
