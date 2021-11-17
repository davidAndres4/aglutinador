drop table respuesta;
drop table pregunta;
drop table autor;

CREATE TABLE IF  NOT  EXISTS autor (
idAutor	varchar(200)  NOT NULL  PRIMARY KEY,
nombre	VARCHAR(200),
apellido1 VARCHAR(200),
apellido2 VARCHAR(200),
puesto VARCHAR(200),
entidadTrabajo varchar(200));

CREATE TABLE IF  NOT  EXISTS pregunta(
idPregunta TINYINT IDENTITY PRIMARY KEY,
dificultad VARCHAR(200),
enunciado	VARCHAR(200),
idAutor varchar(2) NOT NULL,
CONSTRAINT FK_idAutor FOREIGN KEY (idAutor) REFERENCES autor (idAutor));

CREATE TABLE IF  NOT  EXISTS respuesta(
validez VARCHAR(200),
contenido VARCHAR(200),
idPregunta TINYINT,
CONSTRAINT FK_idPregunta FOREIGN KEY (idPregunta) REFERENCES pregunta (idPregunta));

