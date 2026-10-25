# SPEC-001 — Tela Inicial do TapCafé

> **Team:** Team 07  
> **Sprint:** Sprint 01  
> **Status:** Draft  
> **Related Sprint:** `SPRINT-01.md`

---

## 1. Context

**Problem:**

Pessoas em pausas curtas do dia precisam de uma atividade leve que possa ser retomada em segundos. O aplicativo precisa comunicar de imediato o que é e como começar, sem tutorial.

**User / Actor:**

Jogador casual de celular, em sessões de poucos minutos.

**Usage Context:**

Ao abrir o aplicativo, o jogador vê a tela inicial, entende o nome e a proposta do jogo e encontra o botão principal para começar.

---

## 2. Objective

The objective of this feature is to apresentar a primeira tela do TapCafé, com nome, descrição e botão de ação principal organizados visualmente, servindo de base para as próximas Sprints.

---

## 3. User Scenario

**Given** que o aplicativo foi instalado e está fechado,  
**When** o jogador abre o aplicativo,  
**Then** a tela inicial exibe o nome "TapCafé", a descrição do jogo e o botão "Jogar", alinhados e sem cortes.

---

## 4. Functional Requirements

### FR-01 — Nome do aplicativo

The application must exibir o texto "TapCafé" em destaque na parte superior do conteúdo da tela.

### FR-02 — Descrição

The application must exibir uma descrição curta abaixo do nome: "Toque, prepare e expanda seu café."

### FR-03 — Botão de ação principal

The application must exibir um botão com o rótulo "Jogar", com destaque visual em relação aos demais elementos. Neste Sprint o botão não executa nenhuma ação além do feedback visual de toque.

### FR-04 — Organização visual

The application must organizar nome, descrição e botão em uma coluna centralizada, com espaçamento consistente entre os elementos, sem sobreposição ou corte em orientação retrato.

### FR-05 — Implementação com Jetpack Compose

The application must implementar a tela inicial como função `@Composable` própria, chamada a partir da `MainActivity`.

---

## 5. Constraints

### Required Technologies

- Kotlin
- Jetpack Compose (Material 3)
- Android Studio

### Project Constraints

- Minimum SDK deve permanecer API 24.
- A funcionalidade deve ser implementada dentro do projeto existente em `projects/team-07/app/`.
- Alterações restritas à pasta `projects/team-07/`.
- Nenhuma biblioteca nova pode ser adicionada.

### Files or Modules That Must Not Be Modified

- Arquivos fora de `projects/team-07/`.

---

## 6. Out of Scope

The following items are outside the scope of this specification:

- Contador de xícaras e qualquer estado alterado pelo toque (Sprint 02).
- Navegação e tela de loja (Sprint 03).
- Campos de entrada e validação (Sprint 04).
- Persistência de dados (Sprint 05).
- Notificações ou qualquer integração externa (Sprint 06).
- Imagens, animações e temas personalizados.

---

## 7. Acceptance Criteria

### AC-01 — Nome visível

**Related requirement:** FR-01

**Condition:**  
Ao abrir o app, o texto "TapCafé" está visível na tela, com tamanho de fonte maior que o da descrição.

### AC-02 — Descrição visível

**Related requirement:** FR-02

**Condition:**  
O texto "Toque, prepare e expanda seu café." está visível abaixo do nome.

### AC-03 — Botão visível e destacado

**Related requirement:** FR-03

**Condition:**  
O botão "Jogar" está visível, com fundo diferente do fundo da tela, e reage ao toque sem fechar ou travar o aplicativo.

### AC-04 — Layout organizado

**Related requirement:** FR-04

**Condition:**  
Nome, descrição e botão estão alinhados ao centro, em ordem vertical, sem sobreposição e sem texto cortado em emulador ou celular em orientação retrato.

### AC-05 — Uso de Compose

**Related requirement:** FR-05

**Condition:**  
Existe uma função `@Composable` da tela inicial, chamada pela `MainActivity`, e a tela não usa layouts XML.

### AC-06 — Compila e executa

**Related requirement:** FR-01 a FR-05

**Condition:**  
O projeto compila no Android Studio sem erros e o app abre em emulador ou dispositivo físico sem travar.

---

## 8. Requirement Traceability

| Requirement | Implemented In | Acceptance Criterion | Evidence |
| --- | --- | --- | --- |
| FR-01 | `TelaInicial.kt` → `TelaInicial()`, `Text("TapCafé")` | AC-01 | `first-screen.png` |
| FR-02 | `TelaInicial.kt` → `TelaInicial()`, `Text("Toque, prepare e expanda seu café.")` | AC-02 | `first-screen.png` |
| FR-03 | `TelaInicial.kt` → `TelaInicial()`, `Button` "Jogar" | AC-03 | `first-screen.png` |
| FR-04 | `TelaInicial.kt` → `Column`, `Spacer`, `padding` | AC-04 | `first-screen.png` |
| FR-05 | `TelaInicial.kt` (`@Composable`) e `MainActivity.kt` (`setContent`) | AC-05 | código-fonte |

