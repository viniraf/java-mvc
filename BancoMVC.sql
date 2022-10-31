drop database if exists mvc;
create database if not exists mvc;
use mvc;

create table cliente (
codCliente int primary key auto_increment not null,
nome varchar(50),
CPF varchar(14),
email varchar(30),
endereco varchar(50),
dtNascimento Date
);

create table filme (
codFilme int primary key auto_increment not null,
titulo varchar(20),
genero varchar(50),
sinopse varchar(50),
duracao int
);

create table ator (
codAtor int primary key auto_increment not null,
nome varchar(30),
nacionalidade varchar(20)
);

create table filme_ator (
codFilme int not null,
codAtor int not null,
primary key (codFilme, codAtor),
foreign key (codFilme) references filme (codFilme),
foreign key (codAtor) references ator (codAtor));

create table item (
codItem int primary key auto_increment not null,
codFilme int,
codCliente int,
preco float,
tipo varchar(20),
dataLocacao date,
dataDevolucao date,
foreign key (codFilme) references filme (codFilme),
foreign key (codCliente) references cliente (codCliente));