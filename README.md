# auth-vivelibre-client  
Test de llamada a otro servicio no incluido  

### Descarga del proyecto de GitHub  
Abrir un terminal, seleccionar un directorio y escribir:  
``` bash
git clone https://github.com/fdbozzo/auth-vivelibre-client.git
```
  
### Endpoint de la llamada  
http://localhost:8081/get-token  
  
### Verificar proyecto
``` bash
mvn verify
```
  
### Generar e Instalar artefacto
``` bash
mvn clean install
```
  
### Ejecutar jar
``` bash
java -jar target/auth-vivelibre-0.0.1-SNAPSHOT.jar
```
  
### Crear imagen docker  
``` bash
docker build --tag=fdbozzo/auth-vivelibre-client:latest .
```

### Ejecutar proyecto docker  
``` bash
docker run -p 8081:8081 fdbozzo/auto-vivelibre-client:latest
```

### Ejemplo de uso  
``` bash
curl --location --request GET 'http://localhost:8081/get-token' --header 'Content-Type: application/json'  
```  

### NOTAS  
Para funcionar requiere del container `skeet15/auth-vivelibre:latest`  
