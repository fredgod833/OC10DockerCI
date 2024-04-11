
# Introduction 
BobApp, lancée par Bob, connaît une popularité croissante mais souffre de bugs et d'un processus de déploiement laborieux. Bob sollicite mon aide pour améliorer la gestion de l'application. Ma mission consiste à mettre en place une pipeline CI/CD complète via GitHub Actions pour automatiser les tests, la qualité du code, la construction du projet, la création d'images Docker, et le déploiement sur Docker Hub. Ce système automatisé vise à encourager la contribution au développement de l'application et à améliorer les retours des utilisateurs en éliminant les obstacles.
    
# Étapes de la Pipeline CI/CD
    
   - **Checkout du répertoire** : Clone le code source pour l'exécution des étapes suivantes.
   -    **Configuration de Node.js** : Prépare l'environnement Node.js.
   - **Installation de Angular CLI** : Installe Angular CLI pour le front-end.
   -    **Installation des dépendances front-end** : Installe les packages nécessaires du front-end.
   - **Tests front-end** : Exécute les tests et génère le rapport de couverture du code.
   -    **Configuration de JDK** : Prépare l'environnement Java pour le back-end.
   - **Construction et analyse du back-end** : Compile le back-end, analyse le code, execute les tests et génère le rapport de couverture du code.
   -    **Mise en cache** : Cache les dépendances pour accélérer les exécutions futures.
   -  **SonarCloud Scan** : Analyse le code avec SonarCloud pour la qualité du code.
   -    **Connexion à Docker Hub** : Authentifie sur Docker Hub pour pousser les images.
   -  **Construction et déploiement des images Docker** : Construit et pousse les images Docker du front et du back.

# KPIs Proposés :
    
1.  **Aucun Nouveau Problème (No new issues)** : L'objectif est de n'introduire aucun nouveau problème dans le code. Si le nombre de problèmes est supérieur à 0, la requête echoue.
    
2.  **Examen des Points Chauds de Sécurité (Security Hotspots Reviewed)** : Il est essentiel que 100% des points chauds de sécurité identifiés soient examinés pour s'assurer que rien n'est négligé.
    
3.  **Duplication de Lignes Limitée (Duplicated Lines)** : Il faut définir un pourcentage maximum de lignes dupliquées tolérable, comme moins de 3% du code, pour favoriser la maintenabilité.
    
4.  **Couverture des Tests Suffisante (Coverage by tests)** : Un seuil de couverture de code par les tests doit être défini, comme un minimum de 80% pour assurer la fiabilité du code.

 # Mesures
 ### Issues à traiter
 On peut constater qu'il y a  6 issues qui nécessitent une correction. Parmi elles, une issue est jugée de sévérité élevée et une autre de sévérité moyenne. La plus sévère concerne la fiabilité, ce qui implique des aspects essentiels du comportement du code pouvant affecter son bon fonctionnement. Les cinq autres sont relatives à la maintenabilité, signifiant qu’elles visent à améliorer la clarté, la qualité, et la facilité de gestion du code à long terme
 
  ### Point chaud de sécurité
  L'analyse des points chauds de sécurité révèle deux problèmes à traiter pour renforcer la sécurité de l'application. L'un de ces problèmes est marqué d'une sévérité moyenne, ce qui indique qu'il présente un risque significatif et doit être abordé avec une certaine urgence pour éviter des vulnérabilités potentielles. Il est important de prioriser ces corrections pour maintenir la sécurité et la fiabilité de l'application.

### Duplication de code
Dans l'évaluation actuelle de la qualité du code, nous constatons un taux de duplication de 0%. Cela est excellent car cela signifie qu'il n'y a pas de blocs de code identiques ou très similaires qui se répètent dans le codebase.

### Couverture de code
Notre analyse actuelle montre une couverture de code globale de 60,4%, avec une répartition de 52,8% pour le back-end et de 83,3% pour le front-end. Il faudrait commencer par augementer la couverture du back-end, avec l'objectif d'atteindre un taux moyen global de 80% pour améliorer la qualité et la fiabilité du code
    
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
