/*Creación de la base de datos Fruver_Hello_World*/

create database Fruver_Hello_World;

/*Uso de la base de datos*/

use Fruver_Hello_World;

/*Creación de la tabla Contacto*/

create table Contacto
(
Email varchar(30) primary key,
Nombre varchar(30) not null,
Apellido varchar(30) not null,
Telefono int(10) not null,
Descripcion_Duda varchar(255) not null
);

/*Consulta de la tabla Contacto*/

select * from Contacto;