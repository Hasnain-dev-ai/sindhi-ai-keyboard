# 🤝 Contributing to Sindhi AI Keyboard

> **Build with purpose. Build with quality. Build for the community.**

Thank you for your interest in contributing to **Sindhi AI Keyboard**.

Sindhi AI Keyboard is designed as more than a traditional mobile keyboard. It is the foundation of a broader **Sindhi AI ecosystem** intended to provide powerful language, productivity, accessibility, AI, OCR, translation, voice, domain-specific intelligence, and developer capabilities for Sindhi communities around the world.

Every contribution should therefore be made with three things in mind:

> **The user. The language. The long-term future of the project.**

---

# 🌍 What We Are Building

Sindhi AI Keyboard aims to provide a unified experience for:

- ⌨️ Sindhi typing
- 🇵🇰 Urdu typing
- 🌐 English typing
- 🔄 Multilingual switching
- 🔤 Sindhi characters and punctuation
- 🔢 Numbers and digits
- ⚡ Fast and responsive typing
- 📡 Offline-first operation
- 🧠 Intelligent prediction
- ✍️ AI writing assistance
- 🔤 Grammar and correction
- 🔄 Transliteration
- 🌐 Translation
- 📷 OCR
- 🎙️ Voice input
- 🖼️ Vision capabilities
- 📄 Document assistance
- 🌾 Agriculture intelligence
- 🎓 Education assistance
- 🏥 Healthcare-related language tools
- 🏛️ Government and civil-service assistance
- ⚖️ Legal-language assistance
- 💼 Business and professional writing
- 📚 Literary and cultural language tools
- 🔬 Research capabilities
- 📦 Skill Packs
- 🔌 Sindhi SDK
- 🌐 Sindhi AI Platform

The keyboard remains the foundational interaction layer.

---

# 🧭 Contribution Philosophy

We value contributions that improve the project in meaningful ways.

A contribution should ideally improve one or more of:

```text
Reliability
Security
Privacy
Performance
Accessibility
Language quality
Usability
Offline capability
AI quality
Maintainability
Documentation
Developer experience
Community value
````

A contribution does not need to be large to be important.

A one-line fix that prevents a keyboard crash can be more valuable than an entire new feature.

---

# 🤲 Our Core Principles

Contributors should understand the project's fundamental principles before making substantial changes.

## 1. ⌨️ Typing Comes First

The keyboard is the foundation.

Nothing should unnecessarily compromise:

* Typing speed
* Key responsiveness
* Keyboard stability
* Language switching
* Input accuracy
* Battery efficiency

---

## 2. 📡 Offline-First

Core functionality should work without requiring continuous internet access.

When adding network-dependent functionality, contributors should consider:

* Offline behavior
* Failure handling
* Network latency
* Data usage
* Retry behavior
* User feedback

A user should not lose basic typing because the network disappears.

---

## 3. 🚫 Ad-Free

The core keyboard experience is designed to remain ad-free.

Do not introduce:

* Advertising SDKs
* Intrusive promotional screens
* Advertising banners
* Forced advertisements
* Ads during typing

---

## 4. 🛡️ Privacy

Keyboard applications can process extremely sensitive information.

Contributors must carefully consider whether any feature handles:

* Keystrokes
* Typed text
* Voice
* Images
* Documents
* Clipboard contents
* User preferences
* Device information
* Network requests

Collect or transmit only what is genuinely necessary and appropriately authorized.

---

## 5. 🔐 Security

Security must be considered before implementation, not after deployment.

Potentially sensitive changes should receive additional review.

Never introduce:

* Hard-coded secrets
* Insecure authentication
* Unnecessary permissions
* Unprotected user data
* Unsafe network communication
* Hidden telemetry
* Unauthorized data collection

---

## 6. ⚡ Performance

Sindhi AI Keyboard must work across a wide range of devices.

Consider:

* RAM
* CPU
* GPU/NPU
* Storage
* Battery
* Thermal limits
* Model size
* Application startup
* Keyboard latency

Do not assume that every user owns a flagship device.

---

# 🌐 Language Standards

Sindhi is a first-class language of this project.

Contributions involving language resources should prioritize:

* Correct Sindhi Unicode
* Character accuracy
* Proper spelling
* Appropriate terminology
* Linguistic consistency
* Rendering quality
* Regional awareness
* Unicode correctness

The project also supports:

* Urdu
* English

Language features should avoid unnecessarily treating Sindhi as a secondary translation layer.

---

# ⌨️ Keyboard Layout Compatibility

The project uses established Sindhi typing conventions as an important foundation.

The supplied Windows-style Sindhi keyboard layout is an important reference for:

* Letters
* Characters
* Digits
* Numbers
* Punctuation
* Symbols
* Shortcut functionality

Mobile interaction should adapt these conventions to touch interfaces without unnecessarily breaking established typing familiarity.

Where desktop concepts such as:

```text
Shift
Ctrl
Caps Lock
```

are not directly available on mobile, appropriate dedicated mobile controls should provide equivalent functionality.

---

# 🧩 Architecture

Contributors should respect the project's modular architecture.

The system should remain capable of separating:

```text
Core Keyboard
      ↓
