# Log4j Demo Project

A demonstration project showcasing Log4j2 logging framework with Apache POI integration.

## 📋 Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Quick Start](#quick-start)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Usage](#usage)
- [Building](#building)
- [Dependencies](#dependencies)
- [Security Notes](#security-notes)
- [License](#license)
- [Documentation Information](#documentation-information)

## 🎯 Overview

This project demonstrates:
- **Log4j2** logging framework implementation
- Multiple log levels (DEBUG, INFO, WARN, ERROR, FATAL)
- File and console appenders
- Rolling file policies
- Integration with Apache POI for Excel operations

## 🔧 Prerequisites

- **Java 11** or higher
- **Maven 3.6+**
- IDE (IntelliJ IDEA, Eclipse, VS Code)

## 🚀 Quick Start

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Log4Project
   ```

2. **Build the project**
   ```bash
   mvn clean compile
   ```

3. **Run the demo**
   ```bash
   mvn exec:java -Dexec.mainClass="com.w2a.logging.LoggingDemo"
   ```

## 📁 Project Structure

```
Log4Project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/w2a/logging/
│   │   │       └── LoggingDemo.java
│   │   └── resources/
│   │       └── log4j2.xml
│   └── test/
│       └── java/
│           └── com/w2a/logging/
│               └── LoggingDemoTest.java
├── logs/                    # Generated log files
├── pom.xml
└── README.md
```

## ⚙️ Configuration

### Log4j2 Configuration (`log4j2.xml`)

- **Console Appender**: Outputs to console with timestamp and log level
- **Rolling File Appender**: 
  - Creates daily rolling files
  - Maximum file size: 10MB
  - Keeps last 10 files
  - Location: `logs/app.log`

### Log Levels
- `DEBUG`: Detailed information for debugging
- `INFO`: General information messages
- `WARN`: Warning messages
- `ERROR`: Error events
- `FATAL`: Critical errors

## 💻 Usage

### Basic Logging Example

```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
    private static final Logger logger = LogManager.getLogger(MyClass.class);
    
    public void doSomething() {
        logger.info("Starting operation");
        logger.debug("Processing data: {}", data);
        logger.error("Operation failed", exception);
    }
}
```

### Running the Demo

The main class `LoggingDemo` demonstrates all log levels:

```bash
# Using Maven
mvn exec:java -Dexec.mainClass="com.w2a.logging.LoggingDemo"

# Using Java directly (after compilation)
java -cp target/classes com.w2a.logging.LoggingDemo
```

## 🔨 Building

### Compile
```bash
mvn compile
```

### Package
```bash
mvn package
```

### Clean and Build
```bash
mvn clean install
```

## 📊 Dependencies

| Dependency | Version | Purpose |
|------------|---------|---------|
| Log4j2 Core | 2.21.1 | Logging framework |
| Log4j2 API | 2.21.1 | Logging API |
| Apache POI | 5.2.4 | Excel file operations |

## 🔒 Security Notes

- **Secure Log4j2 2.21.1** - No Log4j 1.x vulnerabilities (CVE-2021-44228, DOS attacks)
- **Dependency exclusions** prevent transitive Log4j 1.x dependencies
- **No hardcoded credentials** or sensitive information
- **Relative file paths** for portability
- **Removed vulnerable legacy files** from previous Log4j 1.x implementation

## 📝 License

This project is for educational purposes.

## 📋 Documentation Information

**Prepared by**: Janielle Joy S. Gregorio  
**LinkedIn**: [linkedin.com/in/janiellejoygregorio](https://linkedin.com/in/janiellejoygregorio)