# CRUD API for Animal Database
This API allows users to perform CRUD (Create, Read, Update, Delete) operations on an animal database. The following endpoints are available:


## API Endpoints
Use POSTMAN to try the following endpoints:

## Get list of Animals

### Request

    `GET /animal/all`

    `http://localhost:8080/animal/all`

   
### Response

     [
   
     {
    "animal_id": 1,
    "name": "Elephant",
    "species": "Mammal",
    "habitat": "Savannah",
    "description": "Large mammal",
    "scientific_name": "Loxodonta africana"
    }   
     ]

## Get a specific Animal

### Request

`GET /animal/{animalId}`

`http://localhost:8080/animal/1`

### Response

    {
    "animal_id": 1,
    "name": "Elephant",
    "species": "Mammal",
    "habitat": "Savannah",
    "description": "Large mammal",
    "scientific_name": "Loxodonta africana"
    }

     
## Create a new Animal

### Request

    `POST /animal/new`
    
    `http://localhost:8080/animal/new` --data '{ "name": "species", "habitat": "description", "scientific_name"}'

   ### Response
   
   {
   "message": "Animal added successfully",
   "animal": 
   {
   "animal_id": 2,
   "name": "Lion",
   "species": "Mammal",
   "habitat": "Savannah",
   "description": "Big cat",
   "scientific_name": "Panthera leo"
  }
  }


## Update an existing Animal

### Request

    `PUT /animal/update/{animalId}`
    
    `http://localhost:8080/animal/update/1` --data '{ "name": "species", "habitat": "description", "scientific_name"}'

   ### Response
   
   {
   "message": "Animal updated successfully",
   "animal": 
   {
   "animal_id": 1,
   "name": "Elephant",
   "species": "Mammal",
   "habitat": "Forest",
   "description": "Large mammal with tusks",
   "scientific_name": "Loxodonta africana"
   }
   }


## Delete an Animal

### Request

    `DELETE /animal/delete/{animalId}`
    
    `http://localhost:8080/animal/delete/1`

   ### Response
   
   {
   "message": "Animal deleted successfully"
   }
  