Language Engine
      ↓
Skill Packs
      ↓
AI Capabilities
      ↓
Cloud Services
      ↓
Sindhi SDK
      ↓
Sindhi AI Platform
```

Features should not become unnecessarily coupled to unrelated components.

---

# 📦 Skill Packs

Skill Packs are a major architectural concept.

A Skill Pack may provide specialized capabilities for areas such as:

* 🌾 Agriculture
* 🎓 Education
* 🏥 Healthcare
* 🏛️ Government
* ⚖️ Legal
* 💼 Business
* 📚 Literature
* 🔬 Research
* 💻 Technology
* 🧑‍🌾 Rural communities

Each Skill Pack should ideally be:

* Modular
* Discoverable
* Versioned
* Testable
* Resource-aware
* Privacy-conscious
* Independently maintainable

---

# 🧠 Device-Aware Features

The application may recommend Skill Packs and capabilities based on device characteristics.

Contributors should consider:

```text
RAM
CPU
GPU
NPU
Storage
Android version
Battery
Thermal capability
Network availability
```

The objective is not to install everything.

The objective is to provide the **best experience for that particular device and user**.

---

# 🧠 AI Contributions

AI features should be evaluated against:

* Accuracy
* Latency
* Privacy
* Security
* Model size
* Offline capability
* Cost
* Maintainability
* User value

Do not add AI merely because an AI model can perform a task.

Ask:

> Does this solve a real user problem?

---

# 🤖 On-Device AI

Where practical, contributors should consider local processing.

Potential benefits include:

* Privacy
* Offline operation
* Lower latency
* Lower cloud cost
* Better rural accessibility

Large or computationally expensive workloads may use cloud infrastructure when justified.

The architecture should support appropriate hybrid behavior.

---

# 📡 Network-Aware Development

Network availability should never be assumed.

Features should gracefully handle:

```text
Online
   ↓
Slow network
   ↓
Unstable network
   ↓
No network
```

Avoid designs where a temporary network failure causes:

* Keyboard crashes
* Typing interruption
* Data loss
* Frozen UI
* Endless loading
* Repeated failed requests

---

# 🧪 Testing

Every meaningful code contribution should be tested appropriately.

Depending on the change, testing may include:

* Unit tests
* Integration tests
* UI tests
* Device tests
* Offline tests
* Performance tests
* Language tests
* Model tests
* Security tests
* Regression tests

---

# 📱 Device Testing

Where relevant, test across different device capabilities.

At minimum, consider:

```text
Low-end device
Mid-range device
High-end device
```

Testing should also consider different Android versions where supported.

---

# 📡 Offline Testing

Features that claim offline support must be tested with connectivity disabled.

Test scenarios should include:

```text
Wi-Fi ON
Mobile data ON
Wi-Fi OFF
Mobile data OFF
Airplane mode
Intermittent connection
Slow connection
```

---

# 🌐 Language Testing

Language-related changes should be tested for:

* Unicode correctness
* Character rendering
* Input behavior
* Cursor movement
* Word boundaries
* Prediction
* Autocorrection
* Punctuation
* Numerals
* Mixed-language text
* Right-to-left behavior where applicable

---

# 📷 OCR Testing

OCR changes should consider:

* Printed Sindhi
* Printed Urdu
* Printed English
* Different fonts
* Different lighting
* Image quality
* Rotation
* Background noise
* Offline behavior
* Document sizes

Do not upload private documents for testing.

Use safe test material.

---

# 🎙️ Voice Testing

Voice features should consider:

* Sindhi speech
* Urdu speech
* English speech
* Accent variation
* Background noise
* Offline behavior
* Punctuation
* Mixed-language speech

---

# ✍️ AI Writing Testing

Writing features should be evaluated for:

* Meaning preservation
* Grammar
* Tone
* Context
* Language correctness
* Hallucination
* Unwanted rewriting
* Formatting

AI should not silently change the intended meaning of a user's text.

---

# 🌾 Domain-Specific AI

Features involving agriculture, healthcare, legal information, finance, or other high-impact domains require additional care.

Contributors should clearly distinguish:

```text
Information
      ≠
