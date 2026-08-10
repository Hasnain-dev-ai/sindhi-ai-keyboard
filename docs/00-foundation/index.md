# 🏛️ Part 00 — Foundation

> **The foundational principles, identity, governance, direction, and terminology of the Sindhi AI Keyboard project.**

## 📖 Overview

Part 00 establishes the foundation upon which the Sindhi AI Keyboard project is built.

These documents define the project's purpose, vision, mission, principles, identity, governance, operating model, roadmap, and terminology.

The Foundation is the reference point for major product, technical, security, community, and business decisions.

---

## 📚 Chapters

| Prefix | Document | Purpose |
|---|---|---|
| `000` | [Project Constitution](./000-project-constitution.md) | Defines the project's fundamental rules, boundaries, and governing principles. |
| `001` | [Vision](./001-vision.md) | Defines the long-term vision of the project. |
| `002` | [Mission](./002-mission.md) | Defines the project's mission and intended impact. |
| `003` | [Core Principles](./003-core-principles.md) | Establishes the principles that guide product and engineering decisions. |
| `004` | [Brand Architecture](./004-brand-architecture.md) | Defines the project's brand and relationship with the wider SGoC ecosystem. |
| `005` | [Governance](./005-governance.md) | Defines project governance and decision-making principles. |
| `006` | [Open-Core Model](./006-open-core-model.md) | Documents the project's open-core direction and boundaries. |
| `007` | [Roadmap](./007-roadmap.md) | Defines the project's strategic development direction. |
| `008` | [Glossary](./008-glossary.md) | Defines important project terminology and terminology conventions. |

---

## 🧭 Foundation → Product

The Foundation establishes **why and under which principles** the project exists.

The next Part, `01-product/`, defines **what the product is and what it must provide**.

```text
00-foundation
      │
      ▼
01-product
      │
      ▼
02-architecture
      │
      ▼
04-development
      │
      ▼
05-testing
      │
      ▼
06-deployment
````

Not every Part must be completed before implementation begins. Documentation should evolve alongside the actual product and remain aligned with verified implementation decisions.

---

## 🔒 Source of Truth

When a project-level decision conflicts with an individual implementation document, the relevant higher-level governing document takes precedence unless an approved decision records a change.

Significant architectural or strategic changes should be recorded through the project's decision process and, where appropriate, an Architecture Decision Record (ADR).

---

## 🔄 Maintenance

This index should be updated whenever a Foundation chapter is:

* Added
* Removed
* Renamed
* Reorganized
* Significantly changed

Every material update must also be recorded in the root `CHANGELOG.md`.
