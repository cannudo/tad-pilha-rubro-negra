# tad-pilha-rubro-negra

Projeto que implementa uma estrutura de dados chamada "pilha", com adaptações coloridas para os métodos tradicionais dessa estrutura.

## Notas da versão

Eu colocaria a completude da primeira pilha (pilha rubro) como *primera "grande versão"* do projeto. Talvez eu tenha me sabotado quando me conformei que a implementação do *outro lado* (pilha negra) seria um desafio impossível para mim.

Embora tenha me acovardado naquele momento, sabia que eu precisaria implementar o restante do que foi proposto na atividade se quisesse ser aprovado na disciplina.

> Aceitei metade da nota.

A partir dessa versão, a tentativa passou a ser implementar três classes: **pilha rubro**, **pilha negra** e **pilha rubro-negra**.

### Pilha rubro
Uma pilha *tradicional*, com métodos baseados em inserções de array com índices incrementáveis em **uma unidade**, duplicando a capacidade toda vez em que era detectado que a pilha estava cheia e que não caberia mais dados no array onde se *empilha*.

### Pilha negra
A inversão lógica da pilha rubro, com lineariedade de índices invertida (enquanto na pilha rubro a lineariedade é de `0` até `N`, na pilha negra é de `N` até `0`).

### Pilha rubro-negra
Uma pilha que herdaria as duas pilhas anteriores, e faria as inserções no array com ambas as .lineariedades

---

Porém, já havia notado que os arrays ficariam dentro das pilhas, de forma que se uma terceira classe herdasse as duas anteriores, haveria uma estrutura individual para cada uma **mais** um array individual para a terceira pilha.

> Nesse caminho, a dificuldade de implementação seria multiplicada por três.

Então, assumi que o array da terceira pilha deveria ser implementado fora dessas classes.

Não fiz questão de refletir sobre a complexidade naquele momento. Antes disso, eu queria apenas criar o inverso da pilha rubro.

> Foi sofrido, porque eu tenho bastante dificuldade com Matemática e pensar como funcionaria uma lineariedade de N até 0 foi muito complexo pra mim (*risos*).

Mas antes que eu conseguisse terminar a pilha negra, meu amigo [@HilquiasAbias](http://github.com/HilquiasAbias/) me questionou sobre como exatamente eu planejava fazer com que uma classe manipulasse um array externo.

Em nossa discussão, chegamos a cogitar passar a referência do array como parâmetro de funções e retornar referências para outros arrays. Mas isso seria desperdício desnecessário de processamento, porque os arrays de saída seriam apenas levemente diferentes dos arrays de entrada.

Além do mais, o professor da disciplina me alertou sobre o risco desta abordagem, uma vez que utilizar um array fora da classe o expõe a métodos que podem ser implementados também fora da classe.

Deixei de lado, então, a ideia da terceira pilha que herdava a primeira e a segunda. Agora, focaria em fazer com que a terceira classe funcionasse com as duas lineariedades sobre o mesmo array.

Terminadas as duas pilhas, imaginei que o desafio de iimplementação da terceira pilha seria nulo, afinal, bastava copiar todos os métodos das pilhas existentes.

> Mas não foi.

Entrou em cena o lápis, o papel, os vários desenhos, o debbuger e até o ChatGPT. Tive muita dificuldade para saber quais valores deveriam ser atribuidos aos *top indexes* após a chamada da função `duplicarTamanho()` e constantemente ela entrava em loop infinito.

Demorou um pouco até eu perceber que poderia preencher o array duplicado com as funções *pushes* já existentes. Elas faziam perfeitamente a gerência desses valores, de forma que eu poderia suprimir minhas dificuldades matemáticas.

Além do mais, se o array não pode ficar fora das classes para que nenhum método de fora o manipule diretamente, qual seria o sentido de fazer inserções diretas sem utilizar os pushes já implementados?

## O que é pilha

A pilha é a estrutura de dados mais simples que existe. Nela, os dados ficam empilhados — um em cima do outro.

O último dado inserido deve ser o primeiro a ser removido.

A pilha tem um tamanho, que é a contagem de dados empilhados.

## Execução local

Para executar o projeto localmente, precisaremos __compilar__ os códigos-fonte e __rodar__ os arquivos gerados pela compilação.
Os comandos abaixo foram executados em uma máquina que utiliza Debian GNU/Linux.

```terminal
# Compilação
@cannudo ➜ /workspaces/tad-pilha (main) $ javac *.java
```

> O comando `javac` executa a compilação dos arquivos com extensão `.java` e gera os arquivos compilados com extensão `.class`. Para executar os arquivos `.class`, precisaremos utilizar o comando `java`.

```terminal
# Execução
@cannudo ➜ /workspaces/tad-pilha (main) $ java Main
```