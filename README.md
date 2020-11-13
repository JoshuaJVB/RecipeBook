# RecipeBook

The goal of this program is to create a recipe and grocery managment web api. We do this by allowing the user to store recipes, pull up a list of stored recipes, let a user select which recipes they want to make this shopping trip, and then generating a list of ingredients they will need to buy.

_____________
## Adding recipes

recipes can be added via JSON at an api address of "/addrecipe", for the purposes of this project I used postman, however this could be plugged into a web application to generate that JSON. The format for this JSON is below.   
`
{
            "name":"steak",
            "ingredients":["steak","butter"],
            "link":"www.food.com"
        }`
       
These recipes are stored in a repo so that they can be accessed again for future shopping lists
____________________
## pulling recipes

The list of saved recepies can be pulled at the address "/recipes", this will return a list of JSON objects related to the recipe model. You can find an example below.   
`
[
    {
        "id": 1,
        "name": "sandwich",
        "ingredients": [
            "bread",
            "hame"
        ],
        "link": "www.food.com"
    },   
    {
        "id": 2,
        "name": "steak",
        "ingredients": [
            "steak",
            "butter"
        ],
        "link": "www.food.com"
    },   
    {
        "id": 3,
        "name": "Mac & Cheese",
        "ingredients": [
            "mac",
            "cheese"
        ],
        "link": "www.food.com"
    }
]`

_______________
## selecting recipes

Recipes can be selected via a JSON object containing a list of numbers related to the ID to "/choosecart", for instance, with the JSON objects above, the code below would refer to the sandwich and mac & cheese.   
`
{
    "cart":[1,3]
}`

_______
## getting shopping list

Now that we have selected which recipes we want to make, you can collect your shopping list from "shoppingList" which will return an ordered list. For the code above we would recieve a return of:   
`[
    "bread",
    "cheese",
    "hame",
    "mac"
]`

____________________
# Key take aways

This project was excellent practice for Springboot web implementation. In addition, it helped to put me in the mindset of a developer creating an API.
