create schema madeline;
create user 'usuario_proyecto'@'%' identified by 'proyecto_clave';
grant all privileges on madeline.* to 'usuario_proyecto'@'%';
flush privileges;

create table madeline.usuario(
 idusuario int auto_increment,
 correo varchar(30) not null, 
 conteasenna double not null,
 primary key(`idusuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

create table madeline.productos(
 idproducto int auto_increment,
 nombreProducto varchar(30) not null, 
 precio double not null,
 descripcion varchar(30) not null,
 cuidado varchar(30) not null,
 caracteristicas varchar(30) not null,
 primary key(`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;






