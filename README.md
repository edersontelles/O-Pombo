# O Pombo

Desenvolva um sistema capaz de armazenar mensagens de texto no formato de um microblog (o Pombo)

1. Requisitos do Pombo:
1.1 Um usuário geral (nome, email e CPF) pode enviar várias mensagens (pruus)
1.2 Um usuário administrador (com todos os dados do usuário geral) pode analisar pruus e bloqueá-los
1.3 Cada pruu contém: 
- id: atributo inteiro para representar unicamente um determinado pruu
- texto: com no máximo 300 caracteres (considerando espaços) e no mínimo 1 (desconsiderando espaços). Caso o tamanho do texto seja inválido, não deixe criar o pruu (implemente essa regra na classe PrincipalPombo;
- data de criação (use java.util.Date)
- quantidade de likes
- uma indicação se ele está bloqueado ou não
- mostre no toString(): id, texto (caso não bloqueado), quantidade de likes
1.4 Cada usuário pode enviar vários pruus
1.5 Cada usuário pode ver todos os pruus de:
- qualquer usuário (mostrar todos pruus)
- um usuário selecionado (pruus apenas desse usuário)
1.6 Ao listar os pruus, o sistema deve permitir que o usuário atual dê like

2. Desenvolva:
2.1 as classes de entidades para modelar adequadamente o problema proposto (no pacote entidade)
2.2 uma classe PrincipalPombo (no pacote principal) e implemente no método main() as seguintes operações:
- cadastrar usuários (pelo menos 3, sendo um deles administrador)
- cada usuário deve enviar pelo menos 2 pruus
- mostrar todos os pruus de todos os usuários
- mostrar todos os pruus de um determinado usuário
- dar like em um determinado pruu
- administrador bloquear um determinado pruu
- visualizar o pruu bloqueado (com usuário comum)
dica: crie um método estático na classe PrincipalPombo para cada item solicitado e chame todos eles no main()
