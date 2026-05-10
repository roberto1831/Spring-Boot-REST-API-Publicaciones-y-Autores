# 📚 API REST – Sistema de Gestión de Publicaciones Académicas

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.0-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-BC4521?style=for-the-badge)

> API REST para gestión de autores, libros y artículos académicos con **Spring Boot 3.5.0**, **Spring Data JPA** y **MySQL**. Implementa herencia JPA, patrón DTO y respuestas unificadas.

---

## 🧠 Modelo de Dominio

```
                    ┌─────────────┐
                    │    Autor    │
                    │  (id, nombre│
                    │  email...)  │
                    └──────┬──────┘
                           │ 1:N
              ┌────────────┴────────────┐
              │                         │
    ┌─────────▼──────┐       ┌──────────▼─────┐
    │     Libro      │       │    Articulo     │
    │ (isbn, titulo  │       │ (doi, titulo    │
    │  editorial...) │       │  revista...)    │
    └────────────────┘       └─────────────────┘
              │                         │
              └────────────┬────────────┘
                           │
                  ┌────────▼────────┐
                  │   Publicacion   │
                  │  (clase base    │
                  │   abstracta)    │
                  └─────────────────┘
```

- Cada **Autor** puede tener múltiples **Libros** y **Artículos**
- `Libro` y `Articulo` extienden de `Publicacion` (herencia JPA)
- Patrón **DTO** para transferencia de datos entre capas
- **ResponseDTO** para formato unificado de respuestas

---

## 🧩 Tecnologías Utilizadas

| Componente | Versión / Tecnología |
|---|---|
| Lenguaje | Java 21 |
| Framework | Spring Boot 3.5.0 |
| ORM | Spring Data JPA + Hibernate |
| Base de datos | MySQL |
| Dependencias | Lombok, DevTools, JUnit |
| Gestor | Apache Maven |
| IDE sugerido | IntelliJ IDEA / Spring Tools Suite |

---

## 📁 Estructura del Proyecto

```
src/main/java/
├── controller/
│   └── AutorController.java
├── service/
│   ├── AutorService.java
│   └── LibroService.java
├── model/
│   ├── Autor.java
│   ├── Publicacion.java       # Clase abstracta base
│   ├── Libro.java             # Extiende Publicacion
│   └── Articulo.java          # Extiende Publicacion
├── dto/
│   ├── AutorDTO.java
│   ├── LibroDTO.java
│   ├── ArticuloDTO.java
│   └── ResponseDTO.java       # Formato estándar de respuesta
└── repository/
    └── AutorRepository.java
```

---

## ⚙️ Configuración

### Base de datos

Crear base de datos en MySQL:
```sql
CREATE DATABASE db_publicaciones;
```

Configurar `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_publicaciones
spring.datasource.username=root
spring.datasource.password=TU_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

> ⚠️ Nunca subas credenciales reales al repositorio.

---

## 🚀 Ejecución

```bash
# 1. Clonar el repositorio
git clone https://github.com/roberto1831/Spring-Boot-REST-API-Publicaciones-y-Autores.git
cd Spring-Boot-REST-API-Publicaciones-y-Autores

# 2. Compilar y ejecutar
./mvnw spring-boot:run
```

> 🌐 API disponible en: **http://localhost:8080**

---

## 📡 Endpoints Disponibles

### 🔹 Autores

| Método | Endpoint | Descripción |
|---|---|---|
| POST | `/autores` | Crear nuevo autor |
| GET | `/autores` | Listar todos los autores |
| GET | `/autores/{id}` | Buscar autor por ID |
| PUT | `/autores/{id}` | Actualizar autor |
| DELETE | `/autores/{id}` | Eliminar autor |

### 🔹 Libros y Artículos
> Controladores adicionales recomendados para `/libros` y `/articulos` con operaciones CRUD completas.

---

## ✅ Formato de Respuesta (ResponseDTO)

```json
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
```

---

## 🧪 Pruebas

```bash
# Ejecutar pruebas unitarias
./mvnw test
```

- `PublicacionesApplicationTests.java` — verifica carga del contexto Spring
- Extensible con pruebas de integración usando **JUnit** y **MockMvc**

---

## 👤 Autor

**Ing. Roberto Toapanta**  
📍 Quito, Ecuador  
🔗 [GitHub](https://github.com/roberto1831) · [LinkedIn](https://linkedin.com/in/roberto1831)

---

## 📄 Licencia

Uso académico / demostrativo. No apto para producción sin revisión de seguridad.
