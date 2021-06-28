create sequence hibernate_sequence start 1 increment 1;

CREATE TABLE ArrayModel (
id int8 not null,
numArray integer[],
number integer,
primary key (id)
);