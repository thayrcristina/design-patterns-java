
# Week 01 - Sistema de Notificações 📢

Este é um **exemplo prático da semana 1** do meu estudo de [Design Patterns em Java 17](https://github.com/thayrcristina/design-patterns-java).

---

## 🎯 Objetivo

✅ Praticar fundamentos de Programação Orientada a Objetos:

- ✅ Encapsulamento
- ✅ Polimorfismo via Interfaces
- ✅ Composição sobre Herança
- ✅ Princípio da Responsabilidade Única (SRP)
- ✅ Aberto/Fechado (OCP)
- ✅ Uso de `final` para imutabilidade de dependências
- ✅ Preparação para Strategy Pattern

---

## 💻 Descrição do Sistema

Um **sistema de notificações genérico**, que permite enviar mensagens via diferentes canais:

- Email
- SMS
- Push Notification

Cada tipo de notificação implementa uma interface comum `Notification`.  
O serviço `NotificationService` usa **composição** para enviar as mensagens, sem precisar conhecer detalhes da implementação.

---

## 🗂️ Estrutura de Pastas

```plaintext
br.com.thayna.designpatterns.fundamentals.notifications
├── Notification.java               (interface)
├── EmailNotification.java          (implementação)
├── SMSNotification.java            (implementação)
├── PushNotification.java           (implementação)
├── NotificationService.java        (serviço com composição)
└── NotificationMain.java           (classe para execução)
```

---

## 🚀 Como executar

1️⃣ Compile e execute `NotificationMain.java`

Exemplo (via IntelliJ ou terminal):

```bash
./mvnw compile
./mvnw exec:java -Dexec.mainClass="br.com.thayna.designpatterns.fundamentals.notifications.NotificationMain"
```

---

## 📝 Pontos de aprendizado

- **Interfaces** para abstrair comportamento
- **Encapsulamento**: cada tipo de notificação tem sua lógica isolada
- **Composição**: `NotificationService` recebe a dependência no construtor
- **`final` vs sem `final`**: prática com campos imutáveis
- **Aberto/Fechado (OCP)**: adicionar um novo tipo de notificação não exige alteração do serviço

---

## 🚧 Possíveis melhorias (exercícios)

- Implementar `SlackNotification` usando **Record** do Java 17
- Adicionar um **Factory** para instanciar notificações (preparação para Factory Method Pattern)
- Aplicar **Strategy Pattern** para troca dinâmica de notificação
- Criar testes com **JUnit 5**

---

## 📚 Referências

- [Effective Java (Joshua Bloch)](https://www.oreilly.com/library/view/effective-java-3rd/9780134686097/)
- [Refactoring.guru - SOLID Principles](https://refactoring.guru/design-patterns/solid-principles)
- [Refactoring.guru - Strategy Pattern](https://refactoring.guru/design-patterns/strategy)

---

_Projeto criado por **Thayná Rodrigues** como parte do estudo pessoal de Design Patterns em Java 17._ 🚀
