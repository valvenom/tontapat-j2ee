INSERT INTO `espece` (nom) VALUES ('equidés');
INSERT INTO `espece` (nom) VALUES ('bovins');
INSERT INTO `espece` (nom) VALUES ('ovins');
INSERT INTO `espece` (nom) VALUES ('caprins');

INSERT INTO `race` (nom, espece_id_espece) VALUES ('arabe', '1');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('pur-sang', '1');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('shetland', '1');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('angus', '2');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('holstein', '2');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('hereford', '2');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('suffolk', '3');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('texel', '3');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('vendéen', '3');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('alpine', '4');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('saanen', '4');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('poitevine', '4');

INSERT INTO `type_utilisateur` (nom) VALUES ('particulier');
INSERT INTO `type_utilisateur` (nom) VALUES ('entreprise');
INSERT INTO `type_utilisateur` (nom) VALUES ('collectivités');

INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('49.19947182095012','2.5200215043945473', '6 Voie Communale Ferme du Courtillet', '871', '2024-08-30','1845364985437619','2021-04-02','1957-03-24','robert.legrand@wanadoo.fr','azerty','Legrand','0375869412','robert.legrand@wanadoo.fr','Robert', 'particulier/berger', 'Vous pouvez me faire confiance','RRSDIFEUF8UEY','FR763000100794123456789018500794', '1');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('49.00796762076816','2.9402485551757973', 'Chemin Rural du Noyer Thomas', '834', '2024-11-05','2584367925483666','2021-05-24','1989-03-07','jean.gaspard@orange.fr','chaussette','Gaspard','0345668791','jean.gaspard@orange.fr','Jean','Les Gros Moutons','moins tu dors, plus tu es fort','GIEZJGUIZEHFUH','FR79485298725972579257927868','2');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('49.50452078654965','1.9339695634765786', 'Bois de Haucourt', '435', '2025-06-27','8432976425558463','2021-06-11','1977-01-21','youri.zapoi@wanadoo.fr','manteau','Zapoi','0333258874','youri.zapoi@wanadoo.fr','Youri','La machine bio','Venez voir mes bêtes','RHGEUFHUEFZZ','FR9629265942984524895242485242','2');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('48.966062064184236','3.0216160478515786', 'Rue Marcel Neyrat', '753', '2025-03-21','5649254254258444','2021-06-15','1971-01-21','jacqueline.treni@gmail.fr','hello','Treni','0375462845','jacqueline.treni@gmail.fr','Jacqueline','particulier/propiétaire terrain','Les espaces verts sont ma vie','UJFHEZUFHEZUY','FR96291751872587579127472','1');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('48.83832616391294','3.0957737626953286', 'Ferme du Charnoy', '154', '2024-03-25','8757286876786448','2021-07-05','1982-01-21','marie.levasseur@gmail.fr','secret','Levasseur','0354285417','marie.levasseur@gmail.fr','Marie','particulier/propiétaire terrain','la plus belle ferme','FIEZJFIZEJFUCE','FR975785781679619785987','1');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('48.74197033276085','3.1297627153320473', '18 Rue de la Chapelle', '526', '2023-01-12','7613175751875478','2021-07-28','1986-07-02','nathalie.renouie@gmail.fr','cadeau','Renouie','0379679584','nathalie.renouie@gmail.fr','Nathalie','Zone verte eco+','espaces vert en besoin !','ZOIEJGEZIDHUEZ','FR73287827846287795452','3');

INSERT INTO `type_vegetation` (nom) VALUES ('Renouée du japon');
INSERT INTO `type_vegetation` (nom) VALUES ('Ailante');
INSERT INTO `type_vegetation` (nom) VALUES ('Aster américain');
INSERT INTO `type_vegetation` (nom) VALUES ('Robinier');
INSERT INTO `type_vegetation` (nom) VALUES ('Ambroisie');
INSERT INTO `type_vegetation` (nom) VALUES ('Buddléia');
INSERT INTO `type_vegetation` (nom) VALUES ('Herbacée');
INSERT INTO `type_vegetation` (nom) VALUES ('Arbustive');
INSERT INTO `type_vegetation` (nom) VALUES ('Arborée');
INSERT INTO `type_vegetation` (nom) VALUES ('Broussailles');
INSERT INTO `type_vegetation` (nom) VALUES ('ronciers');

