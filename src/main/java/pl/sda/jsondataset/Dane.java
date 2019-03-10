package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dane {
    private String fall;
    private Geolocation geolocation;
private String id;
private String mass;
private String name;
private String nametype;
private String recclass;
private String reclat;
private String reclong;
private String year;
}
