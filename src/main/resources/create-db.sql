create table collar (collar_id int8 not null, collar_pet_id int8 not null, description varchar(255), primary key (collar_id, collar_pet_id));
create table pet (id int8 not null, name varchar(255), primary key (id));
alter table if exists collar add constraint pet_id_uk unique (collar_pet_id);
alter table if exists collar add constraint pet_id_fk foreign key (collar_pet_id) references pet;