# Proyecto Integrador - Bazar API

## Objetivo
El objetivo principal de este proyecto integrador final es validar los conocimientos prácticos y técnicos relacionados con el desarrollo de APIs en el lenguaje de programación Java mediante Spring Boot. Este proyecto forma parte del curso "Desarrollo de APIs en Java con Spring Boot" ofrecido por TodoCode Academy.

## Clases Necesarias
A partir del relevamiento realizado por un analista funcional, se identificaron las siguientes clases esenciales para el sistema:
- Producto
- Venta
- Cliente

## Requerimientos

### CRUD de Productos
1. **Métodos HTTP:** GET, POST, DELETE, PUT
2. **Endpoints:**
   - Creación: `localhost:8080/productos/crear`
   - Lista completa de productos: `localhost:8080/productos`
   - Obtener un producto específico: `localhost:8080/productos/{codigo_producto}`
   - Eliminación: `localhost:8080/productos/eliminar/{codigo_producto}`
   - Edición: `localhost:8080/productos/editar/{codigo_producto}`

### CRUD de Clientes
1. **Métodos HTTP:** GET, POST, DELETE, PUT
2. **Endpoints:**
   - Creación: `localhost:8080/clientes/crear`
   - Lista completa de clientes: `localhost:8080/clientes`
   - Obtener un cliente específico: `localhost:8080/clientes/{id_cliente}`
   - Eliminación: `localhost:8080/clientes/eliminar/{id_cliente}`
   - Edición: `localhost:8080/clientes/editar/{id_cliente}`

### CRUD de Ventas
1. **Métodos HTTP:** GET, POST, DELETE, PUT
2. **Endpoints:**
   - Creación: `localhost:8080/ventas/crear`
   - Lista completa de ventas realizadas: `localhost:8080/ventas`
   - Obtener una venta específica: `localhost:8080/ventas/{codigo_venta}`
   - Eliminación: `localhost:8080/ventas/eliminar/{codigo_venta}`
   - Edición: `localhost:8080/ventas/editar/{codigo_venta}`

## Instrucciones de Uso
1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/juanmarobles/bazar-api.git

2. **Accede al directorio del proyecto:**
   ```bash
   cd bazar-api
3. **Ejecuta la aplicación:**
   ```bash
   ./mvnw spring-boot:run
4. **Accede a los endpoints especificados para realizar operaciones CRUD en productos, clientes y ventas.**
