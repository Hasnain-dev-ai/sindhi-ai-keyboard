# 🔓 Open-Core Model

## Sindhi AI Keyboard

> **A complete, useful, community-first keyboard at its foundation, with advanced capabilities built sustainably around it.**

---

# 1. 🌟 Purpose

Sindhi AI Keyboard follows an **open-core product strategy**.

The purpose is to balance two goals:

1. Build a genuinely useful keyboard for the Sindhi-speaking community.
2. Create a sustainable technology business capable of funding development, infrastructure, security, AI services, and long-term maintenance.

The project is not designed around the idea that the basic keyboard should become a deliberately crippled free product.

The foundation must remain useful on its own.

---

# 2. 🧭 Core Strategy

The project follows this principle:

> **Build the essential language and keyboard foundation for the community, while developing advanced capabilities that can sustainably fund the ecosystem.**

The conceptual model is:

```text
                    Sindhi AI Keyboard
                           │
              ┌────────────┴────────────┐
              │                         │
              ▼                         ▼
        🆓 Core Experience       ⭐ Advanced Experience
              │                         │
              │                         │
              ▼                         ▼
       Essential Keyboard        Advanced AI Services
       Language Support          Specialized Capabilities
       Offline Functionality     Cloud/Enhanced Processing
       Basic Prediction         Premium Skill Packs
       Core UX                   Enterprise Capabilities
              │                         │
              └────────────┬────────────┘
                           ▼
                    🌱 Sustainability
````

---

# 3. 🆓 The Core

The core represents the essential keyboard experience.

It should provide a complete and dependable foundation rather than functioning as a demonstration or trial version.

Core capabilities may include:

* Sindhi typing
* Urdu typing
* English typing
* Windows-layout-based Sindhi input
* Mobile-appropriate keyboard controls
* Language switching
* Basic prediction
* Basic autocorrection
* Core dictionary functionality
* Essential punctuation
* Numbers and symbols
* Core themes
* Essential accessibility
* Offline-first typing
* Local language resources
* Basic clipboard functionality where applicable
* Core keyboard customization
* Stable typing performance

The exact boundary may evolve as implementation progresses, but the principle remains stable:

> **Typing must remain useful without requiring premium services.**

---

# 4. ⚡ Core Performance Is Sacred

The keyboard's most important responsibility is typing.

Advanced functionality must never be allowed to compromise:

* Input latency
* Keyboard responsiveness
* Startup time
* Stability
* Battery efficiency
* Memory usage
* Offline functionality

The following principle applies:

> **No AI feature is more important than a keyboard that simply works.**

If an advanced feature causes typing instability, the advanced feature must be isolated, degraded, disabled, or redesigned.

---

# 5. 📡 Offline-First Foundation

Offline capability is a fundamental architectural requirement.

The product is intended for users who may experience:

* Weak mobile signals
* Slow connections
* Expensive data
* Intermittent connectivity
* Complete temporary loss of internet access

Therefore, essential keyboard functionality should not depend on continuous cloud connectivity.

The preferred architecture is:

```text
             User Input
                 │
                 ▼
          Local Core Engine
                 │
        ┌────────┴────────┐
        │                 │
    Available          Network
     Locally           Available?
        │                 │
        ▼                 ▼
    Respond           Optional
    Immediately       Enhancement
```

Cloud services should enhance the experience rather than become a prerequisite for basic typing.

---

# 6. 📦 Pack-Based Architecture

The project follows a **strict pack-based model**.

Skill Packs are important because not every device requires every capability.

A user may install:

* Only the core keyboard
* One specialized pack
* Several packs
* All available packs

The installed packs determine what capabilities are available locally.

---

# 7. 🧠 Pack as the Decision Layer

The selected and installed packs should act as an important decision layer for the user's experience.

The system may consider:

* Installed packs
* User-selected packs
* Device capabilities
* Available storage
* Available memory
* CPU capability
* Battery considerations
* Network availability
* Feature requirements

The objective is to avoid unnecessarily loading every model and capability into memory.

---

# 8. 📱 Device-Aware Recommendations

The product should be capable of recommending appropriate packs according to the device.

For example:

```text
Low-resource device
        ↓
