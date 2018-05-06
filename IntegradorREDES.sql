CREATE TABLE tb_perguntas(
id int  identity primary key,
pergunta varchar(500), 

);


CREATE TABLE tb_respota(
id int  identity primary key,
resposta varchar(500), 

);

CREATE TABLE tb_alternativa(
alternativa varchar(500),
pergunta int,
);
insert into tb_perguntas values('Quais desses personagens a seguir não pertencem ao universo de entretenimento Marvel?');
insert into tb_perguntas values('Qual é o verdadeiro nome do Demolidor?');
insert into tb_perguntas values('Mephisto pertence a qual série de quadrinhos Marvel?');
insert into tb_perguntas values('Qual é o nome do duende verde do primeiro filme do Homem-Aranha?');
insert into tb_perguntas values('Quem comanda a SHIELD?');
insert into tb_perguntas values('Em qual dia, mês, e ano o Captain America (Steve Rogers) foi morto?');
insert into tb_perguntas values('Qual dessas sagas em quadrinhos da Marvel é considerada pela propria como a maior e mais importante?');

insert into tb_respota values('Tocha Humana');
insert into tb_respota values('Matt Murdock');
insert into tb_respota values('Motoqueiro Fantasma');
insert into tb_respota values('Norman Osborn');
insert into tb_respota values('Nick Fury');
insert into tb_respota values('07 de fevereiro de 2007');
insert into tb_respota values('Guerra Civil (2006)')


insert into tb_alternativa values('Demolidor',1);
insert into tb_alternativa values('Noturno/Nightcrawler',1);
insert into tb_alternativa values('Capitao Marvel',1);
insert into tb_alternativa values('Wolverine',1);

insert into tb_alternativa values('Jhonny Blaze',2);
insert into tb_alternativa values('Reed Richards',2);
insert into tb_alternativa values('Kurt Wagner',2);
insert into tb_alternativa values('Nenhuma das Alternativas Acima',2);

insert into tb_alternativa values('Quarteto Fantastico',3);
insert into tb_alternativa values('Homem Aranha',3);
insert into tb_alternativa values('Captain América',3);
insert into tb_alternativa values('X-men',3);

insert into tb_alternativa values('Flash Tompson',4);
insert into tb_alternativa values('Eddie Brock',4);
insert into tb_alternativa values('Tio Ben',4);
insert into tb_alternativa values('Harry Osborn',4);

insert into tb_alternativa values('Iron Man',5);
insert into tb_alternativa values('Thor',5);
insert into tb_alternativa values('Captain América',5);
insert into tb_alternativa values('Reed Richards(Mr Fantastic)',5);

insert into tb_alternativa values('09 de agosto de 2006',6);
insert into tb_alternativa values('30 de Janeiro de 2008',6);
insert into tb_alternativa values('09 de Fevereiro de 2001',6);
insert into tb_alternativa values('07 de agosto de 2006',6);

insert into tb_alternativa values('Invasão Secreta (2008)',7);
insert into tb_alternativa values('Nação X (2009)',7);
insert into tb_alternativa values('Heroic Age (2010)',7);
insert into tb_alternativa values('Herois Renascem (1997)',7);









select * from tb_perguntas
select * from tb_respota;
select * from tb_alternativa;




select * from tb_perguntas 
inner join tb_respota on tb_respota.id=tb_perguntas.id
inner join tb_alternativa on tb_alternativa.pergunta=tb_perguntas.id


