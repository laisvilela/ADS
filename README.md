# Análise e Desenvolvimento de Sistemas
## Estrutura de Dados
### Atividade 3 - **Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido.**


#### Resposta:
Os elementos não estão na mesma ordem em que foram inseridos, pois ao retirá-los da pilha, temos sua ordem alterada removendo os itens do topo para baixo (o último a ser inserido, é o primeiro a ser retirado). Ou seja:

**Elementos na lista:** 1, 2, 3, 4, 5 **-> Ordem de remoção:** 1, 2, 3, 4, 5. 

**Elementos na pilha:** 1, 2, 3, 4, 5 **-> ordem de remoção:** 5, 4, 3, 2, 1. 

**Elementos na fila 1:** 5, 4, 3, 2, 1. 

**Elementos da lista 2:** 6, 7, 8, 9, 10 **-> ordem de remoção:** 6, 7, 8, 9, 10. 

**Elementos na pilha:** 6, 7, 8, 9, 10 **-> ordem de remoção:** 10, 9, 8, 7, 6. 

**Elementos na fila 2:** 5, 4, 3, 2, 1, 10, 9, 8, 7, 6. 