Lightweight packs
        ↓
Smaller models
        ↓
Lower memory usage
```

while:

```text
High-resource device
        ↓
More advanced packs
        ↓
Larger models where appropriate
        ↓
Additional capabilities
```

Recommendations should never become intrusive pop-ups during typing.

---

# 9. 🚫 No Typing Interruptions

The product must prioritize uninterrupted typing.

The following should not occur as a normal part of keyboard operation:

* Promotional pop-ups
* Feature advertisements over the keyboard
* Forced upgrade interruptions
* Unexpected full-screen dialogs
* Network prompts while typing
* Blocking AI loading screens
* Unnecessary permission interruptions

The keyboard should remain calm, predictable, and responsive.

---

# 10. 🚫 Ad-Free Product Experience

An ad-free experience is a core product principle.

The project should not depend on intrusive advertisements inside the keyboard.

The sustainability model should instead explore appropriate revenue sources such as:

* Premium features
* Advanced AI capabilities
* Enterprise services
* Specialized services
* SDK services
* API services
* Institutional deployments
* Other clearly defined value-added offerings

The user should not have to sacrifice a peaceful typing experience to sustain the product.

---

# 11. ⭐ Advanced Capabilities

Advanced capabilities may be developed as premium or service-supported functionality.

Potential areas include:

* Advanced AI writing
* Smart rewriting
* Tone transformation
* Advanced paraphrasing
* Real-time translation
* Advanced OCR
* Document processing
* Advanced voice features
* Cloud AI
* Specialized domain intelligence
* Large AI models
* Enterprise processing
* Advanced productivity features

The exact commercial boundaries should be established as the product matures.

---

# 12. 🌐 Cloud and On-Device Processing

The architecture should support both:

### On-device processing

Preferred where practical for:

* Privacy
* Offline operation
* Latency
* Basic prediction
* Core language functionality
* Lightweight AI
* Selected OCR and voice capabilities

### Cloud processing

Appropriate where justified for:

* Larger models
* Advanced AI
* Heavy document processing
* Enterprise workloads
* Features that cannot reasonably run on-device
* Continuously improving services

The system should make the distinction clear to users where it materially affects privacy or connectivity.

---

# 13. 🔐 Privacy Boundary

Open-core architecture must not be interpreted as permission to collect unnecessary user data.

The product should maintain a strong privacy boundary.

Particularly sensitive information may include:

* Typed text
* Personal messages
* Documents
* Images
* Voice
* OCR content
* Contacts
* Location-related information
* Application context

Processing should be limited to what is necessary for the requested feature.

---

# 14. 🧩 Architectural Separation

The system should be designed around clean interfaces.

Conceptually:

```text
Core
│
├── PredictionEngine
├── DictionaryEngine
├── LayoutEngine
├── LanguageEngine
├── InputEngine
└── ThemeEngine

Optional Capability Interfaces
│
├── OcrEngine
├── TranslationEngine
├── WritingAssistant
├── SpeechEngine
└── VisionEngine
```

The implementation may evolve, but the principle is:

> **Core functionality should not be tightly coupled to advanced services.**

---

# 15. 🔌 Replaceable Engines

Advanced implementations should be replaceable.

For example:

```text
TranslationEngine
        │
        ├── Offline implementation
        ├── Lightweight implementation
        └── Cloud implementation
```

Similarly:

```text
OcrEngine
        │
        ├── On-device implementation
        └── Advanced/cloud implementation
```

This makes the platform more resilient to changes in:

* AI providers
* Models
* APIs
* Hardware
* Costs
* Licensing
* Technology

---

# 16. 🪪 Entitlement Architecture

Where premium capabilities exist, access should be controlled through a clear entitlement system.

Conceptually:

```text
User
 │
 ▼
