# Sistema de Animais em Java

## Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de aplicar conceitos fundamentais da Programação Orientada a Objetos utilizando Java. A aplicação representa diferentes tipos de animais através de uma estrutura organizada em classes, permitindo o reaproveitamento de código e a especialização de comportamentos.

---

## Conceitos Aplicados

Durante o desenvolvimento foram utilizados os seguintes recursos da linguagem:

- Herança entre classes
- Encapsulamento de atributos
- Métodos abstratos
- Sobrescrita de métodos (`@Override`)
- Sobrecarga de métodos (Overload)
- Utilização de enums
- Organização em pacotes

---

## Funcionalidades

O sistema permite:

- Criar animais com características específicas;
- Exibir informações dos animais cadastrados;
- Simular ações como movimentação, sono e emissão de sons;
- Diferenciar comportamentos de cães e gatos;
- Trabalhar com valores pré-definidos através de enums.

---

## Aprendizados Obtidos

Com este projeto foi possível compreender melhor a reutilização de código por meio da herança, além da importância do encapsulamento para proteger os dados dos objetos.

Também foi possível praticar a criação de métodos personalizados para cada classe e entender como a sobrescrita permite adaptar comportamentos herdados.

---

## Organização dos Arquivos

```text
app/
 └── Main.java

enums/
 ├── FurColor.java
 ├── Habitat.java
 └── TrainingLevel.java

model/
 ├── Animal.java
 ├── Cat.java
 └── Dog.java

util/
 └── Validations.java