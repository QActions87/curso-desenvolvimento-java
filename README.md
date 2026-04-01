# 🎯Introdução ao Java📝
![Tux e Java](https://api.devicons.dev.br/icon?icons=Linux%2CJava%2CVSCode&size=48&theme=light&perline=30)
#
### Orientação: 
Neste repo estou documentando a construção do meu conhecimento em programação com Java, com base em alguns cursos que farei e pesquisas complementares.
#
#
## Desenvolvimento Java
Aqui, temos **artigos** e **códigos fonte** a cerca de temas que estou fascinadamente aprendendo em Java. A **referência do documento** a seguir é o **Curso de Desenvolvimento Java**, da Arquiteta de Soluções Giuliana Silva Bezerra e pesquisas complementares. 
 
### Documentação:
 - **Artigo 01**: [Java — Introdução](https://medium.com/@atom.free/java-introdu%C3%A7%C3%A3o-3292761e18e8?postPublishedType=initial)

Veremos:

   - **Fundamentos**: Código Binário e Linguagem de Baixo Nível.
   - **Arquitetura**: Interpretador vs Compilador e o lema do Java (**WORA**).
   - **Ambiente**: O papel da **JDK, JRE e JVM**, além das principais IDEs.
   - **Setup Linux**: Instalação em OS baseada em Ubuntu e extensões essenciais.
   - **Projeto e Estrutura**: Como criar um projeto, organização de diretórios e pacotes.
   - **Mão na Massa**: Estrutura de um programa, **comandos nativos** (**javac, java, java**p), Método Main e **Entry Point**.
   - **Saída de Dados**: O comando println e gerenciamento de arquivos.

     - **Código 01**: [Main.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/olamundo/Main.java)


#
#
 - **Artigo 02:** [JAVA: A importância da precisão nos dados](https://medium.com/@atom.free/java-02-f31f913b46c9?postPublishedType=repub)

Veremos:

 - **Tipos Primitivos**: Entender o “tamanho” de cada **recipiente de dado** (**byte, int, long, float, double**). 

 - **Casting de Tipos** (A arte da conversão):

 - **Widening (Implícito)**: Quando o Java promove um tipo menor para um maior sem riscos. É o “cabe com folga”.
 - **Narrowing (Explícito)**: Aqui entra a responsabilidade do desenvolvedor. Para “espremer” um dado maior em um menor, o Java exige o casting manual. Como QA, aprendi que aqui mora o perigo da perda de precisão (truncamento)!
   
 - O desafio da **Divisão de Inteiros**: Um dos maiores aprendizados foi entender por que 9 / 2 resulta em 4.0 e não 4.5, mesmo salvando em um float. A ordem dos fatores e o momento do casting mudam tudo. Para um QA que trabalha com cálculos financeiros ou automação de performance, esse detalhe é a diferença entre um teste aprovado e um erro de cálculo crítico.

     - **Código 01**: [TiposPrimitivos.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/tiposprimitivos/TiposPrimitivosNotasEstudos.java)
     
     - **Código 02**: [Variáveis.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/variaveis/VariaveisNotasEstudo.java)
     
     - **Código 03**: [Casting.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/casting/CastingNotasEstudos.java)

     
#
#
 - **Artigo 03:** [JAVA — Entrada e Saída de dados](https://medium.com/@atom.free/java-entrada-e-sa%C3%ADda-de-dados-cf46ff7f7479?postPublishedType=initial)

Veremos:

   - Classe Scanner, seu import, o argumento [Sytem.in] e o encerramento do recurso com [**scanner.close()**].
   - Métodos de captura [**nextInt(…)**], [**nextLine(…)**] e [**next(…)**].
   - Método [**printf(…)**] e os **especificadores de formato**.
   - O Tipo de Dado de referência [**String**].
   - [**String Pool**] que é a forma inteligente que o Java lida com duas variáveis string com o mesmo conteúdo.
   
     - **Código 01**: [IoNotasEstudos.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/io/IoNotasEstudos.java)
       
     - **Código 02**: [StringNotasEstudo.java](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/src/string/StringNotasEstudo.java)


#
#
## Exercícios:
    
   - **Código 01**: [**Média Aritmética**](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/media/MediaAritmetica.java)
      - **Função**: Programa que captura 3 notas digitadas pelo usuário, **efetua a soma**, depois **calcula a média aritmética e a imprime.

   - **Código 02**: [**Conversão de Anos em Dias**](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/idade/DiasDeIdade.java)
      - **Função**: Captura a **idade do usuário digitada em anos**, depois **converte para dias** e imprime.

   - **Código 03**: [**Tabuada**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/tabuada/Tabuada.java)
      - **Função**: **Capturar o input numérico inteiro** que o usuário digitar, **tendo como output** a **tabuado até o 10** do número digitado. 

   - **Código 04**: [**Operadores Relacionais**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/oprelacional/RelacionamentosDeOrdem.java)
     - **Função**: Este programa permite que o usuário faça o **input de 2 números inteiro**,para que eles sejam **comparados pelos operadores lógicos relacionais**.

   - **Código 05**: [**Programa Cálculo de Desconto**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/desconto/PrecoComDesconto.java)
     - **Função**:  Este programa **lê o valor do produto** e o **desconto em porcentagem**, ambos imputados pelo usuário. Depois, calcula o valor do desconto na compra à vista  do produto, **informando o valor com desconto e o valor economizado**.

   - **Código 06**: [**Cálculo de estoque médio**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estoque/EstoqueMedio.java)
     - **Função**: Programa que **calcula o estoque médio** de um produto, com base no estoque mínimo e no máximo.

   - **Código 07**: [**Conversor de Dólares em Reais**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/conversor/ConverosrDolarReal.java)
     - **Função**: Este programa **converte valores de Dólares para Reais**.

  - **Código 08**: [**Saudação ao Usuário**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/console/SaudacaoConsole.java)
     - **Função**: Usando a classe Console ao invés da Scanner, o programa lê o nome do usuário, informado em um input, depois, concatena isso com uma saudação, imprimindo na tela.

  - **Código 09**: [**IF: Checador de Idade**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/ChecadorDeIdade.java)
     - **Função**: Entrando em **Estruturas de Decisão**, esse é o 1º código, no qual uso a **estrutura if** para **verificar se o usuário tem 18 anos ou mais**, para que possa conseguir comprar um ingresso para um evento.


Loading...

