Entitlement State
 │
 ├── Core → Available
 │
 ├── Installed Free Pack → Available
 │
 └── Premium Capability
          │
          ▼
      Entitled?
       ├── Yes → Available
       └── No  → Not Available
```

Entitlement checks should not interfere with ordinary typing.

A temporary inability to reach a licensing service should not unnecessarily disable the essential keyboard.

---

# 17. 🧱 Graceful Degradation

The system should degrade gracefully.

For example:

```text
Advanced AI unavailable
        ↓
Use lightweight local capability
        ↓
If unavailable
        ↓
Use basic keyboard functionality
```

The user should still be able to type.

A cloud outage should not turn the keyboard into an unusable application.

---

# 18. 💾 Resource Management

Pack-based architecture should help control:

* RAM usage
* Storage
* CPU usage
* GPU usage where applicable
* Battery consumption
* Model loading
* Network usage

Models and heavy resources should not automatically remain active when they are not required.

---

# 19. 🧠 Model Loading Strategy

Large models should preferably be:

* Loaded only when required
* Released when no longer required
* Cached intelligently
* Versioned
* Device-aware
* Pack-aware

The exact implementation will be decided during architecture and performance planning.

---

# 20. 📚 Language Resources

The project may use large Sindhi language resources, including the project's identified Sindhi corpus.

Language resources must be managed separately from application logic.

The repository should maintain clear records of:

* Dataset origin
* License
* Attribution
* Processing
* Version
* Intended use

Training data and application code should never be treated as automatically sharing the same license.

---

# 21. ⚖️ Licensing Boundary

The open-core model requires explicit licensing boundaries.

The project should distinguish between:

```text
Project Core
Third-Party Libraries
Language Assets
Datasets
Models
Premium Components
External Services
```

Each category may have different legal conditions.

No licensing assumption should be made merely because a component is publicly downloadable.

---

# 22. 🏗️ Repository Strategy

The architecture should support clear separation between community-oriented core technology and proprietary advanced capabilities.

The exact repository arrangement may evolve, but the intended logical boundary is:

```text
Open/Core Technology
        │
        ├── Keyboard Engine
        ├── Language Foundation
        ├── Shared Components
        └── Developer-Facing Foundations

Advanced Technology
        │
        ├── Advanced AI
        ├── Specialized Services
        ├── Enterprise Features
        └── Commercial Infrastructure
```

The boundary must remain understandable and maintainable.

---

# 23. 🔓 Future Community Development

The open-core strategy is intended to create a path for broader community participation around appropriate components.

Potential community contributions may include:

* Bug fixes
* Keyboard layouts
* Language resources
* Documentation
* Accessibility
* Testing
* Localization
* Performance improvements
* Developer tooling
* Core functionality

Contribution policies remain governed by the project's contribution and governance documents.

---

# 24. 🔌 Sindhi SDK

The future **Sindhi SDK** is an important part of the long-term architecture.

The SDK should eventually allow developers to use Sindhi language capabilities independently of the keyboard application.

Potential SDK areas include:

* Unicode utilities
* Text processing
* Tokenization
* Language detection
* Transliteration
* Prediction
* Grammar
* OCR
* Speech
* Translation
* AI integrations

The open-core architecture should avoid decisions that unnecessarily prevent the future SDK ecosystem.

---

# 25. 🌐 Sindhi AI Platform

The long-term vision extends beyond the keyboard.

The broader platform may eventually provide:

```text
Sindhi AI Keyboard
        │
        ├── Sindhi SDK
        │
        ├── APIs
        │
        ├── AI Models
        │
        ├── Language Services
        │
        ├── OCR
        │
        ├── Speech
        │
        ├── Translation
        │
        └── Domain Skill Packs
