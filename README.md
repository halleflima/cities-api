<h1 align="center">
  <img alt="" src="https://i.imgur.com/y8389Qn.png" width="120px" />
</h1>

<h3 align="center">
  API rest desenvolvida em JAVA e Spring Boot
</h3>

<p align="center">Nessa aplicação utilizei recursos como geo localização e coordenadas geograficas para calcular a distancia entre cidades utilizando recursos nativos dos Postgre que contem libs para calculo de coordenadas geograficas.</p>


## 💻 Dev

- [Hallef Lima](https://github.com/halleflima)

## 🚀 Tecnologias

- ☕ Java — object-oriented programming language
- 🍃 SpringBoot — A web framework for Java
- 🐘 Gradle — Build Tool for Java

## ✋🏻 Pré-requisitos

- [Java 8](https://developers.redhat.com/products/openjdk/download?sc_cid=7013a000002pqUWAAY)
- [SpringBoot](https://spring.io/projects/spring-boot)
- [Gradle](https://gradle.org/)

## 🔥 Instalação e execução local

1. Faça um clone desse repositório;
2. Entre na pasta `cd cities.api`;
3. Abra o codigo em sua IDE e aguarde seu `Gradle` atualiar
4. Execute sua via classe `Main`

## ⚡️ Como contribuir

- Faça um fork desse repositório;
- Cria uma branch com a sua feature: `git checkout -b minha-feature`;
- Faça commit das suas alterações: `git commit -m 'feat: Minha nova feature'`;
- Faça push para a sua branch: `git push origin minha-feature`.

Depois que o merge da sua pull request for feito, você pode deletar a sua branch.

## 📝 End Points

- 🌃 Cidades
  Contem dados de cidades do Brazil que são assesiveis por end points:

    [`https://pure-mountain-15510.herokuapp.com/cities`](https://pure-mountain-15510.herokuapp.com/cities)
    `/{id}`

- 🗺 Estados
    Contem dados dos estados Braseiros que são assesiveis por end points:

    [`https://pure-mountain-15510.herokuapp.com/states`](https://pure-mountain-15510.herokuapp.com/states)
    `/{id}`

- 🌍 Paises
    Contem dados de algusn Paises que estão assesiveis por end points:

    [`https://pure-mountain-15510.herokuapp.com/contries`](https://pure-mountain-15510.herokuapp.com/contries)
    `/{id}`

- 📐Calculando a distancia entre duas cidades

    `https://pure-mountain-15510.herokuapp.com/distances/by-cube?from={id}&to={id}`

    - Tal end point trará resposta em metros.

---

Feito com 💖 by Hallef Lima 👋 [Entre em contato!](https://www.linkedin.com/in/hallef-lima-13a8b8108)