# POO - Desafio Santander Bootcamp 2023
Desafio de POO realizada no Santander Bootcamp 2023

## Sobre o desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

```mermaid
classDiagram
class Iphone{
  +ligar()
  +atender()
  +iniciarCorrerioVoz()
  +exibirPagina()
  +adicionarNovaAba()
  +atualizarPagina()
  +tocar()
  +pausar()
  +selecionarMusica()
}

class NavegadornaInternet{
  <<interface>>
  +exibirPagina()
  +adicionarNovaAba() 
  +atualizarPagina()
}

class AparelhoTelefônico{
  <<interface>>
  +ligar()
  +atender()
  +iniciarCorrerioVoz()  
}

class ReprodutorMusicial{
  <<interface>>
  +tocar()
  +pausar()
  +selecionarMusica()
}

NavegadornaInternet ..|> Iphone
AparelhoTelefônico ..|> Iphone
ReprodutorMusicial ..|> Iphone
```
