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

## Exemplo de Saída
```
Taxpayer: John
Salary Income: 4000.00
Services Income: 3000.00
Capital Income: 1000.00
Health Spending: 2000.00
Education Spending: 1000.00
Taxable Income: 6200.00
Tax: 1020.00
```

## Como Executar
1. Compile o código Java contendo a implementação da classe `TaxPayer` e do programa principal.
2. Execute o programa, fornecendo os dados dos contribuintes quando solicitado.
3. O programa irá exibir o resumo do imposto devido para cada contribuinte.