Professional advice
      ≠
Guaranteed diagnosis
```

AI output must not be presented with unjustified certainty.

---

# 🔌 Sindhi SDK

The future Sindhi SDK is a strategic part of the ecosystem.

SDK-related contributions should prioritize:

* Stable interfaces
* Documentation
* Version compatibility
* Developer experience
* Performance
* Security
* Privacy
* Clear licensing

Avoid exposing unstable internal implementation details as public SDK contracts.

---

# 🏗️ Code Organization

Keep code:

* Modular
* Readable
* Testable
* Maintainable
* Explicit
* Consistent

Avoid unnecessary abstractions.

Avoid introducing dependencies without a clear reason.

Prefer simple architecture when it solves the problem adequately.

---

# 📦 Dependencies

Before adding a dependency, consider:

* License
* Security
* Maintenance
* Size
* Performance
* Mobile compatibility
* Offline compatibility
* Community health
* Long-term availability

A dependency is part of the project's long-term maintenance burden.

---

# ⚖️ Licensing

Contributors must have the right to submit their work.

Do not submit:

* Proprietary code
* Unauthorized datasets
* Copyrighted material without permission
* Unlicensed fonts
* Unlicensed images
* Restricted models
* Confidential company material

Third-party licenses must be preserved.

---

# 📚 Language Dataset Contributions

Language data requires special care.

Before contributing a dataset or language resource, document where it came from and what license or permission applies.

Do not assume that publicly accessible data is automatically free to redistribute.

Attribution requirements must be respected.

---

# 🧠 Sindhi Language Corpus

The project may use the official Sindhi language resources supplied by the project owner, including the Sindhi Mega Corpus.

When such resources are incorporated into training or language systems, their applicable license, attribution, and usage requirements must be preserved.

---

# 🔐 Secrets

Never commit:

```text
API keys
Passwords
Private keys
Tokens
Cloud credentials
Database credentials
Signing keys
Service-account credentials
```

Use appropriate environment variables or secret-management systems.

If a secret is accidentally committed, report it immediately and rotate it.

---

# 📝 Documentation

Documentation is a first-class contribution.

Useful documentation contributions include:

* Setup instructions
* Architecture explanations
* API documentation
* Language documentation
* Skill Pack documentation
* Troubleshooting
* Examples
* Developer guides
* User guides

Documentation should remain understandable to its intended audience.

---

# 🏛️ Architectural Decision Records

Important architectural decisions should be documented in:

```text
docs/11-decisions/
```

An ADR should generally explain:

```text
Problem
Context
Options
Decision
Reasoning
Consequences
```

Do not hide major architectural decisions inside code comments alone.

---

# 🗺️ Roadmap Alignment

Before implementing a large feature, check:

```text
ROADMAP.md
```

A feature should have a clear relationship to the project's direction.

If a proposal significantly changes the roadmap, document the reasoning before implementation.

---

# 🐛 Bug Reports

A useful bug report should contain:

```text
Device:
Android version:
Application version:
Skill Packs:
Language:
Online / Offline:
Expected behavior:
Actual behavior:
Steps to reproduce:
Logs / screenshots where appropriate:
```

Remove private or sensitive information before submitting.

---

# 💡 Feature Proposals

A useful feature proposal should explain:

### Problem

What problem exists?

### User

Who experiences it?

### Solution

What should happen?

### Alternatives

What other solutions were considered?

### Offline Behavior

How does it behave without internet?

### Performance

What resources might it require?

### Privacy

What user information does it process?

### Sustainability

Does it create ongoing infrastructure costs?

---

# 🌿 Branching

Use descriptive branch names.

Examples:

```text
feature/ai-writing
feature/sindhi-ocr
feature/agriculture-pack
fix/keyboard-crash
fix/offline-prediction
docs/architecture
test/sindhi-layout
refactor/prediction-engine
```

Avoid vague names such as:

```text
test
new
changes
stuff
final
final2
latest
```

---

# 📝 Commit Messages

Commit messages should clearly describe the change.

Recommended format:

```text
type: short description
```

Examples:

```text
feat: add Sindhi prediction engine
fix: prevent keyboard crash during language switch
docs: document Skill Pack architecture
test: add offline prediction tests
refactor: isolate translation provider
perf: reduce keyboard startup latency
security: harden credential handling
```

Keep commits focused where practical.

---

# 🔄 Pull Requests

A pull request should explain:

### What changed?

Describe the implementation.

### Why?

Explain the problem being solved.

### How?

Summarize the technical approach.

### Testing

Explain what was tested.

### Risks

Mention known risks or limitations.

### Screenshots

Include screenshots or recordings for meaningful UI changes when appropriate.

---

# ✅ Pull Request Checklist

Before submitting a contribution:

```text
[ ] The change solves a clear problem.
[ ] The code is readable and maintainable.
[ ] Tests were added or updated where appropriate.
[ ] Existing tests pass.
[ ] Offline behavior was considered.
[ ] Performance impact was considered.
[ ] Privacy impact was considered.
[ ] Security impact was considered.
[ ] Language behavior was checked where relevant.
[ ] Documentation was updated where necessary.
[ ] No secrets were committed.
[ ] Third-party licenses were checked.
[ ] CHANGELOG.md was updated when required.
```

---

# 🔍 Code Review

Code review exists to improve the project, not to criticize contributors.

Reviewers should focus on:

* Correctness
* Security
* Privacy
* Performance
* Maintainability
* Testing
* Architecture
* User experience
* Long-term consequences

Review comments should be clear and constructive.

---

# 🧑‍💻 Reviewer Responsibilities

Reviewers should:

* Read the actual change.
* Consider its context.
* Verify important claims.
* Check tests.
* Identify security risks.
* Consider low-end devices.
* Consider offline behavior.
* Avoid unnecessary stylistic debates.

Not every review comment requires a rewrite.

---

# 🔁 Requested Changes

If changes are requested, contributors should address them or explain why they disagree.

Technical disagreement should be resolved through evidence and discussion.

---

# 🚨 Security-Sensitive Changes

Changes involving:

* Authentication
* Encryption
* Keyboard input
* Network communication
* User data
* Cloud infrastructure
* Permissions
* AI data processing

may require additional review.

Follow:

```text
SECURITY.md
```

for security reporting and handling.

---

# 🧪 Continuous Integration

Automated checks should protect the project from regressions.

Where configured, contributions should pass:

* Build checks
* Tests
* Linting
* Formatting
* Static analysis
* Security checks

A contribution should not intentionally bypass automated safeguards.

---

# 📊 Performance Regression Policy

Performance regressions are treated seriously because keyboard responsiveness is a core product requirement.

Changes that increase:

* Startup time
* Typing latency
* RAM usage
* Battery consumption
* Model size

should provide a reasonable explanation and, where possible, measurement.

---

# 📱 UI & UX Contributions

UI changes should preserve:

* Touch accessibility
* Readability
* Keyboard usability
* Fast interaction
* Consistent navigation
* Clear feedback

Avoid unnecessary animations or visual effects that interfere with typing.

---

# ♿ Accessibility

Contributors should consider users with different abilities.

Where appropriate, support:

* Large text
* Screen readers
* Touch accessibility
* Clear contrast
* Predictable interaction
* Voice input
* Simple navigation

Accessibility should be considered during design, not after implementation.

---

# 🌾 Community & Real-World Use

A feature should be evaluated in the context of real users.

Especially consider:

* Villages
* Fields
* Schools
* Offices
* Government departments
* Businesses
* Families
* Older users
* Users with limited connectivity
* Users with older devices

The project should solve real problems rather than optimize only for technically advanced environments.

---

# 🌍 Internationalization

The architecture should allow the project to grow without hard-coding language assumptions.

Avoid embedding language-specific behavior into generic components when a reusable language abstraction is appropriate.

---

# 📋 Issue Labels

Where issue tracking is available, useful categories may include:

```text
bug
feature
enhancement
documentation
performance
security
accessibility
language
Sindhi
Urdu
English
AI
OCR
voice
translation
Skill Pack
SDK
```

Labels should help organize work rather than create unnecessary bureaucracy.

---

# 🧭 Contribution Priority

When multiple contributions compete for attention, prioritize according to:

```text
Security
   ↓
