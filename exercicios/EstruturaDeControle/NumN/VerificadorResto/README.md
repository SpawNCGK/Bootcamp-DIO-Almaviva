# 🛑 Exercício 4: Loop de Interrupção por Divisibilidade

## 📝 Descrição
O programa solicita um número inicial e continua pedindo novos números até que um deles, ao ser dividido pelo inicial, resulte em um resto diferente de zero.

## 💡 Lógica Aplicada
Uso de um loop infinito `while(true)` com condições internas de controle:
- `continue`: Para ignorar números menores que o inicial.
* `break`: Para encerrar o programa quando a regra de divisibilidade é quebrada.

## 🔍 Visão de QA
* **Resiliência:** O programa não trava ao receber números menores; ele apenas os ignora conforme a regra de negócio.
* **Lógica de Interrupção:** Teste de fluxo para garantir que o encerramento ocorra exatamente no momento da divisão não exata.
