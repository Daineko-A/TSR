drop table Users

create table Users (id INT AUTO_INCREMENT,
  first_name VARCHAR(40),
  last_name VARCHAR(40),
  account_name VARCHAR(40),
  PRIMARY KEY(id));

insert into Users(first_name, last_name, account_name) values ('Ivan', 'Ivanov', 'Ivanov Ivan');
insert into Users(first_name, last_name, account_name) values ('Petr', 'Petrov', 'Petrov Petr');
insert into Users(first_name, last_name, account_name) values ('Sergey', 'Sidarov', 'Sidarov Sergey');