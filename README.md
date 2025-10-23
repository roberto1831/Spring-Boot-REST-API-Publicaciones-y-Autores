# Spring-Boot-REST-API-Publicaciones-y-Autores
# 📚 API REST - Sistema de Publicaciones  
Proyecto desarrollado en **Spring Boot 3.5.0** para la gestión de autores, libros y artículos académicos.  
Permite realizar operaciones CRUD completas sobre las entidades principales, utilizando **Spring Data JPA** y **MySQL** como base de datos.

---

## 🧩 Tecnologías Utilizadas

| Componente | Versión / Tecnología |
|-------------|----------------------|
| Lenguaje | Java 21 |
| Framework principal | Spring Boot 3.5.0 |
| ORM | Spring Data JPA |
| Base de datos | MySQL |
| Dependencias adicionales | Lombok, DevTools, JUnit |
| IDE sugerido | IntelliJ IDEA / Spring Tools Suite |
| Gestor de dependencias | Apache Maven |

---

## 🏗️ Estructura del Proyecto

api-rest/
├── src/

│ ├── main/
│ │ ├── java/ec/edu/espe/publicaciones/
│ │ │ ├── controller/ → Controladores REST
│ │ │ ├── dto/ → Clases DTO para intercambio de datos
│ │ │ ├── entity/ → Entidades JPA (Autor, Libro, Articulo, Publicacion)
│ │ │ ├── repository/ → Repositorios JPA
│ │ │ ├── service/ → Lógica de negocio
│ │ │ └── PublicacionesApplication.java
│ │ └── resources/ → Configuración y recursos (static, templates, etc.)
│ └── test/ → Pruebas unitarias con JUnit
├── pom.xml → Configuración de dependencias Maven
├── HELP.md → Guía generada por Spring Boot
└── README.md → Descripción general del proyecto


---

## 🧠 Descripción General

Este proyecto implementa un **sistema de gestión de publicaciones académicas**, compuesto por autores, libros y artículos.

- Cada **Autor** puede tener múltiples **Libros** y **Artículos** asociados.
- Las entidades **Libro** y **Artículo** heredan de una clase base llamada `Publicacion`.
- Se aplica el patrón **DTO** para transferencia de datos y **ResponseDTO** para respuestas unificadas.

---

## ⚙️ Configuración de Base de Datos

Crea una base de datos en MySQL (por ejemplo, `db_publicaciones`) y configura el archivo  
`src/main/resources/application.properties` con tus credenciales:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_publicaciones
spring.datasource.username=root
spring.datasource.password=12345
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

🚀 Ejecución del Proyecto

1. Clonar el repositorio:
git clone https://github.com/tuusuario/api-rest.git

2. Acceder al directorio:
cd api-rest

3. Compilar y ejecutar con Maven Wrapper:
./mvnw spring-boot:run

4.La aplicación se iniciará por defecto en:
http://localhost:8080

📡 Endpoints Principales (AutorController)
Método	Endpoint	Descripción
POST	/autores	Crear un nuevo autor
GET	/autores/{id}	Buscar autor por ID
GET	/autores	Listar todos los autores
PUT	/autores/{id}	Actualizar autor existente
DELETE	/autores/{id}	Eliminar autor

(Se recomienda implementar controladores adicionales para libros y artículos).

🧱 Clases Principales
🧾 Entidades

Autor: Datos personales y relaciones con publicaciones.

Libro / Articulo: Extienden de Publicacion (herencia JPA).

Publicacion: Clase abstracta con atributos comunes (titulo, isbn, resumen, etc.).

💼 Servicios

AutorService: CRUD completo de autores.

LibroService: Creación de libros asociados a un autor.

📦 DTOs

AutorDTO, LibroDTO, ArticuloDTO → transferencia de datos entre capas.

ResponseDTO → formato estándar de respuesta JSON.


✅ Ejemplo de Respuesta JSON
{
  "mensaje": "Autor registrado exitosamente",
  "data": {
    "id": 1,
    "nombre": "Juan",
    "apellido": "Pérez",
    "email": "juan.perez@espe.edu.ec",
    "institucion": "ESPE",
    "nacionalidad": "Ecuatoriana"
  }
}

🧪 Pruebas Unitarias

El proyecto incluye el archivo base PublicacionesApplicationTests.java
para verificar la carga del contexto Spring.
Se pueden agregar pruebas de integración con JUnit y MockMvc.

👨‍💻 Autor del Proyecto

Roberto F. Toapanta Valencia
Ingenierío en Tecnologías de la Información
Universidad de las Fuerzas Armadas – ESPE
📧 roberto_1831@hotmail.com


