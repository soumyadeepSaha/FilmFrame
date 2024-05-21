1. first logical step will be to configure the database for our application so that we can successfully connect to the mongoDb Cluster that we have setup previously
2. goto-application.properties->(for mongoDB configuration)
3. ## spring.data.mongodb.database=movie-api-db
4. ## spring.data.mongodb.uri=mongodb+srv://soumyadeep:soum%402106@mern-estate.hu6awzx.mongodb.net/mern-estate
5. now we know putting the files in the github repository is dangerous 
6. so we will put them in .env inside resources
7.  the only problem with spring is that it does not support reading .env file out of the box
8. so we need to install a new dependency to our project to enable that
9. <dependency>
<groupId>me.paulschwarz</groupId>
<artifactId>spring-dotenv</artifactId>
</dependency>
10. now change the hardquoted values of the application.properties with the env file


In our application their are two types of data that we are going to work with one is he movies and anotheir a=their is the reviews

- So we need to first create two seperate classes for representing these two-entities in our application
- Inside class Movie()->
- after making the @Document annotation for the above class inorder to get the docs from the collection movies 
- - apply getters setters using lombok
- create the class Review - same way @Document->  rest(details inside the class)
- Now that we have our review and movie model ready to go we can go ahead and write our controllers
-
- Now since we have our movie module write here lets try touse it and pull some data from the database
- for that we need service class and repository class (repository are of type interface)
- give the table name and the id (to so call jpa type repository)

- Then create a service class MovieService(this class will not extend anything it willjust annotate @Service)
- now inside this class we will write the data base access method ..
- now after writing the service class we will go to our controller where we will need a refernce to our service class 
- so that we can do the same and initiate some functions using that..
- Now inside the getallmovies instead of returning a response Entity of type string change it to list..