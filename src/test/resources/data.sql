insert into ville(id_ville, cd_insee, cp, nom_ville) VALUES (1,'0075','0075','ParisTest');
insert into ville(id_ville, cd_insee, cp, nom_ville) VALUES (2,'94600','0094600','Choisy le roiTest');

insert into client(id_client, email_client, mdp_client, nom_client, prenom_client, ville_id_ville) VALUES (1,'email@Testclient.com', 'mdp123','nomClient','TestprenomClient',1);
insert into client(id_client, email_client, mdp_client, nom_client, prenom_client, ville_id_ville) VALUES (2,'email@Testclient2.com', 'mdp123','nomClient2','TestprenomClient2',2);

insert into artisan(id_artisan, adress_artisan2, rs_artisan, adress_artisan, email_artisan, mdp_artisan, nom_artisan, prenom_artisan, tel_artisan, ville_id_ville) VALUES (1,'adtress2 Artisan ','raisonS artisan','adresse1 Artisan', 'email@artisant.com','mdp123', 'nomArtisan1', 'prenomArtisan1','0102030405',1);
insert into artisan(id_artisan, adress_artisan2, rs_artisan, adress_artisan, email_artisan, mdp_artisan, nom_artisan, prenom_artisan, tel_artisan, ville_id_ville) VALUES (2,'adtress2 Artisan2 ','raisonS artisan2','adresse1 Artisan2', 'email@artisant2.com','mdp123', 'nomArtisan2', 'prenomArtisan2','0102030405',2);

insert into service_art(id_service_art, nom_service) VALUES (1,'Plomberie');
insert into service_art(id_service_art, nom_service) VALUES (2,'Carrelagerie');

insert into realisation(id_realisation, titre_realisation, artisan_id_artisan, service_art_id_service_art) VALUES (1,'titre realisation1',1, 1);
insert into realisation(id_realisation, titre_realisation, artisan_id_artisan, service_art_id_service_art) VALUES (2,'titre realisation2',2, 2);

insert into photo(id_photo, url_photo, realisation_id_realisation) VALUES (1,'urlphotoRealisation1.jpg',1);
insert into photo(id_photo, url_photo, realisation_id_realisation) VALUES (2,'urlphotoRealisation2.jpg',2);

insert into commentaire(id_com, data_com, note, text_com, artisan_id_artisan, client_id_client) VALUES (1, '2022-01-01',5 ,'text commentaire client 1 artisant 1', 1, 1);
insert into commentaire(id_com, data_com, note, text_com, artisan_id_artisan, client_id_client) VALUES (2, '2022-01-01',5 ,'text commentaire client 2 artisant 2', 2, 2);
