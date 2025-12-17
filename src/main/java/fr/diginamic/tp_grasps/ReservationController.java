package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.IClientDao;
import fr.diginamic.tp_grasps.daos.ITypeReservation;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.factories.IResevationFactory;
import fr.diginamic.tp_grasps.factories.ReservationFactory;
import fr.diginamic.tp_grasps.services.IReservationService;
import fr.diginamic.tp_grasps.services.ReservationServices;
import fr.diginamic.tp_grasps.utils.DateUtils;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {
	private IReservationService resrvationServices=new ReservationServices();

	/** DAO permettant d'accéder à la table des clients */
	private IClientDao clientDao = new ClientDao();
	
	/** DAO permettant d'accéder à la table des types de réservation */
	private ITypeReservation typeReservationDao = new TypeReservationDao();

	private IResevationFactory factory =new ReservationFactory();
	
	/** Méthode qui créée une réservation pour un client à partir des informations transmises
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {
		
		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();
		
		// 2) Conversion de la date de réservation en LocalDateTime
		LocalDateTime dateReservation =  DateUtils.DatesUtils.toDate(dateReservationStr);
		
		// 3) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);
		
		// 4) Extraction de la base de données des infos concernant le type de la réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);
		// appele methode calcul total resa
		double total= resrvationServices.calculTotal(client,type,nbPlaces);


		// 5) Création de la réservation
		Reservation reservation =factory.getInstance(client,dateReservation,nbPlaces,total);

		
		// 6) Ajout de la réservation au client
		client.getReservations().add(reservation);


		return reservation;
	}

	
}
