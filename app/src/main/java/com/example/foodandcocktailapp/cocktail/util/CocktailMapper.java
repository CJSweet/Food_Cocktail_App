package com.example.foodandcocktailapp.cocktail.util;


// This interface is for mapping an Entity to DomainModel and vice versa
public interface CocktailMapper<Entity, DomainModel> {

    // Entity will be the retrofit Cocktail object
    // DomainModel is the Cocktail application object

    DomainModel mapFromEntity(Entity entity);

    Entity mapToEntity(DomainModel domainModel);

}