Caminho dos arquivos: `projects/team-07/app/app/src/main/java/com/example/tapcafe/`.

---

## 9. Implementation Plan

### Components to Create or Modify

- `TelaInicial.kt` (novo): função `@Composable TelaInicial()`.
- `MainActivity.kt`: chamar `TelaInicial()` dentro do tema, no lugar do conteúdo padrão do template.

### Expected Interaction Flow

```text
App fechado
      ↓
Jogador abre o app
      ↓
Tela inicial é exibida
      ↓
Nome, descrição e botão "Jogar" visíveis
```

### Data or State Required

- None.

---

## 10. Validation Plan

The team must:

1. Build the project successfully.
2. Run the application on an Android Emulator or physical Android device.
3. Abrir o app e conferir nome, descrição e botão.
4. Tocar no botão "Jogar" e confirmar que o app não trava.
5. Verify every acceptance criterion.
6. Collect the required evidence.

---

## 11. Validation Results

Não marque PASS antes de testar.

| Acceptance Criterion | Result | Notes |
| --- | --- | --- |
| AC-01 | PASS / FAIL | |
| AC-02 | PASS / FAIL | |
| AC-03 | PASS / FAIL | |
| AC-04 | PASS / FAIL | |
| AC-05 | PASS / FAIL | |
| AC-06 | PASS / FAIL | |

### Environment Used for Validation

- **Device:** [emulador ou celular]
- **Android version / API:** [API XX]
- **Build result:** PASS / FAIL
- **Application execution:** PASS / FAIL

---

## 12. Evidence

Required evidence:

- `evidence/sprint-01/first-screen.png` (Primeira tela do TapCafé)

![Primeira tela do TapCafé](../../evidence/sprint-01/first-screen.png)

---

## 13. AI-Assisted Development

AI tools may be used, but the team remains responsible for the final solution.

### AI Tool(s)

- **Tool:** Claude
- **Model/version, if known:** [optional]

### How AI Was Used

- [x] Refining the specification
- [ ] Understanding the requirement
- [ ] Generating implementation suggestions
- [ ] Explaining code
- [ ] Debugging
- [ ] Refactoring
- [ ] Generating test ideas
- [ ] Reviewing acceptance criteria
- [ ] Other: [describe]

*(marque somente o que realmente se aplica)*

### Prompt or Request Summary

[Briefly describe what was asked.]

### AI-Generated or Suggested Content

[Describe what the AI suggested or generated.]

### Human Review and Changes

[Describe the team's review and modifications: o que foi aceito, rejeitado, corrigido, adaptado e como o resultado foi verificado.]

### AI Validation

The team confirms that:

- [ ] AI-generated content was reviewed before being used.
- [ ] The team understands the submitted implementation.
- [ ] The implementation was built and executed.
- [ ] Acceptance criteria were validated manually.
- [ ] No feature outside the Sprint scope was added only because an AI tool suggested it.

---

## 14. Suggested Prompt for AI Assistance

```text
I am developing an Android application using Kotlin and Jetpack Compose.

Current Sprint:
SPRINT-01 — Product Definition & First Screen

Feature specification:
[PASTE THE RELEVANT PART OF THIS SPEC]

Current implementation:
[PASTE ONLY THE RELEVANT CODE OR DESCRIBE THE CURRENT STRUCTURE]

Task:
[DESCRIBE ONE SPECIFIC TASK]

Constraints:
[PASTE THE RELEVANT CONSTRAINTS]

Out of scope:
[PASTE THE OUT-OF-SCOPE ITEMS]

Please:
1. explain the proposed solution before providing code;
2. implement only what is necessary for this specification;
3. identify which functional requirement each change addresses;
4. explain unfamiliar Compose/Kotlin concepts;
5. describe how I can validate each acceptance criterion;
6. do not add features outside the current Sprint.
```

---

## 15. Deliverables

The following artifacts must be included in the team's Sprint submission:

- [ ] Updated Android application
- [ ] This completed specification
- [ ] Updated `SPRINT-01.md`
- [ ] Required validation evidence: `evidence/sprint-01/first-screen.png`
- [ ] Any additional artifact required by the Sprint instructions

---

## 16. Specification Status

- [ ] Context and objective are clear.
- [ ] Functional requirements are complete.
- [ ] Constraints are documented.
- [ ] Out-of-scope items are documented.
- [ ] Acceptance criteria are measurable.
- [ ] Requirement traceability is complete.
- [ ] Implementation satisfies the specification.
- [ ] Validation results are documented.
- [ ] Evidence is included.
- [ ] AI usage is documented when applicable.
- [ ] Every team member can explain the implemented feature.

---

## Final Check

Before submitting the Sprint, the team should be able to answer:

> **Which requirement does this code implement, where is it implemented, and what evidence proves that the requirement was satisfied?**
