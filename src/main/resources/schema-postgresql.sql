drop table if exists "order";
drop table if exists customer;

create table if not exists customer(
    id serial primary key,
    name varchar(255) not null
);

create table if not exists "order"  (
    id serial primary key,
    customer_id int8 not null,
    CONSTRAINT customer_fk foreign key (customer_id) references customer(id)
);