/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task.api.data;

import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;
import java.awt.image.BufferedImage;


public class Cloth {

    private final Integer id;
    private final String color;
    private final Integer rating;
    private final Season season;
    private final Integer size;
    private final Category category;
    private final Type type;
    private final Integer wornCount;
    private final BufferedImage image;

    public Cloth(Integer id, String color, Integer rating, Season season, Integer size, Category category, Type type, Integer wornCount, BufferedImage image) {
        this.id = id;
        this.color = color;
        this.rating = rating;
        this.season = season;
        this.size = size;
        this.category = category;
        this.type = type;
        this.wornCount = wornCount;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public Integer getRating() {
        return rating;
    }

    public Season getSeason() {
        return season;
    }

    public Integer getSize() {
        return size;
    }

    public Category getCategory() {
        return category;
    }

    public Type getType() {
        return type;
    }

    public Integer getWornCount() {
        return wornCount;
    }
    
    public BufferedImage getImage() {
        return image;
    }
    
    //ATTRIBUTES
    
    public static final SimpleAttribute<Cloth, Integer> CLOTH_ID = new SimpleAttribute<Cloth, Integer>("clothId") {
        @Override
        public Integer getValue(Cloth o, QueryOptions qo) {
            return o.getId();
        }
    };
    public static final SimpleAttribute<Cloth, String> CLOTH_COLOR = new SimpleAttribute<Cloth, String>("clothColor") {
        @Override
        public String getValue(Cloth o, QueryOptions qo) {
            return o.getColor();
        }
    };
    public static final SimpleAttribute<Cloth, Integer> CLOTH_RATING = new SimpleAttribute<Cloth, Integer>("clothRating") {
        @Override
        public Integer getValue(Cloth o, QueryOptions qo) {
            return o.getRating();
        }
    };
    public static final SimpleAttribute<Cloth, Season> CLOTH_SEASON = new SimpleAttribute<Cloth, Season>("clothSeason") {
        @Override
        public Season getValue(Cloth o, QueryOptions qo) {
            return o.getSeason();
        }
    };
    public static final SimpleAttribute<Cloth, Integer> CLOTH_SIZE = new SimpleAttribute<Cloth, Integer>("clothSize") {
        @Override
        public Integer getValue(Cloth o, QueryOptions qo) {
            return o.getSize();
        }
    };
    public static final SimpleAttribute<Cloth, Category> CLOTH_CATEGORY = new SimpleAttribute<Cloth, Category>("clothCategory") {
        @Override
        public Category getValue(Cloth o, QueryOptions qo) {
            return o.getCategory();
        }
    };
    public static final SimpleAttribute<Cloth, Type> CLOTH_TYPE = new SimpleAttribute<Cloth, Type>("clothType") {
        @Override
        public Type getValue(Cloth o, QueryOptions qo) {
            return o.getType();
        }
    };
    public static final SimpleAttribute<Cloth, Integer> CLOTH_WORNCOUNT = new SimpleAttribute<Cloth, Integer>("clothWornCount") {
        @Override
        public Integer getValue(Cloth o, QueryOptions qo) {
            return o.getWornCount();
        }
    };
    public static final SimpleAttribute<Cloth, BufferedImage> CLOTH_IMAGE = new SimpleAttribute<Cloth, BufferedImage>("clothImage") {
        @Override
        public BufferedImage getValue(Cloth o, QueryOptions qo) {
            return o.getImage();
        }
    };
    
}
