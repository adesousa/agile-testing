Feature: Fonctionnalités de ma page d'accueil
	Scenario: Vérification du titre et de la description
		Given je suis sur la homepage
		Then le titre doit être "Partagez vos passions | Meetup"
		And la description contient "Partagez vos passions et faites bouger votre ville"
