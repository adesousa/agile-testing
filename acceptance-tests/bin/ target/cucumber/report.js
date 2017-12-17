$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Fonctionnalités de ma page d\u0027accueil",
  "description": "",
  "id": "fonctionnalités-de-ma-page-d\u0027accueil",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Vérification du titre et de la description",
  "description": "",
  "id": "fonctionnalités-de-ma-page-d\u0027accueil;vérification-du-titre-et-de-la-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "je suis sur la homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "le titre doit être \"Partagez vos passions | Meetup\"",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "la description doit être \"Partagez vos passions et faites bouger votre ville ! Meetup vous aide à rencontrer des personnes près de chez vous, autour de vos centres d\u0027intérêt.\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});