# Configurações para Manipulação de Usuários

## Registro de Usuários

Esta seção descreve como registrar um novo usuário na API. Para realizar a operação de criação de um usuário, envie uma
requisição POST com o corpo no formato JSON, conforme o exemplo abaixo.

    http://127.0.0.1:8080/api/user/create/user
    Requisição: POST

```json
{
  "name": "Eduardo Freitas",
  "surname": "SYNC",
  "email": "Exemple@exemple.com",
  "cpf": "000.000.000-00",
  "telephone": "7133910000",
  "datOfBirth": "2024-10-11T14:40:08",
      "login":{
        "username":"SYNC",
        "password":"123"
      }
}
  ```

## Autenticação de usuário.
Esta seção descreve a autenticação de um usuário na API. Para realizar a autenticação, envie uma requisição POST com o corpo no formato JSON, conforme o exemplo abaixo.
    http://127.0.0.1:8080/api/login/authenticate
    Requisição: POST

```json
{
  "username": "SYNC",
  "password": "122"
}
  ```

## Verificar se já existe o email

Esta seção descreve a validação do e-mail de um usuário na API. Para verificar se o e-mail já está cadastrado, envie uma requisição `GET` para o seguinte endpoint, substituindo `http://127.0.0.1:8080/api/user/check/email/{email}` pelo e-mail que deseja verificar:
### Possíveis Respostas

- **Se o e-mail existir no sistema:**
  ```json
  {
      true
  }
- **Se o e-mail não estiver cadastrado:**
  ```json
  {
      false
  }

## Verificar se já existe o cpf

Esta seção descreve a validação do cpf de um usuário na API. Para verificar se o cpf já está cadastrado, envie uma requisição `GET` para o seguinte endpoint, substituindo `http://127.0.0.1:8080/api/user/check/cpf/{cpf}` pelo cpf que deseja verificar:
### Possíveis Respostas

- **Se o cpf existir no sistema:**
  ```json
  {
      true
  }
- **Se o cpf não estiver cadastrado:**
  ```json
  {
      false
  }

 ## Verificar se já existe o usuário

Esta seção descreve a validação login de um usuário na API. Para verificar se o login já está cadastrado, envie uma requisição `GET` para o seguinte endpoint, substituindo `http://127.0.0.1:8080/api/login/check/username/{username}` pelo login que deseja verificar:
### Possíveis Respostas

- **Se o cpf existir no sistema:**
  ```json
  {
      true
  }
- **Se o cpf não estiver cadastrado:**
  ```json
  {
      false
  }
  