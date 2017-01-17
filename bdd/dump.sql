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
	
-- Table: "public".annonce

-- DROP TABLE "public".annonce;

CREATE TABLE "public".annonce
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

ALTER TABLE "public".annonce
    OWNER to postgres;
	
-- Table: "public".menu

-- DROP TABLE "public".menu;

CREATE TABLE "public".menu
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

ALTER TABLE "public".menu
    OWNER to postgres;
	
-- Table: "public".profil

-- DROP TABLE "public".profil;

CREATE TABLE "public".profil
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

ALTER TABLE "public".profil
    OWNER to postgres;
	
-- Table: "public".reservation

-- DROP TABLE "public".reservation;

CREATE TABLE "public".reservation
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

ALTER TABLE "public".reservation
    OWNER to postgres;
	
-- Table: "public".restaurant

-- DROP TABLE "public".restaurant;

CREATE TABLE "public".restaurant
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

ALTER TABLE "public".restaurant
    OWNER to postgres;
	
-- Table: "public".role

-- DROP TABLE "public".role;

CREATE TABLE "public".role
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

ALTER TABLE "public".role
    OWNER to postgres;
	
-- Table: "public".utilisateur

-- DROP TABLE "public".utilisateur;

CREATE TABLE "public".utilisateur
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

ALTER TABLE "public".utilisateur
    OWNER to postgres;