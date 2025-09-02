# Simple Dungeons (SD) Project Brief

## 1. The Core Mission
This project is to build the Simple Dungeons plugin for Minecraft. The core goal is a plug-and-play, safe, and vanilla-friendly procedural dungeon system built on Java 21 for the Paper 1.21.8 server API. The system must be extensible through optional, auto-detected integrations and support an optional cluster mode for cross-server play.

## 2. Key Project Blueprints (Contracts)
All development must strictly adhere to the contracts and specifications outlined in the following core documents. You are expected to have a complete understanding of their contents.
* `SD/Build Plan`
* `SD/Handoff Brief`
* `SD/Config`
* `SD/Pre-Flight Checklist`

## 3. Development Workflow & Rules
* **IDE:** IntelliJ IDEA Ultimate.
* **Version Control:** Git. All work is done on the `dev` branch. The `master` branch is for stable, tested releases only.
* **Change Method:** All code changes must be provided as `unified-diff` patches. Full-file reprints are forbidden.
* **Code Structure:** No single Java file is to exceed 300 lines of code. The Maven multi-module structure must be respected at all times.
* **Repository:** The project is public and hosted on GitHub under the PlayDarkRise organization.
* **Deployment:** The final `sd-bundle.jar` is built locally and deployed to a dedicated Ubuntu server for testing.

## 4. Current Status & Next Task
* **Last Completed Task:** Completed full project setup including IntelliJ project creation, Git initialization, and connection to a public GitHub repository. Created the `dev` branch.
* **Current Git Branch:** `dev`
* **Next Immediate Task:** Scaffold all Maven sub-modules as defined in the `SD/Build Plan`.