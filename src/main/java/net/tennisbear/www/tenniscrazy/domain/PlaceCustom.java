package net.tennisbear.www.tenniscrazy.domain;

import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(
        name = "PlaceCustom",
        types = { Place.class })
public interface PlaceCustom {
    String getDisplay_id();
    String getSection_id();
    String getSystem_id();
    String getPlace_id();
    String getPlace_name();
    String getPlace_url();
    String getAdress();
    BigDecimal getLatitude();
    BigDecimal getLongitude();
    String getOpen_hour_description();
    Boolean getChanging_room_flg();
    Boolean getShower_flg();
    Boolean getToilet_flg();
    Boolean getParking_flg();
    String getAccess();
}
