# Configurações para Manipulação de Usuários

##  Registro de Usuários
Esta seção descreve como registrar um novo usuário na API. Para realizar a operação de criação de um usuário, envie uma requisição POST com o corpo no formato JSON, conforme o exemplo abaixo.

    http://127.0.0.1:8080/api/user/create
    Requisição: POST

```json
 { 
    "name": "João",
    "surName": "Silva", 
    "email": "joao.silva@example.com", 
    "cpf": "123.456.789-10", 
    "telephone": "(71) 99999-9999", 
    "datOfBirth": "1990-01-01", 
    "username": "joaosilva", 
    "password": "senhaSegura123" 
 }
  ```

