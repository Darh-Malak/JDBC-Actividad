CREATE DATABASE IF NOT EXISTS sistema_ventas;
USE sistema_ventas;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

-- Datos de prueba
INSERT INTO usuarios (nombre, email) VALUES ('Usuario Inicial', 'admin@ejemplo.com');
