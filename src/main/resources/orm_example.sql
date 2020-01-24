create table orm_user (
    id serial primary key,
    first_name varchar(30),
    last_name varchar(30)
);

create table orm_car (
    id serial primary key,
    model varchar(30),
    owner_id integer references orm_user(id)
);