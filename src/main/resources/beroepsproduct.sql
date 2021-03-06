DROP DATABASE IF EXISTS tentamen_intekenlijst;
CREATE DATABASE IF NOT EXISTS tentamen_intekenlijst;
USE TENTAMEN_INTEKENLIJST;


DROP TABLE IF EXISTS `student`
CREATE TABLE IF NOT EXISTS `student`(
	`STUDENT_ID` INT(11) NOT NULL AUTO_INCREMENT,
	`NAAM` VARCHAR(50) NOT NULL,
	`VOORNAAM` VARCHAR(50) NOT NULL,
	`EMAIL` VARCHAR(50) NOT NULL,
	`STUDENTENNUMMER` VARCHAR(15) NOT NULL,
	`ADRES` VARCHAR(50) NOT NULL,
	`CONTACTNUMMER` VARCHAR(50) NOT NULL,
	`GESLACHT` ENUM('M','V') NOT NULL,
	`GEBOORTEDATUM` VARCHAR (50) NOT NULL,
	PRIMARY KEY (`STUDENT_ID`),
	UNIQUE INDEX `STUDENTENNUMMER` (`STUDENTENNUMMER`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

INSERT INTO STUDENT (NAAM, VOORNAAM, EMAIL, STUDENTENNUMMER, ADRES, CONTACTNUMMER, GESLACHT, GEBOORTEDATUM)
VALUES ('Jhinkoe', 'Vinesh', 'vi.jhinkoe@unasat.sr', 'BI/1117/006', 'Aventendorlaan #399', '+597 8134679', 'M', '1964-09-02'),
       ('van der Kuijp', 'David', 'd.vanderkuijp@unasat.sr', 'SNE/1117/023', 'Antondrachtenweg #9', '+597 8986314', 'M', '1989-12-12'),
       ('van `t Kruys', 'Mitchell', 'm.vantkruys@unasat.sr', 'SNE/1117/024', 'Hornilaan #69', '+597 8676979', 'M', '1899-01-16'),
       ('Tokromo', 'Riandie', 'r.tokromo@unasat.sr', 'BI/1117/011', 'Londonstraat #25', '+597 8154257', 'M', '1971-06-28'),
       ('Vigelandzoon', 'Andrew', 'a.vigelandzoon@unasat.sr', 'BI/1117/012', 'Boesilaan #1', '+597 8024394', 'M', '1946-06-14'),
       ('Yard', 'Chesron', 'c.yard@unasat.sr', 'SNE/1117/025', 'Metallicastraat #42', '+597 8134679', 'M', '1963-08-03');


DROP TABLE IF EXISTS `tentamen`
CREATE TABLE IF NOT EXISTS `tentamen` (
	`TENTAMEN_ID` INT(11) NOT NULL AUTO_INCREMENT,
	`VAK` VARCHAR(50) NOT NULL,
	`OMSCHRIJVING` TEXT NOT NULL,
	`TENTAMENDATUM` VARCHAR (50) NOT NULL,
	`TENTAMENSTARTTIJD` VARCHAR (50) NOT NULL,
	`TENTAMENDUUR` VARCHAR(50) NOT NULL,
	`TENTAMENTYPE` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`TENTAMEN_ID`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=49
;

INSERT INTO TENTAMEN (VAK, OMSCHRIJVING, TENTAMENDATUM, TENTAMENSTARTTIJD, TENTAMENDUUR, TENTAMENTYPE)
VALUES ('Wisk', 'Wiskunde', '2019-01-23', '08:00', '2 uren', 'Regulier tentamen'),
       ('Nat', 'Natuurkunde', '2019-01-29', '09:00', '3 uren', 'Regulier tentamen'),
       ('W.T.O.', 'Werktuig Onderdelen', '2019-02-02', '08:00', '2 uren', 'Hertentamen'),
       ('E-leer', 'Electriciteitsleer', '2019-02-12', '10:00', '2 uren', 'Regulier tentamen'),
       ('God', 'Godsdienst', '2019-02-14', '08:00', '1 uur', 'Hertentammen'),
       ('Comp-Gam', 'Competetive Gaming', '2019-02-20', '20:00', '6 uren', 'Regulier tentamen'),
       ('Ja-Da', 'Java-Databases', '2019-02-23', '08:00', '2 uren', 'Hertentamen'),
	   ('Pokemon', 'Gotta catch them all', '2019-06-06', '16:20', '2 uren', 'Hertentamen');

DROP TABLE IF EXISTS `tentamenintekenlijst`
CREATE TABLE IF NOT EXISTS `tentamenintekenlijst` (
	`INTEKEN_ID` INT(11) NOT NULL AUTO_INCREMENT,
	`STUDENTID` INT(11) NOT NULL,
	`STUDENTNAAM` VARCHAR(50) NULL DEFAULT NULL,
	`STUDENTVOORNAAM` VARCHAR(50) NULL DEFAULT NULL,
	`TENTAMENID` INT(11) NULL DEFAULT NULL,
	`TENTAMENNAAM` VARCHAR(50) NULL DEFAULT NULL,
	`INTEKEN_DATUM` VARCHAR (50) NULL DEFAULT NULL,
	`UITTEKEN_DATUM` VARCHAR (50) NULL DEFAULT NULL,
	`INGETEKEND` ENUM('JA','NEE') NULL DEFAULT NULL,
	PRIMARY KEY (`INTEKEN_ID`),
	INDEX `STUDENTID` (`STUDENTID`),
	INDEX `TENTAMENID` (`TENTAMENID`),
	CONSTRAINT `tentamenintekenlijst_ibfk_1` FOREIGN KEY (`STUDENTID`) REFERENCES `student` (`STUDENT_ID`),
	CONSTRAINT `tentamenintekenlijst_ibfk_2` FOREIGN KEY (`TENTAMENID`) REFERENCES `tentamen` (`TENTAMEN_ID`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=70
;

insert into TENTAMENINTEKENLIJST (STUDENTID,STUDENTNAAM,STUDENTVOORNAAM,TENTAMENID,TENTAMENNAAM)
select STUDENT_ID,NAAM,VOORNAAM,TENTAMEN_ID,VAK
FROM student,tentamen
;

