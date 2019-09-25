
create table users (
id int unsigned auto_increment not null,
first_name varchar(32) not null,
last_name varchar(32) not null,
date_created timestamp default now(),
is_admin boolean,
num_points int,
primary key (id)
);
