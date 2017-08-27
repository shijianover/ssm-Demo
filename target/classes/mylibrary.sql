create table book(
	isbn varchar(20) primary key,
    bookName varchar(30),
    author varchar(30),
    publisher varchar(30),
    publishDate date,
    publishTime int,
    price int,
    typeName varchar(100),
    total int,
    available int,
    firstImg varchar(50)
);

create table user(
	uid bigint primary key auto_increment NOT NULL,
    numberId varchar(30)NOT NULL unique,
    logname varchar(30),
    pwd varchar(30),
    realName varchar(30),
    role int NOT NULL
);

create table log(
	numberId varchar(30) NOT NULL,
    isbn varchar(20)NOT NULL,
    bdate Date ,
    state int NOT NULL,
    constraint FK_numberId foreign key(numberId) references user(numberId),
    constraint FK_isbn foreign key(isbn) references book(isbn)
);