```

The open-core model provides a sustainable foundation for this expansion.

---

# 26. 🌾 Domain Skill Packs

The architecture should support domain-specific intelligence without forcing every user to install everything.

Potential packs include:

* 🌾 Agriculture
* 🎓 Education
* 🏥 Healthcare
* 🏛️ Government
* ⚖️ Legal
* 💼 Business
* 💳 Finance
* 📚 Literature
* 🔬 Research
* 📰 Media
* 🛒 Commerce
* 🧑‍💻 Technology
* 🌍 Diaspora and community needs

These are examples of the long-term ecosystem, not a requirement that all capabilities launch simultaneously.

---

# 27. 🧑‍🌾 Community-First Intelligence

Agricultural intelligence is an important example of how domain packs can create practical value.

Potential capabilities may include:

* Plant recognition
* Crop identification
* Seed recognition
* Fruit recognition
* Vegetable recognition
* Nursery assistance
* Soil-related information
* Agricultural OCR
* Localized agricultural terminology

Where AI output could influence health, agriculture, financial, legal, or other consequential decisions, appropriate safety and verification mechanisms must be used.

---

# 28. 🏢 Enterprise and Institutional Capabilities

Advanced services may eventually support organizations such as:

* Educational institutions
* Government departments
* Businesses
* Healthcare organizations
* Agricultural organizations
* Financial institutions
* Research organizations

Enterprise functionality may include:

* Organization management
* Administrative controls
* Specialized models
* Secure APIs
* Batch processing
* Document workflows
* Custom Skill Packs
* Institutional deployment

---

# 29. 💵 Sustainability Model

The open-core model exists partly to create sustainable funding.

Potential cost centers include:

* Cloud infrastructure
* AI inference
* Storage
* Databases
* Model hosting
* Security
* Monitoring
* Distribution
* Development
* Maintenance
* Support

Revenue must therefore be evaluated against actual infrastructure and service costs.

Especially for cloud AI features:

```text
User Request
     ↓
Compute/API Cost
     ↓
Infrastructure Cost
     ↓
Operational Cost
     ↓
Sustainable Pricing
```

Premium pricing must not be selected without considering the real cost of delivering the service.

---

# 30. ☁️ Cloud Cost Awareness

Cloud-powered functionality may create recurring costs.

Examples include:

* Translation APIs
* Large language models
* OCR services
* Speech services
* Cloud inference
* Storage
* Databases

Where feasible, the architecture should provide lower-cost or local alternatives.

This reduces:

* Operating costs
* User latency
* Network dependence
* Privacy exposure

---

# 31. 🧮 Usage Controls

Where a cloud feature creates variable costs, the system may eventually require:

* Usage limits
* Fair-use policies
* Subscription tiers
* Credits
* Quotas
* Enterprise plans

Such mechanisms must be transparent and must not interfere with basic typing.

---

# 32. 🛑 No Artificial Crippling

The free/core experience should not be intentionally made frustrating to pressure users into purchasing premium services.

Avoid strategies such as:

* Artificial keyboard delays
* Forced interruptions
* Excessive feature locks
* Unnecessary advertisements
* Deliberately poor prediction
* Artificial offline restrictions

Premium should represent additional value, not removal of basic dignity from the free experience.

---

# 33. 🔄 Migration and Evolution

The architecture should allow the project to evolve.

Possible future changes include:

```text
Local model
      ↕
Cloud model

Free implementation
      ↕
Premium implementation

One provider
      ↕
Another provider

Single pack
      ↕
