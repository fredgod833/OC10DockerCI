# Introduction 
BobApp, lancée par Bob, connaît une popularité croissante mais souffre de bugs et d'un processus de déploiement laborieux. Bob sollicite mon aide pour améliorer la gestion de l'application. Ma mission consiste à mettre en place une pipeline CI/CD complète via GitHub Actions pour automatiser les tests, la qualité du code, la construction du projet, la création d'images Docker, et le déploiement sur Docker Hub. Ce système automatisé vise à encourager la contribution au développement de l'application et à améliorer les retours des utilisateurs en éliminant les obstacles.
    
# Étapes de la Pipeline CI/CD
    
   - **Checkout du répertoire** : Clone le code source pour l'exécution des étapes suivantes.
    -   **Configuration de Node.js** : Prépare l'environnement Node.js.
    -   **Installation de Angular CLI** : Installe Angular CLI pour le front-end.
    -   **Installation des dépendances front-end** : Installe les packages nécessaires du front-end.
    -   **Tests front-end** : Exécute les tests et génère le rapport de couverture du code.
    -   **Configuration de JDK** : Prépare l'environnement Java pour le back-end.
    -   **Construction et analyse du back-end** : Compile le back-end, analyse le code, execute les tests et génère le rapport de couverture du code.
    -   **Mise en cache** : Cache les dépendances pour accélérer les exécutions futures.
    -   **SonarCloud Scan** : Analyse le code avec SonarCloud pour la qualité du code.
    -   **Connexion à Docker Hub** : Authentifie sur Docker Hub pour pousser les images.
    -   **Construction et déploiement des images Docker** : Construit et pousse les images Docker du front et du back.

# KPIs Proposés :
    
1.  **Aucun Nouveau Problème (No new issues)** : L'objectif est de n'introduire aucun nouveau problème dans le code. Si le nombre de problèmes est supérieur à 0, la requête echoue.
    
2.  **Examen des Points Chauds de Sécurité (Security Hotspots Reviewed)** : Il est essentiel que 100% des points chauds de sécurité identifiés soient examinés pour s'assurer que rien n'est négligé.
    
3.  **Duplication de Lignes Limitée (Duplicated Lines)** : Il faut définir un pourcentage maximum de lignes dupliquées tolérable, comme moins de 3% du code, pour favoriser la maintenabilité.
    
4.  **Couverture des Tests Suffisante (Coverage by tests)** : Un seuil de couverture de code par les tests doit être défini, comme un minimum de 80% pour assurer la fiabilité du code.

 # Mesures
  
    
# Retours Utilisateurs:
L'analyse des retours utilisateurs révèle des problèmes critiques impactant l'expérience sur BobApp

 **Problème de Soumission de Blagues** :
- Analyse : Dysfonctionnement critique car il touche à l'interaction principale des utilisateurs avec l'app.
 - Priorité : Très élevée – résoudre ce problème est essentiel pour l'engagement des utilisateurs.

 **Bugs sur le Post de Vidéo** :
- Analyse : Affecte l'expérience utilisateur et peut entraîner une perte de contenu.
- Priorité : Élevée – nécessaire pour maintenir l'utilité de l'application.

 **Communication Utilisateurs** :
- Analyse : Le manque de communication nuit à la réputation et à la confiance.
- Priorité : Élevée – il est crucial d'établir une communication transparente et rapide.

 **Fidélisation des Utilisateurs** :
  - Analyse: Le taux de désinstallation augmente, signalant un mécontentement général.
  - Priorité : Moyenne – important pour la rétention à long terme, mais après la résolution des problèmes signalé au dessus.
