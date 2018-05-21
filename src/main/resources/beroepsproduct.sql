CREATE DATABASE TENTAMEN_INTEKENLIJST;
USE TENTAMEN_INTEKENLIJST;

CREATE TABLE STUDENT
(STUDENT_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
NAAM VARCHAR(50) NOT NULL,
VOORNAAM VARCHAR(50) NOT NULL,
EMAIL VARCHAR(50) NOT NULL,
STUDENTENNUMMER INT NOT NULL UNIQUE);

CREATE TABLE TENTAMEN
(TENTAMEN_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
TENTAMEN VARCHAR(50) NOT NULL,
OMSCHRIJVING VARCHAR(100) NOT NULL,
TENTAMENDATUM DATE NOT NULL,
TENTAMENSTARTTIJD TIME NOT NULL,
TENTAMENDUUR VARCHAR(50) NOT NULL);


CREATE TABLE TENTAMENINTEKENLIJST
(INTEKEN_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
STUDENT_ID INT NOT NULL,
CONSTRAINT FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(STUDENT_ID),
TENTAMEN_ID INT NOT NULL,
CONSTRAINT FOREIGN KEY (TENTAMEN_ID) REFERENCES TENTAMEN(TENTAMEN_ID),
INGETEKEND VARCHAR(50) NOT NULL);


