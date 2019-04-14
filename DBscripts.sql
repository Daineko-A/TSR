

create table users (id INT AUTO_INCREMENT,
  first_name VARCHAR(40),
  last_name VARCHAR(40),
  accountName VARCHAR(40),
  PRIMARY KEY(id));

insert into users(first_name, last_name, account_name) values ('Ivan', 'Ivanov', 'Ivanov Ivan');
insert into users(first_name, last_name, account_name) values ('Petr', 'Petrov', 'Petrov Petr');
insert into users(first_name, last_name, account_name) values ('Sergey', 'Sidarov', 'Sidarov Sergey');