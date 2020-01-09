# Proiect MIP - Bază de date torrent
## Spring boot, Hibernate and MySQL REST

În acest proiect am făcut o aplicație folosind Spring boot, Hibernate și MySQL. Scopul aplicației este de a rula operații CRUD.

## Am folosit următoarele:

* Java 1.8
* Spring boot 2.2.2
* Hibernate 5.4.9
* MySQL 8.0
* Eclipse Oxygen
* Postman

## Urmează următorii pași:

**1. Clonează aplicația**

```bash
https://github.com/vancsaervin/proiectMip.git
```

**2. Crează o bază de date MySQL**

```sql
CREATE DATABASE crudapi
```

**3. Crează o tabelă și rulează scriptul SQL**

```sql
CREATE DATABASE crudapi;

USE crudapi;

CREATE TABLE torrents
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    size VARCHAR(255),
    upload_date DATE
);
```

**4. Setează-ți user-ul și parola**

+ deschide fișierul `src/main/resources/application.properties`.

+ adaugă `spring.datasource.username="<username-ul tau>"` și `spring.datasource.password="<parola ta>"`.

**5. Rulează aplicația**

Serverul va porni cu portul 8080.

## Rest API

Aplicația folosește următoarele API-uri CRUD.

    GET /api/torrent
    
    POST /api/torrent
    
    GET /api/torrent/{id}
    
    PUT /api/torrent
    
    DELETE /api/torrent/{id}

Le poți testa folosind Postman sau orice alt client REST.