Multiple specialized packs
```

Interfaces should reduce the cost of such transitions.

---

# 34. 🧪 Experimental Technology

New AI technologies may be tested without immediately becoming part of the stable core.

Experimental functionality should be isolated where practical.

Examples include:

* New models
* New OCR engines
* New translation providers
* New voice engines
* New prediction systems
* New agentic features

Experiments should not destabilize the essential keyboard.

---

# 35. 🧱 Dependency and License Safety

Before integrating a dependency into a commercial or distributed component, the project should evaluate:

* License
* Linking implications
* Distribution requirements
* Attribution requirements
* Modification requirements
* Compatibility with surrounding components

Special attention must be given to strong-copyleft dependencies and components intended for proprietary distributions.

Where licensing is uncertain:

> **Stop and investigate before making the dependency architecturally essential.**

---

# 36. 📜 Third-Party License Registry

The project should maintain a clear record of important third-party components.

Potential categories include:

```text
Libraries
Fonts
Models
Datasets
OCR engines
Speech engines
AI providers
Translation providers
Mobile frameworks
Development tools
```

The exact inventory should be maintained as implementation progresses.

---

# 37. 🛡️ Security Boundary

The open-core model must not create a false assumption that proprietary code is automatically secure.

Security must be maintained across:

* Core
* Premium services
* Backend
* APIs
* Authentication
* Entitlements
* Model services
* Build pipelines
* Update mechanisms

Security is an architectural property of the whole ecosystem.

---

# 38. 🔄 Update Strategy

Updates should distinguish between:

### Core updates

Potentially include:

* Bug fixes
* Keyboard improvements
* Layout changes
* Language improvements
* Performance improvements

### Pack updates

Potentially include:

* New dictionaries
* New models
* New domain knowledge
* Updated AI capabilities

### Service updates

Potentially include:

* Backend improvements
* API changes
* Cloud model updates

This separation can reduce unnecessary downloads.

---

# 39. 📥 Installation Strategy

The user should not be forced to download the entire ecosystem.

Conceptually:

```text
Install Keyboard
      ↓
Install Core
      ↓
Optional Packs
      ↓
Optional Advanced Services
```

This supports users with:

* Limited storage
* Limited bandwidth
* Older devices
* Weak internet

---

# 40. 🧹 Uninstallation and Resource Control

Users should eventually be able to manage installed packs.

Possible controls include:

* Install
* Enable
* Disable
* Update
* Remove
* Re-download

Removing an optional pack should not break the core keyboard.

---

# 41. 🔍 Transparency

The product should clearly communicate where appropriate:

* Which packs are installed
* Which features require internet
* Which features process data locally
* Which features use cloud services
* Which features require premium access
* Approximate resource requirements

Users should remain in control.

---

# 42. 🌱 Long-Term Destination

The open-core model is not the final feature boundary.

It is the sustainable path toward the larger vision.

```text
Phase 1
Reliable Keyboard
        ↓
Phase 2
Language Intelligence
        ↓
Phase 3
Skill Packs
        ↓
Phase 4
Advanced AI
        ↓
Phase 5
Sindhi SDK
        ↓
Phase 6
Sindhi AI Platform
        ↓
Phase 7
Global Sindhi Technology Ecosystem
```

The exact roadmap remains governed by `007-roadmap.md`.

---

# 43. 🧭 Open-Core Decision Rules

When deciding whether a capability belongs in the core or advanced layer, consider:

### Core if it is:

* Fundamental to typing
* Required for basic usability
* Important for offline operation
* Lightweight enough for broad devices
* Essential to language accessibility
* Necessary for a complete keyboard experience

### Advanced if it is:

* Computationally expensive
* Cloud-dependent
* Specialized
* Enterprise-oriented
* Resource-intensive
* Requires continuously paid infrastructure
* Provides substantial additional value beyond basic typing

This is a guideline rather than an automatic classification system.

---

# 44. 🤲 Community Commitment

The open-core model must remain aligned with the project's purpose.

The project should continue striving to provide meaningful language technology to people who may otherwise have limited access to modern AI tools in their own language.

The economic model exists to sustain that mission.

It should not replace it.

---

# 45. 🏁 Final Open-Core Principle

> **Keep the foundation useful. Keep the experience peaceful. Keep advanced capabilities sustainable. Keep the architecture modular. Keep the community at the center.**

The ultimate objective is not simply to create a profitable keyboard.

It is to create a sustainable technology foundation through which Sindhi language users, developers, institutions, and future generations can access increasingly powerful digital tools.

---

<p align="center">

### 🔓 Open Foundation

### ⭐ Sustainable Advanced Capabilities

### 📦 Modular Skill Packs

### 🔌 Future Sindhi SDK

### 🌐 Future Sindhi AI Platform

**One keyboard today. A broader language ecosystem tomorrow.**

</p>
