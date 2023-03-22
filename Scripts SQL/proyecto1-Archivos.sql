CREATE DATABASE proyecto1_archivos;

\c proyecto1_archivos;

CREATE SCHEMA ControlPersonal;
CREATE SCHEMA ControlVentas;
CREATE SCHEMA ControlEmpresa;

CREATE TABLE ControlEmpresa.Tienda(
    id_tienda SERIAL NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    telefono VARCHAR(8) NOT NULL,
    PRIMARY KEY (id_tienda)
);

CREATE TABLE ControlPersonal.Empleado(
    id_empleado SERIAL NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    telefono VARCHAR(8) NOT NULL,
    rol VARCHAR(20) NOT NULL,
    dpi VARCHAR(15) UNIQUE NOT NULL,
    id_tienda INT NOT NULL,
    username VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(20) NOT NULL,
    PRIMARY KEY (id_empleado),
    FOREIGN KEY (id_tienda) REFERENCES ControlEmpresa.Tienda(id_tienda)
);

CREATE TABLE ControlEmpresa.Producto(
    id_producto SERIAL NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    fabricante VARCHAR(50) NOT NULL,
    codigo VARCHAR(10) NOT NULL,
    precio DECIMAL(8,2) NOT NULL,
    cantidad INT NOT NULL,
    id_tienda INT NOT NULL,
    PRIMARY KEY (id_producto),
    FOREIGN KEY (id_tienda) REFERENCES ControlEmpresa.Tienda(id_tienda)
);

CREATE TABLE ControlPersonal.Cliente(
    nit_cliente VARCHAR(15) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    correo VARCHAR(50) NOT NULL,
    telefono VARCHAR(8) NOT NULL,
    dpi VARCHAR(15) UNIQUE NOT NULL,
    descuento INT NOT NULL,
    PRIMARY KEY (nit_cliente)
);

CREATE TABLE ControlVentas.Venta(
    id_venta SERIAL NOT NULL,
    fecha DATE NOT NULL,
    id_empleado INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    total DECIMAL(8,2) NOT NULL,
    nit_cliente VARCHAR(15) NOT NULL,
    id_tienda INT NOT NULL,
    PRIMARY KEY (id_venta),
    FOREIGN KEY (id_empleado) REFERENCES ControlPersonal.Empleado(id_empleado) ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES ControlEmpresa.Producto(id_producto),
    FOREIGN KEY (id_tienda) REFERENCES ControlEmpresa.Tienda(id_tienda),
    FOREIGN KEY (nit_cliente) REFERENCES ControlPersonal.Cliente(nit_cliente)
);

