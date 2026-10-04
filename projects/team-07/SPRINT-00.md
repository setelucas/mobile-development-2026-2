# SPRINT 00 — Development Environment & Git Workflow

## Team Identification

- **Team:** Team 07
- **Members:**
  - Lucas dos Santos Sete Oliveira ([@setelucas](https://github.com/setelucas))
- **Submission Lead:** Lucas dos Santos Sete Oliveira

---

## 1. Environment

| Item | Valor |
| --- | --- |
| Sistema operacional | Windows 11 |
| Android Studio | [versão — Help → About] |
| Dispositivo usado | [emulador (modelo, API) ou celular físico] |
| Fork da equipe | https://github.com/setelucas/mobile-development-2026-2 |
| Branch do Sprint | `team-07/sprint-00` |
| Local do projeto | `projects/team-07/app/` |

Configuração do projeto: Empty Activity, Kotlin, Jetpack Compose, Minimum SDK API 24, Kotlin DSL.

---

## 2. Build/Run Result

- **Build:** [PASS / FAIL — descrever]
- **Execução:** [PASS / FAIL — a primeira tela abriu sem travar?]

---

## 3. Evidence

![Aplicativo rodando no emulador](evidence/sprint-00/android-running.png)

Arquivo: `evidence/sprint-00/android-running.png`

---

## 4. Problems and Solutions

| Problema | Solução |
| --- | --- |
| A entrega anterior do Sprint 00 (PR #4) continha apenas arquivos de cache e build do Gradle e o `local.properties`, sem o projeto Android, o relatório e a evidência. | [confirmar após corrigir: arquivos indevidos removidos, projeto recriado em `projects/team-07/app/`, `.gitignore` do projeto conferido] |
| [ex.: virtualização desativada na BIOS] | [ex.: SVM Mode ativado e Plataforma do Hipervisor do Windows habilitada] |

Preencha apenas o que realmente aconteceu.

---

## 5. Git Workflow Explained

| Conceito | Neste Sprint |
| --- | --- |
| Fork | Cópia do repositório do professor na conta `setelucas`. |
| Clone | Cópia do fork na máquina local, fora do OneDrive. |
| Branch | `team-07/sprint-00`, criada antes de qualquer alteração. |
| Commit | Registro de uma alteração concluída, com mensagem descritiva. |
| Push | Envio da branch do computador para o fork no GitHub. |
| Pull Request | Pedido para o professor incorporar a branch ao `main` do repositório do curso. |

---

## 6. AI Usage

| Item | Team response |
| --- | --- |
| LLM/tool used | Claude |
| Task supported by the LLM | Orientação sobre fork, clone, branch, configuração do Android Studio e estrutura do relatório |
| Main suggestion received | [descrever o que foi sugerido] |
| What the team changed manually | [descrever o que foi alterado, rejeitado ou corrigido] |
| How the result was validated | Build e execução no [dispositivo]; conferência de cada AC abaixo |

---

## 7. Acceptance Criteria

| Critério | Resultado | Observação |
| --- | --- | --- |
| AC-01 — Fork da equipe existe | PASS / FAIL | |
| AC-02 — Repositório clonado localmente | PASS / FAIL | |
| AC-03 — Branch do Sprint criada | PASS / FAIL | |
| AC-04 — Projeto Android em `projects/team-07/app/` | PASS / FAIL | |
| AC-05 — Projeto compila | PASS / FAIL | |
| AC-06 — App executa em emulador ou celular | PASS / FAIL | |
| AC-07 — Evidência de execução existe | PASS / FAIL | |
| AC-08 — Equipe sabe explicar fork, clone, branch, commit, push e PR | PASS / FAIL | |

---

## Definition of Done

- [ ] Ambiente pronto.
- [ ] App Android compila e executa.
- [ ] Evidência incluída.
- [ ] Relatório do Sprint completo.
- [ ] Pull Request submetido para revisão do professor.
