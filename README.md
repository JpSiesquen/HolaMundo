# 👓 Óptica - Práctica Microservicios

Proyecto de práctica personal para el curso **Desarrollo de Aplicaciones Web 2** del instituto Cibertec.
E-commerce de una óptica desarrollado con arquitectura de microservicios y arquitectura hexagonal.

---

## 🛠️ Tecnologías utilizadas

- Java 17
- Spring Boot 3.2.x
- Spring Cloud (Eureka, Gateway, Config Server)
- Spring Security + JWT + OAuth2
- PostgreSQL
- RabbitMQ
- Feign Client
- Resilience4j (Circuit Breaker)
- Swagger / OpenAPI 3.0
- Angular (Frontend)
- Maven

---

## 🏗️ Arquitectura

Este proyecto implementa **Arquitectura Hexagonal (Puertos y Adaptadores)** dentro de cada microservicio.

```
src/
├── domain/              # Lógica de negocio (entidades, puertos)
├── application/         # Casos de uso
└── infrastructure/      # Controladores, repositorios, configuración
```

---

## 📦 Microservicios

| Microservicio       | Puerto | Descripción                          |
|---------------------|--------|--------------------------------------|
| Eureka Server       | 8761   | Registro y descubrimiento de servicios |
| Config Server       | 8888   | Configuración centralizada           |
| API Gateway         | 8080   | Punto de entrada único               |
| Auth Service        | 8081   | Autenticación y autorización (JWT)   |
| Product Service     | 8082   | Catálogo de lentes                   |
| Inventory Service   | 8083   | Control de stock                     |
| Order Service       | 8084   | Carrito de compras y órdenes         |
| Notification Service| 8085   | Notificaciones por email             |

---

## 🗄️ Base de datos

- Motor: **PostgreSQL**
- Base de datos: `practica_microservicio`
- Tablas principales: `productos`, `categorias`

---

## ▶️ Cómo correr el proyecto

### Requisitos previos
- Java 17 instalado
- PostgreSQL instalado y corriendo
- RabbitMQ instalado
- IntelliJ IDEA

### Pasos
1. Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/tu-repo.git
```
2. Crear la base de datos en PostgreSQL
```sql
CREATE DATABASE practica_microservicio;
```
3. Configurar las credenciales en `application.yml` de cada microservicio
4. Correr primero **Eureka Server**, luego **Config Server**, luego **API Gateway**
5. Correr los microservicios restantes

---

## 👨‍💻 Autor

- **Patroclo**
- Instituto: Cibertec
- Carrera: Computación e Informática
- Ciclo: 6to

---

## 📝 Notas

Este es un proyecto de práctica personal con fines académicos.
