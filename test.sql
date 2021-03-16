CREATE DATABASE student;

create table student
(
    id    bigint not null
        constraint student_pkey
            primary key,
    age   integer,
    dob   date,
    email varchar(255),
    name  varchar(255)
);

create sequence student_sequence;
