/*Pour avoir la meme structure de la base de données : 
1- Créer sous pgAdmin une base de données "laCuillere" (CD sur Databases/create/Database)
2- Ensuite créer un schèma "laCuillere"
3- Copier la structure de toutes les tables
4- CD sur la base laCuillere/Query tools
5- Coller la structure dans le champ SQL
6- Appuyer sur F5 pour l'exécuter
Toutes les tables seront créée sur la base. 
*/
-- Database: laCuillere

-- DROP DATABASE "laCuillere";

CREATE DATABASE "laCuillere"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'French_France.1252'
    LC_CTYPE = 'French_France.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
-- Table: "laCuillere".annonce

-- DROP TABLE "laCuillere".annonce;

CREATE TABLE "laCuillere".annonce
(
    idannonce smallint NOT NULL,
    restaurateur character varying(45) COLLATE pg_catalog."default",
    restaurant character varying(45) COLLATE pg_catalog."default",
    idmenu smallint,
    plagedispo character varying(45) COLLATE pg_catalog."default",
    nbreplacedispo smallint,
    datededispo character varying(45) COLLATE pg_catalog."default",
    reduction character varying(45) COLLATE pg_catalog."default",
    pourcreduction character varying(45) COLLATE pg_catalog."default",
    idtelephone smallint,
    idemail smallint,
    CONSTRAINT annonce_pkey PRIMARY KEY (idannonce)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "laCuillere".annonce
    OWNER to postgres;
	
-- Table: "laCuillere".menu

-- DROP TABLE "laCuillere".menu;

CREATE TABLE "laCuillere".menu
(
    idmenu smallint NOT NULL,
    prix smallint,
    libelle character varying(45) COLLATE pg_catalog."default",
    CONSTRAINT menu_pkey PRIMARY KEY (idmenu)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "laCuillere".menu
    OWNER to postgres;
	
-- Table: "laCuillere".profil

-- DROP TABLE "laCuillere".profil;

CREATE TABLE "laCuillere".profil
(
    idprofil smallint NOT NULL,
    profil character varying(45) COLLATE pg_catalog."default",
    codelibellerole character varying(45) COLLATE pg_catalog."default",
    CONSTRAINT profil_pkey PRIMARY KEY (idprofil)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "laCuillere".profil
    OWNER to postgres;
	
-- Table: "laCuillere".reservation

-- DROP TABLE "laCuillere".reservation;

CREATE TABLE "laCuillere".reservation
(
    idreservation smallint NOT NULL,
    date character varying(45) COLLATE pg_catalog."default",
    heuredebut character varying(45) COLLATE pg_catalog."default",
    heurefin character varying(45) COLLATE pg_catalog."default",
    nbrepersonnes smallint,
    idrestaurant smallint,
    idclient time without time zone,
    CONSTRAINT reservation_pkey PRIMARY KEY (idreservation)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "laCuillere".reservation
    OWNER to postgres;
	
-- Table: "laCuillere".restaurant

-- DROP TABLE "laCuillere".restaurant;

CREATE TABLE "laCuillere".restaurant
(
    idrestaurant smallint NOT NULL,
    nom character varying(45) COLLATE pg_catalog."default",
    adresse character varying(45) COLLATE pg_catalog."default",
    telephone character varying(45) COLLATE pg_catalog."default",
    email character varying(45) COLLATE pg_catalog."default",
    categorie character varying(45) COLLATE pg_catalog."default",
    ville character varying(45) COLLATE pg_catalog."default",
    idmenu smallint,
    idprofil smallint,
    CONSTRAINT restaurant_pkey PRIMARY KEY (idrestaurant)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "laCuillere".restaurant
    OWNER to postgres;
	
-- Table: "laCuillere".role

-- DROP TABLE "laCuillere".role;

CREATE TABLE "laCuillere".role
(
    idrole smallint NOT NULL,
    coderole character varying(45) COLLATE pg_catalog."default",
    libellerole character varying(45) COLLATE pg_catalog."default",
    CONSTRAINT role_pkey PRIMARY KEY (idrole)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "laCuillere".role
    OWNER to postgres;
	
-- Table: "laCuillere".utilisateur

-- DROP TABLE "laCuillere".utilisateur;

CREATE TABLE "laCuillere".utilisateur
(
    idutilisateur smallint NOT NULL,
    nom character varying(45) COLLATE pg_catalog."default",
    prenom character varying(45) COLLATE pg_catalog."default",
    telephone character varying(45) COLLATE pg_catalog."default",
    adresse character varying(45) COLLATE pg_catalog."default",
    email character varying(45) COLLATE pg_catalog."default",
    motdepasse character varying(45) COLLATE pg_catalog."default",
    CONSTRAINT utilisateur_pkey PRIMARY KEY (idutilisateur)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "laCuillere".utilisateur
    OWNER to postgres;