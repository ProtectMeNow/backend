# ProtectMeNow backend

## Banco de dados

Caso não tenha o banco de dados instalado, possui um ```docker-compose.yml```, ou seja, basta rodar o seguinte comando:
```bash
docker compose up -d
```

## Documentação da API

O projeto possui o swagger para documentação dos endpoints, [click aqui](http://localhost:8080/swagger-ui/index.html) para abrir o swagger.

Caso use um API Client como o insomnia ou Postman, as configurações podem ser importadas nos seguintes formatos:

- ```json```: http://localhost:8080/api-docs
- ```yaml```: http://localhost:8080/api-docs.yaml (irá aparecer uma tela de erro, mas será feito o download do arquivo)

### Documentar os endpoint

Seguir esse [exemplo](https://github.com/ProtectMeNow/backend/blob/main/src/main/java/br/com/pulseira/sos/Pulseira/SOS/controller/UserController.java#L23), colocar a annotation ```@Operation```, passando as seguintes informações:

- ```tags```: Serve para agrupar os endpoints (Obrigatório)
- ```summary```: Descrição curta do endpoint, para fácil entendimento (Obrigatório)
- ```description```: Breve descrição, pode copiar o ```summary``` (Opcional)