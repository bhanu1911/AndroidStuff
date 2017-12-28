package io.github.bhanu1911.foodohotellist;

/**
 * Created by fkinuseless on 17/12/17.
 */

public class HotelList {
    int image;
    String Restaurant;
    String Cuisine;
    String PriceRange;
    String DeliveryTime;
    boolean Favorite;

    public HotelList(int image, String Restaurant, String Cuisine, String PriceRange, String DeliveryTime, boolean Favorite) {
           this.image = image;
           this.Restaurant = Restaurant;
           this.Cuisine = Cuisine;
           this.DeliveryTime = DeliveryTime;
           this.PriceRange = PriceRange;
           this.Favorite = Favorite;
    }

    public int getImage() {
        return image;
    }

    public String getRestaurant() {
        return Restaurant;
    }

    public String getCuisine() {
        return Cuisine;
    }

    public String getPriceRange() {
        return PriceRange;
    }

    public String getDeliveryTime() {
        return DeliveryTime;
    }

    public boolean isFavorite() {
        return Favorite;
    }
}