Critical reliability
   ↓
Privacy
   ↓
Core typing experience
   ↓
Performance
   ↓
Accessibility
   ↓
Language quality
   ↓
Important user needs
   ↓
AI improvements
   ↓
Advanced features
   ↓
Experimental features
```

This ordering may change when circumstances require it.

---

# 🧪 Experimental Features

Experimental functionality should be clearly isolated from stable functionality where practical.

Experiments should not silently affect the stability of the core keyboard.

---

# 🗃️ Data & Storage

Contributors should minimize persistent storage.

Before storing information, ask:

```text
Do we need it?
Why do we need it?
How long should we keep it?
Can it remain on-device?
Can we avoid storing it?
```

---

# ☁️ Cloud Development

Cloud-dependent features should define:

* Required services
* Data flow
* Failure behavior
* Cost implications
* Security requirements
* Privacy implications
* Offline fallback

Do not introduce cloud dependencies casually.

---

# 💰 Cost Awareness

Contributors should consider the financial impact of new services.

For cloud AI or infrastructure:

```text
Requests
×
Usage
×
Infrastructure cost
=
Ongoing project expense
```

A feature that looks free to the user may create significant ongoing costs for the project.

---

# 🧩 Modular Design

Whenever practical, optional functionality should remain modular.

For example:

```text
Core
 ├── Language
 ├── Keyboard
 └── Basic Prediction

