create table test (
id int unsigned auto_increment not null,
Nombre varchar(32) not null,
Apellidos varchar(32) not null,
Email varchar(32) not null,
Telefono varchar(32) not null,
date_created timestamp default now(),
is_admin boolean,
num_points int,
primary key (id)
);