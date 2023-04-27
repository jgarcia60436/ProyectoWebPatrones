create schema madeline;
create user 'usuario_proyecto'@'%' identified by 'proyecto_clave';
grant all privileges on madeline.* to 'usuario_proyecto'@'%';
flush privileges;

create table madeline.productos(
idproducto int auto_increment,
nombreproducto varchar(60) not null, 
precio double not null,
descripcion varchar(60) not null,
cuidado varchar(60) not null,
caracteristicas varchar(60) not null,
imagen varchar(180),
primary key(`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

create table madeline.favoritos(
idproducto int not null,
idfavorito int auto_increment,
estado varchar(60) not null,
PRIMARY KEY(`idfavorito`),
FOREIGN KEY (`idproducto`) REFERENCES madeline.productos(`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

create table madeline.arreglos(
idarreglo int not null,
nombreproducto varchar(60) not null, 
precio double not null,
imagen varchar(180),
primary key (`idarreglo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

create table madeline.detalles(
iddetalle int not null,
nombreproducto varchar(60) not null, 
precio double not null,
imagen varchar(180),
primary key (`iddetalle`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

insert into madeline.productos (idproducto,nombreProducto,precio,descripcion,cuidado,caracteristicas,imagen) values
(1,'Echeveria pequeña','410.61','Suculenta comun','Agua y luz natural sin sol directo','Mide aproximadamente 5cm','http://surl.li/gqbtj'),
(2,'Echeveria','650.61','Suculenta con bordes rojos','Poca agua, buen drenaje y suelo pobre','Mide aproximadamente 5cm y tiene bordes rojos','http://surl.li/gqchr'),
(3,'Kalanchoe','790.61','Suculenta alargada','Clima calido, ','Llega a medir de media 10cm','http://surl.li/gqchz'),
(4,'Little missy','1170.61','Suculenta de grupo','Necesita fertilizante y transplantar cada 2 años','Como maximo llega a los 5cm','http://surl.li/gqcig'),
(5,'Key lime pie','820.61','Suculenta de sur africa','Amplio flujo de aire y suelo poroso','Mide entre los 2 a 5cm','http://surl.li/gqcil'),
(6,'Senecio','750.61','Suculenta de ramas','Riego moderado a poco y algo de sol directo','Posee ramificaciones','http://surl.li/gqciq'),
(7,'Aeonium','990.61','Suculenta canaria','Clima no tan calido y regar cuando este el suelo seco','Posee colores rojisos','http://surl.li/gqcit'),
(8,'Crassula','1250.61','Suculenta limpia','Toleran altas temperatuas y la falta de agua','Hojas carnosas','http://surl.li/gqciw'),
(9,'orbiculata','440.61','Suculenta comun','Luz solar directa y poco riego','Llega a medir 1,3 metros','http://surl.li/gqciz')
;

insert into madeline.arreglos(idarreglo,nombreproducto,precio,imagen) values
(1,'Minis Suculentas decoradas',340.00,'http://surl.li/gqekq'),
(2,'Minis Suculentas enraizadas',305.00,'http://surl.li/gqeqn'),
(3,'Elefantes con suculentas',340.00,'http://surl.li/gqery'),
(4,'Corazon con suculentas',340.00,'http://surl.li/gqesg')
;

insert into madeline.detalles(iddetalle,nombreproducto,precio,imagen) values
(1,'Ramo de suculentas','1340.00','http://surl.li/gqfbw'),
(2,'Regalo surtido de suculentas','1450.00','http://surl.li/gqfcn'),
(3,'Ramo de novia','1800.00','http://surl.li/gqfcz'),
(4,'Ramo de suculentas','1500.00','http://surl.li/gqfda'),
(5,'Mini ramo de suculentas','1400.00','http://surl.li/gqfdc'),
(6,'Detalle de flores y suculentas','3500.00','http://surl.li/gqfdg')
;

drop table madeline.favoritos;
drop table madeline.productos;
drop table madeline.detalles;
drop table madeline.arreglos;



select * from madeline.usuario;
select * from madeline.productos;
select * from madeline.detalles;