Optional
 ├── Agriculture Pack
 ├── Education Pack
 ├── OCR Pack
 ├── Translation Pack
 └── Advanced AI
```

This helps preserve performance and allows users to choose what they need.

---

# 🔄 Backward Compatibility

Changes should avoid unnecessarily breaking:

* Existing users
* Existing Skill Packs
* Stored configuration
* SDK integrations
* Public APIs
* Language resources

Breaking changes must be clearly documented.

---

# 📈 Versioning

Changes affecting compatibility should follow the project's versioning strategy.

Version changes should clearly communicate whether the change is:

```text
Patch
Minor
Major
```

where the project's selected versioning system applies.

---

# 📜 Changelog Requirement

Whenever a user-facing, developer-facing, architectural, security, or significant project change is made, update:

```text
CHANGELOG.md
```

The changelog should describe what changed without requiring readers to inspect the commit history.

---

# 🔄 Keeping Contributions Maintainable

A contribution should be designed for the future, not only for today's codebase.

Ask:

> Will another developer understand this six months from now?

Ask:

> Can this feature be tested?

Ask:

> Can this feature be removed or replaced without breaking everything?

Ask:

> Does this design leave room for the Sindhi SDK and wider Sindhi AI Platform?

---

# 🤝 Contributor Conduct

All contributors must follow:

```text
CODE_OF_CONDUCT.md
```

Technical skill does not excuse disrespectful behavior.

---

# 🏛️ Governance

Project-level decisions follow:

```text
GOVERNANCE.md
```

Contributors should understand that not every technical proposal will be accepted.

A proposal may be declined because of:

* Security
* Privacy
* Performance
* Cost
* Complexity
* Licensing
* Maintenance burden
* Product direction
* Community benefit

A declined contribution is not necessarily a bad contribution.

---

# 💰 Sustainability

The project aims to remain:

* Ad-free
* Accessible
* Sustainable

Contributors should avoid designs that create unnecessary recurring costs.

Refer to:

```text
FUNDING.md
```

for the project's sustainability principles.

---

# 🛡️ Security Disclosure

Never publicly expose a serious vulnerability simply to demonstrate that it exists.

Follow:

```text
SECURITY.md
```

for responsible security reporting.

---

# 🌱 Improving This Guide

Contribution guidelines are themselves part of the project.

If you identify a missing rule, unclear instruction, or unnecessary process, propose an improvement.

Good contribution processes should evolve alongside the project.

---

# 🤲 Final Message to Contributors

If you contribute to Sindhi AI Keyboard, you are not simply changing code.

You may be helping:

* A farmer communicate.
* A student learn.
* A teacher prepare material.
* A parent write in Sindhi.
* An elderly person use technology.
* A government worker prepare a document.
* A researcher work with Sindhi text.
* A writer preserve language.
* A developer build the next Sindhi application.

That responsibility matters.

Build carefully.

Test honestly.

Document clearly.

Respect users.

Respect the language.

Protect privacy.

Think beyond today's feature.

Think about the community that will use the software tomorrow.

---

# ❤️ The Contribution Principle

> **If a contribution makes the project more useful, more reliable, more secure, more accessible, more maintainable, or more valuable to the Sindhi community, it is worth considering.**

### 🤝 Thank you for helping build the future of Sindhi technology.

---

<p align="center">

### ⌨️ Sindhi AI Keyboard

### 🌍 Built for Sindhis. Designed for everyone.

**Sindhi AI Platform — Solangi Group of Companies (SGoC)**

</p>
