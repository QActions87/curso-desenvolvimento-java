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
#

   - **Código 02**: [**Conversão de Anos em Dias**](https://github.com/Motatom0101/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/idade/DiasDeIdade.java)
      - **Função**: Captura a **idade do usuário digitada em anos**, depois **converte para dias** e imprime.
#

   - **Código 03**: [**Tabuada**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/tabuada/Tabuada.java)
      - **Função**: **Capturar o input numérico inteiro** que o usuário digitar, **tendo como output** a **tabuado até o 10** do número digitado. 
#

   - **Código 04**: [**Operadores Relacionais**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/oprelacional/RelacionamentosDeOrdem.java)
     - **Função**: Este programa permite que o usuário faça o **input de 2 números inteiro**,para que eles sejam **comparados pelos operadores lógicos relacionais**.
#

   - **Código 05**: [**Programa Cálculo de Desconto**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/desconto/PrecoComDesconto.java)
     - **Função**:  Este programa **lê o valor do produto** e o **desconto em porcentagem**, ambos imputados pelo usuário. Depois, calcula o valor do desconto na compra à vista  do produto, **informando o valor com desconto e o valor economizado**.
#

   - **Código 06**: [**Cálculo de estoque médio**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estoque/EstoqueMedio.java)
     - **Função**: Programa que **calcula o estoque médio** de um produto, com base no estoque mínimo e no máximo.
#

   - **Código 07**: [**Conversor de Dólares em Reais**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/conversor/ConverosrDolarReal.java)
     - **Função**: Este programa **converte valores de Dólares para Reais**.
#

  - **Código 08**: [**Saudação ao Usuário**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/console/SaudacaoConsole.java)
     - **Função**: Usando a classe Console ao invés da Scanner, o programa lê o nome do usuário, informado em um input, depois, concatena isso com uma saudação, imprimindo na tela.
#

  - **Código 09**: [**IF: Checador de Idade**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/ChecadorDeIdade.java)
     - **Função**: Entrando em **Estruturas de Decisão**, esse é o 1º código, no qual uso a **estrutura if** para **verificar se o usuário tem 18 anos ou mais**, para que possa conseguir comprar um ingresso para um evento. Também usaremos o **If Ternário**.
#

  - **Código 10**: [**Switch-Case: Checador de Notas**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estrutura_switch/ChecadorDeNotas.java)
     - **Função**: Esta é outra possibilidade de **Estrutura de Decisão**. Porém, o **Switch** trabalha com a ideia de **avaliar o valor de uma variável**, **não uma expressão booleano**. Este programa verificará a nota que o usuário digitar e, de acordo com a nota, terá um output com feedback específico. 
#

  - **Código 11**: [**If-Else: Checador de Aprovados**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/AprovadoReprovado.java)
     - **Função**: Através da estrutura **If-Else** e com base em parâmetro definido, o programa em questão é capaz de fazer a média aritmética e informar se, de acordo com o parâmetro definido, o aluno foi aprovado ou não. 
#

  - **Código 12**: [**If-Else: Par ou Impar?**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/ParOuImpar.java)
     - **Função**: Ainda usando da estrutura **If-Else**, agora com o **operador de módulo (%)** - que verifica o **resto da divisão** -, este programa verifica se um input inteiro feito pelo usuário é **par ou impar**.
#

  - **Código 13**: [**If-Else: Ordem Crescente**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/OrdemCrescente.java)
     - **Função**: Programa lê 3 números e os imprime em ordem crescente.
#

  - **Código 14**: [**Switch-Case: Calculadora**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/Calculadora.java)
     - **Função**: Programa lê 2 números e o operador informado pelo usuário, para efetuar o cálculo conforme operação solicitada.
#

  - **Código 15**: [**If-Else: Calculadora de IMC**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/CalculadoraIMC.java)
     - **Função**: Programa lê 2 valores: Peso e Altura, calcula o IMC e informa o resultado e a classificação em que o usuário se encontra.
#

  - **Código 16**: [**Switch-Case: Calcula Área de Figura Geométrica**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/AreaFiguraGeometrica.java)
     - **Função**: Permite que o usuário informe o tipo de figura geométrica e os parâmetros a serem calculados, para que possa informar à área.
#

  - **Código 17**: [**If-Else: Verificador de Ano Bissexto**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/exercicios-conhecendo-a-base/src/estruturas_if/AnoBissexto.java)
     - **Função**: Verifica se um ano é bissexto ou não.
#

  - **Código 18**: [**While-If-Else: Adivinhe o número**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura_repeticao/estrutura-repeticao/src/repeticao/App.java)
     - **Função**: Aqui, temos um jogo que dá 5 chances para que o usuário tente acertar um determinado número. Por isso, este será o 1º código usando a **estrutura de repetição** **'while'** com um **If-Else aninhado** nele.
#

  - **Código 19**: [**For: Cálculo de Fatorial**](https://github.com/QActions87/curso-desenvolvimento-java/blob/main/estrutura_repeticao/estrutura-repeticao/src/repeticao/ForStructure.java)
     - **Função**: Calcula **fatorial** com a estrutura de repetição '**for**'.
#



Loading...

















