CREATE DATABASE Consultorio; /* Criando o banco de dados */
use Consultorio; /* acessando o banco de dados */

drop database Consultorio;
drop table consulta;

create table Paciente(
	pk_id_paciente int auto_increment primary key,
    nome_paciente varchar(100),
	data_nasc_paciente date,
    genero_paciente enum('f', 'm', 'o'),
    endereco_paciente varchar(100),
    email_paciente varchar(50),
    telefone_paciente char(13)
);

create table Consulta(
	pk_id_consulta int auto_increment primary key,
    local_consulta varchar(100),
    data_consulta datetime(6) not null,
    descricao_consulta varchar(100)
);

create table Dentista(
	pk_id_dentista int auto_increment primary key,
    nome_dentista varchar(100),
	data_nasc_dentista date,
    genero_dentista enum('f', 'm', 'o'),
    endereco_dentista varchar(100),
    telefone_dentista char(13),
    CRO int(10)
);

describe table Paciente;
select * from Paciente;
select * from Dentista;
select * from Consulta;

insert into Paciente(
	nome_paciente,
    data_nasc_paciente,
    genero_paciente,
    endereco_paciente,
    email_paciente,
    telefone_paciente
) values 
('Jeff10 da Silva', '2022-10-01', 'm', 'Rua nove 12', 'joao2@jjoa.com', '5511958452515'); 


insert into Dentista(
	nome_dentista,
    data_nasc_dentista,
    genero_dentista,
    endereco_dentista,
    telefone_dentista,
    CRO
) values 
('Doutor Jeff', '2022-10-01', 'm', 'Rua nove 22', '5511958452515', '2254634'); 


insert into Consulta(
    local_consulta ,
    data_consulta,
    descricao_consulta
) values ('NotreDame5', '2024-10-29 12:26:00', 'limpeza');

CREATE USER 'MySQL80_3307'@'localhost' IDENTIFIED BY 'MySQL@2022';
GRANT ALL PRIVILEGES ON Consultorio.* TO 'MySQL80_3307'@'localhost';
FLUSH PRIVILEGES;
