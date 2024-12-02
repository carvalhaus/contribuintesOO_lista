# contribuintesOO_lista

## Objetivo
Criar um programa em Java que calcule o imposto de renda devido por um conjunto de contribuintes, seguindo as regras de tributação do país.

## Regras de Tributação
1. Imposto sobre salário:
   - Abaixo de R$ 3.000 por mês: Isento
   - De R$ 3.000 até R$ 5.000 (exclusive): 10%
   - R$ 5.000 ou acima: 20%

2. Imposto sobre renda de serviços: 15%

3. Imposto sobre ganho de capital: 20%

4. Abatimento de até 30% do imposto bruto com gastos médicos e educacionais.
   - Caso os gastos médicos e educacionais sejam inferiores a 30%, apenas os gastos reais podem ser abatidos.

## Estrutura do Projeto
O projeto utiliza uma classe `TaxPayer` para representar cada contribuinte, com os seguintes atributos:
- `salaryIncome`: renda salarial
- `servicesIncome`: renda com prestação de serviços
- `capitalIncome`: renda com ganho de capital
- `healthSpending`: gastos médicos
- `educationSpending`: gastos educacionais

O programa deve ler os dados de N contribuintes, armazenar em uma lista `List<TaxPayer>` e, para cada contribuinte, exibir um resumo do imposto devido.

## Exemplo de Entrada
```
Quantos contribuintes você vai digitar? 2

Digite os dados do 1o contribuinte:
Renda anual com salário: 48000.00
Renda anual com prestação de serviço: 0.00
Renda anual com ganho de capital: 800.00
Gastos médicos: 400.00
Gastos educacionais: 5400.00

Digite os dados do 2o contribuinte:
Renda anual com salário: 189000.00
Renda anual com prestação de serviço: 55184.93
Renda anual com ganho de capital: 20000.00
Gastos médicos: 600.00
Gastos educacionais: 7500.00
```

## Exemplo de Saída
```
Resumo do 1o contribuinte:
Imposto bruto total: 4960.00
Abatimento: 1488.00
Imposto devido: 3472.00

Resumo do 2o contribuinte:
Imposto bruto total: 50077.74
Abatimento: 8100.00
Imposto devido: 41977.74
```
