# Virinchi Project Repository

Welcome to the Virinchi project repository! This repository contains educational software projects focused on learning management and curriculum development.

## 📁 Repository Structure

```
Virinchi/
├── Learning_Management_System/     # Main LMS Application
│   ├── src/                       # Source code
│   ├── target/                    # Compiled classes
│   ├── pom.xml                    # Maven configuration
│   └── README.md                  # Detailed LMS documentation
└── README.md                      # This file
```

## 🎯 Projects Overview

### Learning Management System (LMS)
A comprehensive Java Swing-based Learning Management System designed for educational institutions.

**Key Features:**
- **Multi-Role Authentication**: Admin, Instructor, and Student access levels
- **Class Management**: Create, manage, and organize student classes
- **Curriculum Planning**: Design and track educational curricula
- **Session Management**: Schedule and manage lesson sessions
- **Database Integration**: Persistent data storage with Apache Derby
- **Custom UI Components**: Enhanced user interface with custom Swing components

**Technology Stack:**
- **Language**: Java 17+
- **Framework**: Java Swing (GUI)
- **Build Tool**: Apache Maven
- **Database**: Apache Derby (Embedded)
- **ORM**: JPA with EclipseLink
- **IDE**: NetBeans (Recommended)

## 🚀 Quick Start

### Prerequisites
Before running any project in this repository, ensure you have:

- **Java Development Kit (JDK) 17+**
- **Apache Maven 3.6.0+**
- **Git** (for cloning)

### Installation Steps

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd Virinchi
   ```

2. **Navigate to the LMS Project**
   ```bash
   cd Learning_Management_System
   ```

3. **Install Dependencies**
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   ```bash
   mvn exec:java
   ```

## 📋 System Requirements

### Minimum Requirements
- **OS**: Windows 10+ (recommended), Linux, macOS
- **RAM**: 512 MB minimum, 1 GB recommended
- **Storage**: 200 MB free space
- **Java**: JDK 17 or higher
- **Maven**: 3.6.0 or higher

### Recommended Development Environment
- **IDE**: NetBeans 12+ or IntelliJ IDEA
- **Database Tool**: Apache Derby tools (included)
- **Version Control**: Git

## 🔧 Dependencies Overview

The project uses the following major dependencies:

### Core Dependencies
- **Apache Derby** (v10.16.1.1): Embedded database
- **EclipseLink** (v2.7.10): JPA implementation
- **Jakarta Persistence API** (v2.2.3): ORM specification
- **NetBeans AbsoluteLayout** (RELEASE150): UI layout manager

### Development Dependencies
- **Derby Client** (v10.15.2.0): Database client tools
- **Derby Tools** (v10.15.2.0): Database administration tools

## 📖 Documentation

### Project-Specific Documentation
- [Learning Management System README](Learning_Management_System/README.md) - Detailed LMS documentation

### Key Documentation Sections
- Installation and setup instructions
- Database configuration
- User roles and permissions
- System architecture
- Troubleshooting guide

## 🏗️ Architecture Overview

### Learning Management System Architecture
```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Presentation  │    │    Business     │    │      Data       │
│     Layer       │    │     Logic       │    │     Layer       │
│                 │    │     Layer       │    │                 │
│ • Swing GUI     │◄──►│ • User Mgmt     │◄──►│ • Apache Derby  │
│ • Custom        │    │ • Class Mgmt    │    │ • JPA Entities  │
│   Components    │    │ • Session Mgmt  │    │ • Persistence   │
│ • Role-based UI │    │ • Curriculum    │    │   Layer         │
└─────────────────┘    └─────────────────┘    └─────────────────┘
```

## 👥 User Roles

### Administrator
- Complete system management
- User account creation and management
- Class and lesson administration
- System configuration

### Instructor
- Manage assigned classes
- Create and schedule sessions
- Develop curriculum content
- Track student progress

### Student
- View class information
- Access lesson materials
- Download session content
- Track personal progress

## 🛠️ Development

### Building the Project
```bash
# Clean and compile
mvn clean compile

# Run tests (if available)
mvn test

# Package the application
mvn package

# Install to local repository
mvn install
```

### Running in Development Mode
```bash
# Run with Maven (recommended)
mvn exec:java

# Alternative: Specify main class explicitly
mvn exec:java -Dexec.mainClass="com.blackflower.curriculumcreator.MainFrame"

# Or run the main class directly (after compilation)
java -cp target/classes com.blackflower.curriculumcreator.MainFrame
```

**Note**: The Maven exec plugin is configured in `pom.xml` with the main class, so `mvn exec:java` is sufficient to run the application.

## 🐛 Troubleshooting

### Common Issues

1. **Java Version Mismatch**
   - Ensure JDK 17+ is installed and configured
   - Check `JAVA_HOME` environment variable

2. **Maven Dependencies**
   - Run `mvn clean install` to refresh dependencies
   - Check internet connection for dependency downloads

3. **Database Connection**
   - Verify Derby database path in `persistence.xml`
   - Ensure write permissions for database directory

4. **UI Display Issues**
   - Check system display scaling settings
   - Verify Swing look-and-feel compatibility

### Getting Help
- Check project-specific README files
- Review Maven logs for dependency issues
- Verify Java and Maven versions
- Ensure all prerequisites are met

## 📄 License

Please refer to individual project directories for specific licensing information.

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## 📞 Support

For technical support or questions:
- Check the documentation in project subdirectories
- Review troubleshooting sections
- Create an issue in the repository

---

**Note**: This repository is primarily designed for educational purposes and learning management system development.
