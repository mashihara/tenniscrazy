package net.tennisbear.www.tenniscrazy.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="MT_PLACE")
public class Place {
    @Id
    private String display_id;
    private String section_id;
    private String system_id;
    private String place_id;
    private String place_name;
    private String place_url;
    private String adress;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String open_hour_description;
    private Boolean changing_room_flg;
    private Boolean shower_flg;
    private Boolean toilet_flg;
    private Boolean parking_flg;
    private String access;
}
