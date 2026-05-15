# ⚖️ Exercício 2: Calculadora de IMC

## 📝 Descrição
Cálculo do Índice de Massa Corporal (Peso / Altura²) com classificação baseada em faixas de saúde.

## 💡 Lógica Aplicada
Uso de condicionais encadeadas (`if/else if`) para categorizar o resultado do cálculo. Foram utilizados dados do tipo `double` para garantir a precisão decimal.

## 🔍 Visão de QA
* **Edge Cases:** Testes nas faixas de transição (ex: exatos 24.9 e 25.0) para validar se a classificação muda corretamente.
* **Tipagem:** Uso de `Locale.US` para aceitar ponto como separador decimal.
