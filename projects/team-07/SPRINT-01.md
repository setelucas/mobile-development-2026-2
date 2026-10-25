# SPRINT 01 — Product Definition & First Screen

**Deadline:** 14/09/2026  
**Purpose:** transform an app idea into a defined product, write the first formal specification, and implement the first screen with Jetpack Compose.

## Team Information

- **Team:** Team 07
- **Project:** TapCafé
- **Members:**
  - Lucas dos Santos Sete Oliveira ([@setelucas](https://github.com/setelucas))

## Sprint Report

### Product Definition

### Product Name

**TapCafé**

### Problem

Pessoas que procuram uma pausa curta ao longo do dia (intervalos de estudo ou trabalho, filas, deslocamentos) muitas vezes não têm uma atividade leve que possa ser retomada em poucos segundos, sem tutorial extenso e com sensação clara de progresso. Jogos móveis convencionais costumam exigir sessões longas, cadastro ou aprendizado de muitas regras, o que os torna pouco adequados a pausas de poucos minutos.

### Target Users

Jovens e adultos que jogam casualmente no celular em pausas curtas do dia e que não precisam de experiência prévia com jogos incrementais ("clickers"). O uso esperado é em sessões de poucos minutos, com uma mão e sem instruções.

### Product Goal

Oferecer um jogo incremental simples no qual cada toque na tela produz progresso visível (xícaras de café preparadas) e o progresso acumulado pode ser trocado por melhorias, de modo que o jogador perceba evolução mesmo em sessões muito curtas.

### Initial Features

As funcionalidades abaixo são o plano do produto. Cada uma será implementada somente no Sprint indicado, conforme a SPEC daquele Sprint.

| Feature | Sprint previsto |
| --- | --- |
| Tela inicial com nome, descrição e botão de ação | 01 (este Sprint) |
| Contador de xícaras que aumenta a cada toque | 02 |
| Tela de loja de melhorias, com navegação de ida e volta | 03 |
| Apelido do jogador com validação de entrada | 04 |
| Salvamento local do progresso e das melhorias | 05 |
| Notificação de lembrete, com tratamento de permissão negada | 06 |
| Revisão final, README e evidências | 07 |

### Sprint Scope

**Dentro do escopo:** definição do produto, `SPEC-001` e implementação da primeira tela com Jetpack Compose (nome, descrição, botão de ação principal, organização visual).

**Fora do escopo:** contador, qualquer estado que mude com o toque, navegação, loja, formulários, persistência e integrações. O botão principal aparece na tela, mas não executa ação neste Sprint.

### First Screen

| Elemento visível | Requisito | Onde no código | Critério de aceitação |
| --- | --- | --- | --- |
| Nome "TapCafé" | FR-01 | `TelaInicial.kt` → `TelaInicial()`, primeiro `Text` | AC-01 |
| Descrição/slogan | FR-02 | `TelaInicial.kt` → `TelaInicial()`, segundo `Text` | AC-02 |
| Botão "Jogar" | FR-03 | `TelaInicial.kt` → `TelaInicial()`, `Button` | AC-03 |
| Organização e espaçamento | FR-04 | `TelaInicial.kt` → `Column`, `Spacer`, `padding` | AC-04 |
| Uso de Compose, chamada pela Activity | FR-05 | `MainActivity.kt` → `setContent { TelaInicial() }` | AC-05 |

Código: `projects/team-07/app/app/src/main/java/com/example/tapcafe/` (`TelaInicial.kt` e `MainActivity.kt`).

Especificação completa: [`docs/specs/SPEC-001.md`](docs/specs/SPEC-001.md).

### Validation Results

Preencha esta tabela somente depois de compilar, executar e conferir cada critério no dispositivo.

| Critério | Resultado | Observação |
| --- | --- | --- |
| AC-01 — Produto, problema, usuários e objetivo documentados | PASS / FAIL | |
| AC-02 — `SPEC-001.md` existe | PASS / FAIL | |
| AC-03 — SPEC tem FRs e ACs mensuráveis | PASS / FAIL | |
| AC-04 — Primeira tela usa Jetpack Compose | PASS / FAIL | |
| AC-05 — Nome do app visível | PASS / FAIL | |
| AC-06 — Descrição/slogan visível | PASS / FAIL | |
| AC-07 — Botão de ação principal visível | PASS / FAIL | |
| AC-08 — App compila | PASS / FAIL | |
| AC-09 — App executa sem travar | PASS / FAIL | |
| AC-10 — Implementação satisfaz a SPEC-001 | PASS / FAIL | |
| AC-11 — Equipe sabe explicar a implementação | PASS / FAIL | |

**Ambiente de validação**

- **Dispositivo:** [emulador/modelo físico]
- **Android / API:** [API XX]
- **Android Studio:** [versão]

### Evidence

![Primeira tela do TapCafé](evidence/sprint-01/first-screen.png)

Arquivo: `evidence/sprint-01/first-screen.png`

### Known Limitations

- O botão "Jogar" ainda não executa nenhuma ação (previsto para os Sprints 02 e 03).
- [outras limitações encontradas]

## Learning Goals

- problem, target users, and product goal;
- functional requirements (FR);
- acceptance criteria (AC);
- Sprint scope and out-of-scope decisions;
- basic Jetpack Compose;
- workflow: **SPEC → BUILD → VALIDATE → EXPLAIN → COMMIT**.

## Required Structure

```text
projects/team-07/
├── app/
├── SPRINT-01.md
├── docs/specs/SPEC-001.md
└── evidence/sprint-01/first-screen.png
```

## Step-by-Step

### 1. Define the Product

In `SPRINT-01.md`, document:

```text
Product Name
Problem
Target Users
Product Goal
Initial Features
```

A problem must express a user need, not only a domain.

Weak: `We will create a gym app.`  
Better: `People beginning a fitness routine may have difficulty organizing and tracking simple workouts consistently.`

### 2. Create SPEC-001

Create `projects/team-07/docs/specs/SPEC-001.md` using `templates/SPEC-TEMPLATE.md`.

It must contain context, task, functional requirements, constraints, measurable acceptance criteria, validation procedure, and out-of-scope items.

### 3. Define the First Screen

It must contain at least:

- application name;
- one description or slogan;
- one primary action button;
- visually organized content;
- spacing and alignment.

Navigation is not required yet.

### 4. Implement with Jetpack Compose

Use, when appropriate:

```text
@Composable
Text
Button
Column
Row
Spacer
Modifier
padding
fillMaxSize
Arrangement
Alignment
MaterialTheme
```

### 5. Build, Run, and Validate

1. Build the app.
2. Run on emulator or physical device.
3. Compare the visible result with SPEC-001.
4. Check every acceptance criterion.
5. Fix discrepancies before submission.

### 6. Add Evidence

Save `projects/team-07/evidence/sprint-01/first-screen.png` and reference it from `SPRINT-01.md`.

### 7. Explain the Implementation

The team must be able to show which requirement is represented by each visible UI element, where it appears in code, and how its acceptance criterion was validated.

## Rules for Using an LLM

LLM-assisted tools are allowed in this Sprint, but the team remains responsible for every submitted line of code and documentation.

Use an LLM to **support** the development process, not to replace it. Recommended workflow:

1. provide the current SPEC and only the smallest relevant code excerpt;
2. describe the exact problem or change;
3. ask for an explanation before accepting code;
4. request the minimum change needed;
5. review the suggestion manually;
6. run the app and validate the acceptance criteria;
7. keep only code the team can explain and modify without the LLM.

Generic prompt:

```text
We are developing an Android application with Kotlin and Jetpack Compose.
Current Sprint: SPRINT-YY.
Current requirement: [paste the relevant FR/AC from the SPEC].
Current code/context: [paste only the relevant excerpt].

Help us implement or review this requirement.
1. Explain the concept first.
2. Propose the smallest change that satisfies the requirement.
3. Explain every relevant part of the suggested code.
4. Identify possible errors or edge cases.
5. Tell us how to validate the result in Android Studio.
Do not add functionality outside the current Sprint scope.
```

Complete this table in the Sprint report:

| Item | Team response |
| --- | --- |
| LLM/tool used | Claude |
| Task supported by the LLM | Refinar a definição do produto e estruturar `SPRINT-01.md` e `SPEC-001.md` a partir do template |
| Main suggestion received | [descrever o que foi sugerido] |
| What the team changed manually | [descrever o que foi alterado, rejeitado ou corrigido] |
| How the result was validated | Build e execução no [dispositivo]; conferência de cada AC contra a SPEC-001 |

Do not submit code that no team member can explain. During review, any member may be asked to locate a requirement in the code, explain a function, justify a decision, or make a small modification.

### Suggested LLM Uses

Use the LLM to improve a problem statement, review FRs/ACs, explain Compose components, review a small Composable, or diagnose a real build error. Do not ask it to build the entire app at once.

## Acceptance Criteria

- AC-01 — Product name, problem, target users, and goal are documented.
- AC-02 — `SPEC-001.md` exists.
- AC-03 — SPEC contains functional requirements and measurable ACs.
- AC-04 — First screen uses Jetpack Compose.
- AC-05 — App name is visible.
- AC-06 — Description/slogan is visible.
- AC-07 — Primary action button is visible.
- AC-08 — App builds successfully.
- AC-09 — App runs without crashing.
- AC-10 — Implementation satisfies SPEC-001.
- AC-11 — Team can explain the implementation.

## Deliverables

```text
projects/team-07/app/
projects/team-07/SPRINT-01.md
projects/team-07/docs/specs/SPEC-001.md
projects/team-07/evidence/sprint-01/first-screen.png
```

## Submission Rules

### Repository Location

All work must remain inside:

```text
projects/team-07/
```

Never modify another team's folder.

### Branch

Synchronize the fork with the current course `main`, then create the branch **before** starting the Sprint work:

```text
team-07/sprint-01
```

Example for Team 03:

```text
team-03/sprint-01
```

### Commits

Use small, meaningful commits. Recommended pattern:

```text
docs: define SPEC-001
feat: implement <feature>
fix: correct <problem>
docs: add Sprint 01 validation evidence
```

Avoid messages such as `update`, `changes`, `final`, `work`, or `commit 1`.

### Pull Request

Push/publish the Sprint branch to the team's fork and open **one Pull Request** to the course repository.

```text
base repository: brenofeliix/mobile-development-2026-2
base branch: main
compare branch: team-07/sprint-01
```

PR title:

```text
[Sprint 01] Team 07 — Product Definition & First Screen
```

PR description:

```md
## Sprint
SPRINT 01 — Product Definition & First Screen

## Summary
Briefly describe what was implemented.

## Specification
Link SPEC-001.

## Validation
- [ ] Application builds successfully.
- [ ] Application runs successfully.
- [ ] Acceptance criteria were validated.
- [ ] Evidence was added.
- [ ] Team members can explain the implementation.

## AI Usage
Briefly summarize how an LLM was used and how its suggestions were validated.
```

Students **must not merge their own PR** into the course repository. The instructor reviews and merges accepted submissions.

If changes are requested, continue on the **same branch**. Commit and push the corrections; the existing PR updates automatically. Do not open a second PR for the same Sprint unless the instructor explicitly requests it.

## Definition of Done

- [ ] Product concept documented.
- [ ] SPEC-001 complete.
- [ ] First screen implemented.
- [ ] Build/run validated.
- [ ] Evidence included.
- [ ] AI usage documented.
- [ ] PR submitted.
