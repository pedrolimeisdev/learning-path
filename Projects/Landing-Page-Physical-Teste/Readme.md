# Physical Test — Painel de Avaliação Física

Landing page institucional da Physical Test, apresentando as modalidades de avaliação física disponíveis na plataforma.

---

## Visão Geral

A página exibe um painel interativo com 7 categorias de avaliação. Ao clicar em cada botão, o card principal atualiza o título e a descrição correspondente via JavaScript puro — sem frameworks, sem dependências externas além da fonte.

**URL de produção:** [physicaltest.com.br](https://www.physicaltest.com.br/)

---

## Estrutura de Arquivos

```
/
├── index.html
├── css/
│   ├── base.css         # Variáveis CSS e reset global
│   ├── layout.css       # body e .main-content
│   ├── header.css       # Cabeçalho fixo e logo
│   ├── background.css   # Imagem de fundo responsiva
│   ├── card.css         # Card de informação principal
│   ├── topics.css       # Grade de botões e ícones SVG
│   └── button.css       # Botão CTA (call to action)
└── img/
    ├── logophysical-test.png
    ├── celular600-img-1.png      # Fundo para mobile (≤600px)
    ├── tablet1024-img-1.jpeg     # Fundo para tablet (601–1024px)
    └── desktop1920-img-1.jpeg    # Fundo para desktop (≥1025px)
```

---

## Arquitetura CSS

O CSS foi dividido em 7 arquivos por responsabilidade. Todos devem ser carregados no `index.html` **nesta ordem** (a ordem importa por causa do cascade):

```html
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/layout.css">
<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/background.css">
<link rel="stylesheet" href="/css/card.css">
<link rel="stylesheet" href="/css/topics.css">
<link rel="stylesheet" href="/css/button.css">
```

### Descrição de cada arquivo

| Arquivo | Responsabilidade |
|---|---|
| `base.css` | Variáveis de cor/sombra (`--accent-orange`, `--header-bg`, etc.) e reset `* { box-sizing, margin, padding }` |
| `layout.css` | Estilo do `body` (flex, fonte, background) e `.main-content` (largura máxima, margin-top) |
| `header.css` | `.main-header` fixo no topo com `z-index: 100` e `.logo-img` |
| `background.css` | `.background-container` com `position: fixed` e `z-index: -1` para ficar atrás de tudo |
| `card.css` | `.info-card` (card branco com borda laranja à esquerda) e `.card-accent-bar` (traço decorativo) |
| `topics.css` | `.topics-container`, `.topic-box`, `.box-icon-wrap` (ícone SVG) e `.box-title` — inclui estados `:hover` e `.active` |
| `button.css` | `.btn-primary` (botão CTA azul escuro que vira laranja no hover) |

### Variáveis principais (definidas em `base.css`)

| Variável | Valor | Uso |
|---|---|---|
| `--header-bg` | `#002B45` | Azul escuro — header, textos principais, CTA |
| `--accent-orange` | `#f7941d` | Laranja — destaques, borda do card, botão ativo |
| `--accent-blue` | `#007bff` | Azul — reservado para uso futuro |
| `--text-muted` | `#6b7c8d` | Cinza — textos secundários |
| `--shadow-sm` | `rgba(0,43,69,0.08)` | Sombra suave |
| `--shadow-orange` | `rgba(247,148,29,0.20)` | Sombra do botão ativo |

---

## Tipografia

A fonte utilizada é **Plus Jakarta Sans** (Google Fonts), carregada nos pesos 400, 500, 600 e 700.

```html
<link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;500;600;700&display=swap" rel="stylesheet">
```

---

## Imagens de Fundo Responsivas

A imagem de fundo usa o elemento `<picture>` para servir versões diferentes por breakpoint, economizando banda no mobile. O preload no `<head>` garante que a imagem correta comece a carregar antes do render.

| Breakpoint | Arquivo |
|---|---|
| `≤ 600px` (mobile) | `celular600-img-1.png` |
| `601px – 1024px` (tablet) | `tablet1024-img-1.jpeg` |
| `≥ 1025px` (desktop) | `desktop1920-img-1.jpeg` |

> **Atenção:** Se adicionar novas imagens de fundo, lembre de atualizar tanto o `<picture>` no HTML quanto os `<link rel="preload">` no `<head>`.

---

## JavaScript

Todo o JS está inline no final do `index.html`, dentro de uma única tag `<script>`. Não há dependências externas.

### `changeContent(title, text, clickedElement)`

Atualiza o card principal quando o usuário clica em um botão da grade.

```javascript
// O que faz:
// 1. Atualiza o texto de #main-title e #main-description
// 2. Remove a classe .active de todos os .topic-box
// 3. Adiciona .active no botão clicado
function changeContent(title, text, clickedElement) { ... }
```

### Crossfade de slides (preparado para uso futuro)

O código de crossfade está presente mas só executa se existirem elementos com a classe `.bg-slide` no HTML. Atualmente a página usa uma única imagem estática por breakpoint, então esse trecho fica inativo.

```javascript
// Para ativar: adicione elementos com class="bg-slide" no .background-container
// O primeiro deve ter class="bg-slide active"
let slides = document.querySelectorAll('.bg-slide');
```

---

## Responsividade

Os media queries ficam **dentro do próprio arquivo CSS** de cada componente (não há um arquivo `responsive.css` separado). Isso facilita encontrar e editar os estilos de um componente sem precisar abrir dois arquivos.

| Breakpoint | O que muda |
|---|---|
| `≤ 600px` | Header menor (70px), logo menor (50px), margin-top reduzida, card com padding menor, botões em 2 colunas (`calc(50% - 8px)`) |

---

## Como Rodar Localmente

O projeto é HTML/CSS/JS puro — basta abrir o `index.html` em um servidor local. Abrir direto como arquivo (`file://`) pode causar problemas com o carregamento das imagens e fontes.

Opção rápida com Node.js:
```bash
npx serve .
```

Opção com Python:
```bash
python -m http.server 8080
```

Depois acesse `http://localhost:8080`.

---

## Como Fazer Deploy

O projeto pode ser publicado em qualquer hospedagem de sites estáticos. Recomendados (gratuitos):

- **[Netlify Drop](https://app.netlify.com/drop)** — arraste a pasta do projeto e receba um link
- **[Vercel](https://vercel.com/)** — conecta ao repositório Git e faz deploy automático
- **GitHub Pages** — ative em *Settings → Pages* do repositório

> **Importante:** Sempre inclua a pasta `img/` no deploy. Sem ela, o logo e os fundos não carregarão.

---

## Adicionando um Novo Tópico

1. Copie um bloco `<button class="topic-box">` existente no `index.html`
2. Troque o ícone SVG (recomendado: [Lucide Icons](https://lucide.dev/))
3. Atualize os parâmetros do `onclick` com o novo título e descrição
4. Nenhuma alteração de CSS é necessária — o layout se adapta automaticamente

---

## Créditos e Contato

Projeto desenvolvido para **Physical Test**.  
Dúvidas sobre o código: consulte este README ou entre em contato com responsável: Pedro Henrique (pedrklimeis@gmail.com)