Narrative:
In order to start a tournament
As a tourman user
I want to add a tournament
					 
Scenario:  Add a tournament
#Given there is a user
When the user adds a tournament with name Easter Alk open, start date 29/3/2013, end date 31/3/2013 and location Kaarina
Then a tournament with name Easter Alk open is created
