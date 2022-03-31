-- psql -U quarkus-demo
-- postgres=# \c quarkus-demo
create table Todo (id int8 not null, completed boolean not null, "order" int4 not null, title varchar(255), url varchar(255), primary key (id));
create sequence hibernate_sequence start 1 increment 1;
