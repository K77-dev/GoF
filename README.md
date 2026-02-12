# Gang of Four (GoF) - Padrões de Design

Este projeto contém implementações em Java dos 23 padrões de design clássicos documentados no livro "Design Patterns: Elements of Reusable Object-Oriented Software" por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides (Gang of Four).

## 📚 Estrutura do Projeto

Os padrões estão organizados em três categorias principais:

### 🔨 Padrões Criacionais (Creational)
Lidam com a criação de objetos.

1. **Singleton** (`_01_singleton`) - Garante uma única instância de uma classe
2. **Factory Method** (`_02_factory_method`) - Define interface para criar objetos
3. **Abstract Factory** (`_03_abstract_factory`) - Cria famílias de objetos relacionados
4. **Builder** (`_04_builder`) - Constrói objetos complexos passo a passo
5. **Prototype** (`_05_prototype`) - Clona objetos existentes

### 🏗️ Padrões Estruturais (Structural)
Lidam com a composição de classes e objetos.

6. **Adapter** (`_06_adapter`) - Adapta interfaces incompatíveis
7. **Bridge** (`_07_bridge`) - Separa abstração de implementação
8. **Composite** (`_08_composite`) - Compõe objetos em estruturas de árvore
9. **Decorator** (`_09_decorator`) - Adiciona funcionalidades dinamicamente
10. **Facade** (`_10_facade`) - Simplifica interface de subsistema complexo
11. **Flyweight** (`_11_flyweight`) - Compartilha objetos para economizar memória
12. **Proxy** (`_12_proxy`) - Fornece substituto/placeholder para objetos

### 🎭 Padrões Comportamentais (Behavioral)
Lidam com comunicação entre objetos.

13. **Chain of Responsibility** (`_13_chain_of_responsibility`) - Passa requisições por cadeia de handlers
14. **Command** (`_14_command`) - Encapsula requisições como objetos
15. **Iterator** (`_15_iterator`) - Percorre elementos de coleções
16. **Mediator** (`_16_mediator`) - Encapsula interações entre objetos
17. **Memento** (`_17_memento`) - Salva e restaura estado de objetos
18. **Observer** (`_18_observer`) - Notifica múltiplos objetos sobre mudanças
19. **State** (`_19_state`) - Altera comportamento baseado em estado
20. **Strategy** (`_20_strategy`) - Define família de algoritmos intercambiáveis
21. **Template Method** (`_21_template_method`) - Define esqueleto de algoritmo
22. **Visitor** (`_22_visitor`) - Adiciona operações sem modificar classes
23. **Interpreter** (`_23_interpreter`) - Define gramática e interpretador

## 🚀 Como Executar

Cada padrão possui uma classe `App.java` que demonstra seu uso. Para executar:

```bash
# Compilar
javac src/_XX_pattern_name/*.java

# Executar exemplo
java -cp src _XX_pattern_name.App
```

Exemplo para Singleton:
```bash
javac src/_01_singleton/*.java
java -cp src _01_singleton.App
```

## 💡 Exemplos Práticos

Cada implementação usa exemplos do mundo real:

- **Singleton**: Conexão com banco de dados
- **Factory Method**: Sistema de logística com diferentes veículos
- **Abstract Factory**: Interface gráfica multi-plataforma
- **Builder**: Configuração de computador
- **Prototype**: Clonagem de formas geométricas
- **Adapter**: Player de mídia com múltiplos formatos
- **Bridge**: Controle remoto para dispositivos
- **Composite**: Sistema de arquivos
- **Decorator**: Café com complementos
- **Facade**: Inicialização de computador
- **Flyweight**: Floresta com milhares de árvores
- **Proxy**: Carregamento lazy de imagens
- **Chain of Responsibility**: Sistema de suporte técnico
- **Command**: Editor de texto com undo
- **Iterator**: Iteração sobre coleção de nomes
- **Mediator**: Sala de chat
- **Memento**: Histórico de editor
- **Observer**: Sistema de notificações
- **State**: Fluxo de publicação de documento
- **Strategy**: Métodos de pagamento
- **Template Method**: Mineração de dados
- **Visitor**: Cálculo de área de formas
- **Interpreter**: Interpretador de expressões matemáticas

## 📖 Recursos para Estudo

- [Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns)
- [Refactoring.Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [SourceMaking - Design Patterns](https://sourcemaking.com/design_patterns)

## 📝 Notas

Cada arquivo contém:
- Comentários explicativos sobre o padrão
- Exemplo prático de uso
- Código simples e didático
- Saída no console para demonstração

Este projeto foi criado com fins educacionais para facilitar o aprendizado dos padrões de design GoF.
