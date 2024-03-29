package org.generation.italy.JDBC_ente_sportivo.model.dao;

public class QueryCatalog {
	
    /////////////////////////// SELECT ///////////////////////////
	
	public static final String selectFromGaraByPrimaryKey =
            " SELECT id_gara, data_ora_gara, luogo	"
          + "   FROM gara                                  "
          + "  WHERE gara.id_gara = ?              	";
	
	public static final String selectFromVelocistaByPrimaryKey =
            " SELECT nominativo, eta, codice_fiscale, altezza, peso	"
          + "   FROM velocista                                  "
          + "  WHERE velocista.codice_fiscale = ?              	";
	
	public static final String selectFromIscrizioneByCodiceFiscale =
            " SELECT data_iscrizione, codice_fiscale, id_gara	"
          + "   FROM iscrizione                            "
          + "  WHERE iscrizione.codice_fiscale = ?              	";
	
	public static final String selectFromIscrizioneByIdGara =
            " SELECT data_iscrizione, codice_fiscale, id_gara	"
          + "   FROM iscrizione                            "
          + "  WHERE iscrizione.id_gara = ?              	";
	
	public static final String selectFromPartecipazioneByCodiceFiscale =
            " SELECT tempo, codice_fiscale, id_gara	"
          + "   FROM partecipazione                          "
          + "  WHERE partecipazione.codice_fiscale = ?              	";
	
	public static final String selectFromPartecipazioneByIdGara =
            " SELECT tempo, codice_fiscale, id_gara	"
          + "   FROM partecipazione                          "
          + "  WHERE partecipazione.id_gara = ?              	";
	
	public static final String selectFromGara =
			  " SELECT * " + 
			  "FROM gara   ";
	
	
	
	
	 /////////////////////////// INSERT ///////////////////////////
	
	public static final String insertGara = 
			" INSERT INTO gara (data_ora_gara, luogo) VALUES (?, ?) ";
	
	public static final String insertVelocista = 
			" INSERT INTO velocista (nominativo, eta, codice_fiscale, altezza, peso) VALUES (?, ?, ?, ?, ?) ";
	
	public static final String insertIscrizione = 
			" INSERT INTO iscrizione (data_iscrizione, codice_fiscale, id_gara) VALUES (?, ?, ?) ";
	
	public static final String insertPartecipazione = 
			" INSERT INTO partecipazione (tempo, codice_fiscale, id_gara) VALUES (?, ?, ?) ";
	
	
	
	
}

