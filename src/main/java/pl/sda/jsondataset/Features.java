package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Features {
    private String type;
    private Properties properties;
    private Geometry geometry;
    private String id;

}
