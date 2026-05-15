# 🔢 Exercício 3: Contador Decrescente Par/Ímpar

## 📝 Descrição
O programa recebe um intervalo numérico e uma escolha entre "par" ou "ímpar", exibindo os números correspondentes de forma decrescente.

## 💡 Lógica Aplicada
- **Inversão de Loop:** O `for` foi configurado para iniciar no valor máximo e decrementar (`i--`) até o mínimo.
* **Módulo:** Utilização de `i % 2` para validar a paridade.

## 🔍 Visão de QA
* **Validação:** Implementação de trava de segurança: o código não inicia se o primeiro número for maior que o segundo.
* **Normalização:** Uso de `equalsIgnoreCase` para que "PAR", "par" ou "PaR" funcionem igualmente.
