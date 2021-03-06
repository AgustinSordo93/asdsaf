CREATE TABLE PERSONAS (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
apellido VARCHAR (100) NOT NULL,
observaciones VARCHAR (400) NOT NULL
);

CREATE TABLE TIPOS_CONTACTO (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
CONSTRAINT UNIQUE INDEX tipos_contacto_nombre_idx (nombre)
);

CREATE TABLE TIPOS_DOMICILIO (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100),
CONSTRAINT UNIQUE INDEX tipos_domicilio_nombre_idx (nombre)
);

CREATE TABLE CONTACTOS (
id INT PRIMARY KEY AUTO_INCREMENT,
persona_id INT NOT NULL,
contacto VARCHAR (1024) NOT NULL,
tipo_contacto_id INT NOT NULL,
FOREIGN KEY (persona_id) REFERENCES personas(id),
FOREIGN KEY (tipo_contacto_id) REFERENCES tipos_contacto(id)
);

CREATE TABLE LOCALIDADES (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
CONSTRAINT UNIQUE INDEX localidades_nombre_idx (nombre)
);

CREATE TABLE DOMICILIOS (
id INT PRIMARY KEY AUTO_INCREMENT,
persona_id INT NOT NULL,
calle VARCHAR (100) NOT NULL,
numero INT NOT NULL,
piso INT NOT NULL,
localidad_id INT NOT NULL,
FOREIGN KEY (persona_id) REFERENCES personas(id),
FOREIGN KEY (localidad_id) REFERENCES localidades (id)
);

CREATE TABLE TAREAS (
id INT PRIMARY KEY AUTO_INCREMENT,
persona_id INT NOT NULL,
tiulo_tarea VARCHAR(255) NOT NULL,
descripcion_tarea VARCHAR(2000) NOT NULL,
FOREIGN KEY (persona_id) REFERENCES personas(id),

