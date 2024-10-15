# Configurações para Manipulação de Usuários

## Registro de Usuários

Esta seção descreve como registrar um novo usuário na API. Para realizar a operação de criação de um usuário, envie uma
requisição POST com o corpo no formato JSON, conforme o exemplo abaixo.

    http://127.0.0.1:8080/api/user/create/user{SYNC}/pass{122}
    Requisição: POST

```json
{
  "name": "Eduardo Freitas",
  "surName": "SYNC2",
  "email": "letdowncsf@gmail.com",
  "cpf": "061.260.395",
  "telephone": "7133910114",
  "datOfBirth": "2024-10-11T14:40:08"
}
  ```

## Autenticação de usuario.
Esta seção descreve a autenticação de um usuário na API. Para realizar a autenticação, envie uma requisição POST com o corpo no formato JSON, conforme o exemplo abaixo.
    http://127.0.0.1:8080/api/login/authenticate
    Requisição: POST

```json
{
  "username": "SYNC",
  "password": "122"
}
  ```