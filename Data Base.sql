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