INSERT INTO `type_intervention` (nom) VALUES ('clôture endommagée');
INSERT INTO `type_intervention` (nom) VALUES ('abris endommagée');
INSERT INTO `type_intervention` (nom) VALUES ('abreuvoir endommagée');
INSERT INTO `type_intervention` (nom) VALUES ('animal blessé');
INSERT INTO `type_intervention` (nom) VALUES ('animal mort');
INSERT INTO `type_intervention` (nom) VALUES ('animal manquant');

INSERT INTO `type_cloture` (nom) VALUES ('clôture fil grillagé');
INSERT INTO `type_cloture` (nom) VALUES ('clôture électrique');
INSERT INTO `type_cloture` (nom) VALUES ('panneau grillage rigide');
INSERT INTO `type_cloture` (nom) VALUES ('ganivelle');

INSERT INTO `type_abri` (nom) VALUES ('abri de prairie mobile');
INSERT INTO `type_abri` (nom) VALUES ('abri en bois');
INSERT INTO `type_abri` (nom) VALUES ('abri en acier');
INSERT INTO `type_abri` (nom) VALUES ('abri en béton');

INSERT INTO `type_abreuvoir` (nom) VALUES ('bac à eau');
INSERT INTO `type_abreuvoir` (nom) VALUES ('râtelier');
INSERT INTO `type_abreuvoir` (nom) VALUES ('auge');

INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.19947182095012','2.5200215043945473', '6 Voie Communale Ferme du Courtillet','2021-04-04','2021-04-04','Là où elles passent, l herbe ne repoussent plus', true, '500','Les chèvres Attila','10','1');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.19947182095012','2.5200215043945473', '6 Voie Communale Ferme du Courtillet','2021-04-08','2021-06-10','Transforme une prairie rayonnant de vie en un désert sans vie', false, '200','Les faiseuses de désert','11','1');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.00796762076816','2.9402485551757973', 'Chemin Rural du Noyer Thomas','2021-05-30','2021-05-30','Ces vaches seront discrète et éfficace', false, '50','Les vaches ninjas','4','2');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.50452078654965','1.9339695634765786', 'Bois de Haucourt','2021-06-11','2021-06-15','Ces juments seront un choix idéal pour prairie de grande envergure', false, '20','Les juments grises','3','3');

INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('48.966062064184236','3.0216160478515786', 'Rue Marcel Neyrat','2021-06-15','Vaste terrain avec une majeur partie dans les collines','Les vertes collines', '125', '4');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('48.83832616391294','3.0957737626953286', 'Ferme du Charnoy','2021-07-06','Terrain à l abandon ayant besoin d ordre','La jungle', '200', '5');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('48.74197033276085','3.1297627153320473', '18 Rue de la Chapelle','2021-07-29','Petite prairie qui accueillerait avec plaisir un troupeau pour sa gestion','La prairie chatoyante', '50', '6');

INSERT INTO `seuil_tarification` (coef_installation, coef_intervention, nom, prix_bete_jour, prix_km) VALUES ('1.25', '1.20', 'tarification classic', '50', '15');
INSERT INTO `seuil_tarification` (coef_installation, coef_intervention, nom, prix_bete_jour, prix_km) VALUES ('1.20', '1.15', 'tarification spéciale', '35', '5');

INSERT INTO `condition_annulation` (delai_jours, nom, pourcentage_facturation) VALUES ('90', 'condition classic', '0.40');
INSERT INTO `condition_annulation` (delai_jours, nom, pourcentage_facturation) VALUES ('40', 'condition spéciale', '0.20');

INSERT INTO `motif_annulation` (nom) VALUES ('non paiement');
INSERT INTO `motif_annulation` (nom) VALUES ('rupture amiable');
INSERT INTO `motif_annulation` (nom) VALUES ('danger/risque pour le troupeau');
INSERT INTO `motif_annulation` (nom) VALUES ('déménagement');

INSERT INTO `motif_reclamation` (nom) VALUES ('mauvais traitement des animaux');
INSERT INTO `motif_reclamation` (nom) VALUES ('non conformité du terrain');
INSERT INTO `motif_reclamation` (nom) VALUES ('non respect des actions de suivie');

INSERT INTO `annonce` (nom) VALUES ('non respect des actions de suivie');


