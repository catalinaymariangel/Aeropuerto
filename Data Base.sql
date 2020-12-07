create table aeropuerto (
    nombre varchar (150),
    fecha_de_fundacion date, 
    categoria varchar (100),
    cantidad_de_vuelos integer,
    numero_del_canal_de_radio_de_torre varchar (50),
    
    primary key (nombre)
);

create table pista_aerea(
    id integer auto_increment,
    metros_que_abarca integer,
    cantidad_de_señalizaciones integer,
    nombre_aeropuerto varchar (150),

    primary key (id)
);

create table aerolinea(
    numero_nit varchar (200),
    años_de_experiencia_en_el_mercado integer,
    cantidad_de_aeronaves integer,

    primary key (numero_nit)
);

create table torre_de_control(
    numero_del_canal_de_radio varchar(50),
    horas_de_trabajo integer,
    ingeniero_a_cargo varchar (100),
    nombre_aeropuerto varchar (150),

    primary key (numero_del_canal_de_radio)
);

create table maneja(
    nombre_aeropuerto varchar (150),
    numero_de_nit varchar (200),
    hora_fecha_desvinculacion datetime,
    hora_fecha_vinculacion datetime,

    primary key (nombre_aeropuerto, numero_de_nit, hora_fecha_desvinculacion)
);


alter table aeropuerto
add foreign key (numero_del_canal_de_radio_de_torre) references torre_de_control (numero_del_canal_de_radio);

alter table pista_aerea
add foreign key (nombre_aeropuerto) references aeropuerto (nombre);

alter table torre_de_control
add foreign key (nombre_aeropuerto) references aeropuerto (nombre);

alter table maneja
add foreign key (nombre_aeropuerto) references aeropuerto (nombre);

alter table maneja
add foreign key (numero_de_nit) references aerolinea (numero_nit);



--PRIMER AEROPUERTO

insert into aeropuerto (nombre, fecha_de_fundacion, categoria, cantidad_de_vuelos, numero_del_canal_de_radio_de_torre)
 values ("Airline Marcat", "2003-12-03", "comercial", 1200, null)

 insert into pista_aerea (metros_que_abarca, cantidad_de_señalizaciones, nombre_aeropuerto) 
    values (270, 300, "Airline Marcat")

 insert into torre_de_control (numero_del_canal_de_radio, horas_de_trabajo, ingeniero_a_cargo, nombre_aeropuerto) 
    values ("9082-7", 10, "Alejandro", "Airline Marcat")

insert into aerolinea (numero_nit, años_de_experiencia_en_el_mercado, cantidad_de_aeronaves) 
    values ("9082-7", 16, 460)

 insert into maneja (nombre_aeropuerto, numero_de_nit, hora_fecha_desvinculacion, hora_fecha_vinculacion) 
    values ("Airline Marcat", "9082-7", "2020-11-23 8:12:00","2003-12-22 13:00:34")

--SEGUNDO AEROPUERTO

insert into aeropuerto values ("Acapulco", "2016-03-12", "Carga Aerea", 190, null)

insert into pista_aerea (metros_que_abarca, cantidad_de_señalizaciones, nombre_aeropuerto) 
	    values (210, 350, "Acapulco")

insert into torre_de_control values ("101.3", 8, "Martín", "Acapulco")

insert into aerolinea values ("7830-1", 3, 110)

insert into maneja values ("Acapulco", "7830-1", "2019-01-25 12:17:04", "2016-03-30 7:45:15")


--TERCER AEROPUERTO

insert into aeropuerto values ("Bindi Vuela", "2005-05-23", "Regional/Nacional", 2500, null)

insert into pista_aerea (metros_que_abarca, cantidad_de_señalizaciones, nombre_aeropuerto) 
    values (350, 200, "Bindi Vuela")

insert into torre_de_control values ("89.1", 12, "Antonella", "Bindi Vuela")

insert into aerolinea values ("5134-6", 9, 220)

insert into maneja values ("Bindi Vuela", "5134-6", "2015-01-08 9:46:13", "2005-05-29 14:10:40")



--CUARTO AEROPUERTO

insert into aeropuerto values ("Skyhere", "1991-10-02", "Internacional",3600, null)

insert into pista_aerea (metros_que_abarca, cantidad_de_señalizaciones, nombre_aeropuerto)
	values (555, 460, "Skyhere")

insert into pista_aerea (metros_que_abarca, cantidad_de_señalizaciones, nombre_aeropuerto)
	values (168, 116, "Skyhere")

insert into torre_de_control values ("112.5", 24, "Isabel", "Skyhere")

insert into aerolinea values ("1604-9", 28,990)

insert into maneja values ("Skyhere", "1604-9", "2020-03-16 15:05:22", "1991-10-12 16:00:00")



--QUINTO AEROPUERTO

insert into aeropuerto values ("Wonderful Sky", "2018-06-25", "Militar", 1866, null)

insert into torre_de_control values ("77.8", 15, "Mario", "Wonderful Sky")

insert into aerolinea values ("2238-0",2,610)

insert into maneja values ("Wonderful Sky", "2238-0", "2020-11-26 10:12:10", "2018-07-01 5:05:20")
