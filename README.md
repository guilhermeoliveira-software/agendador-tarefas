# 🗓️ Agendador de Tarefas

Microserviço responsável pelo gerenciamento completo do ciclo de vida das tarefas, com **agendamento automático via Cron**, notificações por e-mail e persistência em **MongoDB**.

🔗 **API em produção:** [agendador-tarefas-production.up.railway.app](https://agendador-tarefas-production.up.railway.app)

---

## 📌 Sobre o Projeto

Este serviço é o núcleo do ecossistema de agendamento. Ele gerencia a criação, atualização e execução automática das tarefas, garantindo que notificações e lembretes sejam enviados nos momentos corretos.

| Serviço | Responsabilidade |
|---|---|
| [BFF Agendador](https://github.com/guilhermeoliveira-software/bff-agendador-tarefas) | Orquestração e gateway para o frontend |
| [Gestão de Usuários](https://github.com/guilhermeoliveira-software/usuario) | Autenticação e gerenciamento de perfis |
| **Agendador de Tarefas** (este) | Ciclo de vida e agendamento das tarefas |
| [Notificação por E-mail](https://github.com/guilhermeoliveira-software/notificacao) | Envio de e-mails e lembretes |

---

## 🚀 Funcionalidades

- Criação, atualização e remoção de tarefas
- Agendamento automático via **Cron Jobs** configuráveis
- Notificações e lembretes por e-mail integrados ao serviço de notificação
- Gerenciamento de estados das tarefas via **ENUMs**
- Arquitetura em camadas com tratamento robusto de exceções
- Análise de qualidade de código com **SonarQube**

---

## 🛠️ Tecnologias

- **Java 21**
- **Spring Boot 3**
- **Spring Security (JWT)**
- **MongoDB**
- **Docker**
- **SonarQube**
- **Maven**

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/costadev/agendador_tarefas/
            ├── business/          # Lógica de negócio e agendamento
            ├── controller/        # Endpoints REST
            └── infrastructure/    # Repositórios MongoDB e configurações
```

---

## ⚙️ Como Executar Localmente

### Pré-requisitos
- Java 21+
- Docker e Docker Compose

### Passos

```bash
# Clone o repositório
git clone https://github.com/guilhermeoliveira-software/agendador-tarefas.git
cd agendador-tarefas

# Configure as variáveis de ambiente
# Edite o application.properties com suas credenciais locais

# Suba com Docker Compose
docker-compose up --build
```

A API estará disponível em: `http://localhost:8081`

---

## 🌍 Variáveis de Ambiente

| Variável | Descrição |
|---|---|
| `MONGODB_URI` | URI de conexão com o MongoDB |
| `USUARIO_URL` | URL do serviço de usuários |

---

## 👨‍💻 Autor

**José Guilherme Da Costa Oliveira**
- 💼 [LinkedIn](https://www.linkedin.com/in/guilherme-costa-oliveiraa/)
- 🐙 [GitHub](https://github.com/guilhermeoliveira-software)
