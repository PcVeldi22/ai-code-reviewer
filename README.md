# 🧠 AI Code Reviewer

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
    <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
      <img src="https://img.shields.io/badge/OpenAI-GPT--4-412991?style=for-the-badge&logo=openai&logoColor=white" />
        <img src="https://img.shields.io/badge/GitHub_Actions-CI%2FCD-2088FF?style=for-the-badge&logo=github-actions&logoColor=white" />
          <img src="https://img.shields.io/badge/License-MIT-green?style=for-the-badge" />
</p>p>

> An **AI-powered automated code review** tool that integrates with GitHub repositories. Uses GPT-4 to analyze Java code for bugs, security vulnerabilities, performance issues, and coding best practices — then posts review comments directly on pull requests.
>
> ---
>
> ## ✨ Features
>
> - 🔍 **Automated Code Analysis** — detects bugs, code smells, and anti-patterns in Java code
> - - 🔒 **Security Scanning** — identifies OWASP Top 10 vulnerabilities (SQL injection, XSS, etc.)
>   - - ⚡ **Performance Insights** — flags inefficient algorithms and memory leaks
>     - - 📋 **Best Practices** — enforces Java coding standards and design patterns
>       - - 🔗 **GitHub PR Integration** — automatically comments on pull requests via GitHub API
>         - - 📊 **Review Dashboard** — web UI showing review history and code quality trends
>           - - ⚙️ **Configurable Rules** — customize which checks to run per repository
>             - - 🚀 **GitHub Actions Ready** — runs as a workflow step in your CI/CD pipeline
>              
>               - ---
>
> ## 🛠️ Tech Stack
>
> | Component | Technology |
> |-----------|------------|
> | Language | Java 17 |
> | Framework | Spring Boot 3.2 |
> | AI Engine | OpenAI GPT-4 API |
> | GitHub Integration | GitHub REST API v4 (GraphQL) |
> | Build Tool | Maven 3.9 |
> | CI/CD | GitHub Actions |
> | Frontend | Thymeleaf + Bootstrap 5 |
> | Database | PostgreSQL 15 |
>
> ---
>
> ## 🚀 Getting Started
>
> ### Prerequisites
>
> - Java 17+
> - - Maven 3.9+
>   - - OpenAI API Key
>     - - GitHub Personal Access Token (with `repo` scope)
>      
>       - ### Installation
>      
>       - ```bash
>         # Clone the repository
>         git clone https://github.com/Pcveldi22/ai-code-reviewer.git
>         cd ai-code-reviewer
>
>         # Configure environment variables
>         export OPENAI_API_KEY=your_openai_key
>         export GITHUB_TOKEN=your_github_token
>
>         # Build and run
>         mvn clean install
>         mvn spring-boot:run
>         ```
>
> ### GitHub Actions Integration
>
> Add this to your `.github/workflows/code-review.yml`:
>
> ```yaml
> name: AI Code Review
> on:
>   pull_request:
>     branches: [ main, develop ]
>
> jobs:
>   review:
>     runs-on: ubuntu-latest
>     steps:
>       - uses: actions/checkout@v4
>       - name: Run AI Code Review
>         uses: Pcveldi22/ai-code-reviewer@v1
>         with:
>           openai-api-key: ${{ secrets.OPENAI_API_KEY }}
>           github-token: ${{ secrets.GITHUB_TOKEN }}
>           language: java
>           severity: medium
> ```
>
> ---
>
> ## 📊 Sample Review Output
>
> ```
> 🧠 AI Code Review — Pull Request #42
> ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
>
> 📁 UserService.java (Line 47)
> 🔴 CRITICAL — SQL Injection Vulnerability
>    Using string concatenation in SQL query. Use PreparedStatement instead.
>
> 📁 PaymentController.java (Line 23)
> 🟡 WARNING — Missing Input Validation
>    The 'amount' parameter is not validated before processing.
>
> 📁 CacheManager.java (Line 89)
> 🟢 SUGGESTION — Performance Improvement
>    Consider using ConcurrentHashMap instead of synchronized HashMap.
>
> Summary: 1 critical, 1 warning, 1 suggestion found.
> ```
>
> ---
>
> ## 📁 Project Structure
>
> ```
> ai-code-reviewer/
> ├── src/main/java/com/chanduveldi/reviewer/
> │   ├── controller/
> │   │   ├── ReviewController.java
> │   │   └── WebhookController.java
> │   ├── service/
> │   │   ├── CodeAnalysisService.java
> │   │   ├── GitHubService.java
> │   │   └── OpenAIService.java
> │   ├── config/
> │   │   └── AppConfig.java
> │   └── model/
> │       ├── ReviewRequest.java
> │       └── ReviewComment.java
> ├── .github/workflows/
> │   └── code-review.yml
> └── pom.xml
> ```
>
> ---
>
> ## 🤝 Contributing
>
> 1. Fork the repository
> 2. 2. Create a feature branch (`git checkout -b feature/amazing-feature`)
>    3. 3. Commit your changes (`git commit -m 'Add amazing feature'`)
>       4. 4. Push to the branch (`git push origin feature/amazing-feature`)
>          5. 5. Open a Pull Request
>            
>             6. ## 📄 License
>            
>             7. MIT License — see [LICENSE](LICENSE) for details.
>            
>             8. ---
>
> <p align="center">Made with ❤️ by <a href="https://github.com/Pcveldi22">Pc Veldi</a>a></p>p>
