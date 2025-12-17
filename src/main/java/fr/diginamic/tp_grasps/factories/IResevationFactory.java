package fr.diginamic.tp_grasps.factories;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

import java.time.LocalDateTime;

public interface IResevationFactory {
    Reservation getInstance(Client client, LocalDateTime dateReservation, int nbPlaces,
                                   double total);
}
