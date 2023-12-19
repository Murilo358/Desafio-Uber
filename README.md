# Email Microservice


- [Instalação](#Instalação)
- [Uso](#Uso)
- [Endpoints](#Endpoints)
- [Ferramentas utilizadas](#Ferramentas-utilizadas)
- [Desenvolvedor](#Desenvolvedor)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/Murilo358/Desafio-Uber.git
```

2. Instale as depêndencias

3. Coloque suas credenciais da AWS SES(Amazon Simple Email Service) em  `application.properties` 

```yaml
aws.region=us-east-1
aws.accessKeyId=SUA_CHAVE
aws.secretKey=SUA_SECRET_KEY
```
## Uso

1. Inicie a aplicação
2. A api ficará acessível em http://localhost:8080

## Endpoints
EndPoints para uso do serviço:

**GET EMAIL**
```markdown
POST /api/email/send - Envia e-mail
```

**BODY**
```json
{
  "to": "murilobarbosa358@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```

## Ferramentas-utilizadas

![JAVA](https://img.shields.io/badge/-JAVA-0D1117?style=for-the-badge&logo=openjdk&labelColor=0D1117)&nbsp;
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)

###


## Desenvolvedor

| [<img src="https://avatars.githubusercontent.com/u/111542827?v=4" width=115><br><sub>Murilo Barbosa</sub>](https://github.com/Murilo358) 

