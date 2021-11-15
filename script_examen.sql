drop table if exists autor;
CREATE TABLE IF  NOT  EXISTS autor (
idAutor	varchar(2)  NOT NULL  PRIMARY KEY,
nombre	VARCHAR(15),
apellido1 VARCHAR(15),
apellido2 VARCHAR(15),
puesto VARCHAR(35),
entidadTrabajo varchar(15));

drop table if exists pregunta;
CREATE TABLE IF  NOT  EXISTS pregunta(
idPregunta TINYINT IDENTITY PRIMARY KEY,
dificultad VARCHAR(10),
enunciado	VARCHAR(500),
idAutor varchar(2) NOT NULL,
CONSTRAINT FK_idAutor FOREIGN KEY (idAutor) REFERENCES autor (idAutor));

drop table if exists respuesta;
CREATE TABLE IF  NOT  EXISTS respuesta(
validez VARCHAR(2),
contenido VARCHAR(500),
idPregunta TINYINT,
CONSTRAINT FK_idPregunta FOREIGN KEY (idPregunta) REFERENCES pregunta (idPregunta));

