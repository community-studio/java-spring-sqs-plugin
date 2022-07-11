# Visão Geral

O **java-spring-sqs-plugin** adiciona em uma stack a capacidade de provisionar o uso da Amazon Simple Queue Service (SQS) seja consumindo ou produzindo mensagens na fila.

# Uso

#### **Pré-requisitos**
Para utilizar esse plugin é necessário ter uma stack dotnet criada pelo `CLI` do `StackSpot` que você pode baixar [**aqui**](https://stackspot.com/).

Ter instalado:
- Java 11 ou superior; 

#### **Inputs**

Os inputs necessários para a utilização do plugin são:
| **Campo** | **Valor** | **Descrição** |
| :--- | :--- | :--- |
| sqs_version | default: 2.16.18 | Versão da biblioteca software.amazon.awssdk:sqs |
| pacote_configuracao_sqs | ex.: br.com.org.projeto.config | Pacote para classes de configuração |
