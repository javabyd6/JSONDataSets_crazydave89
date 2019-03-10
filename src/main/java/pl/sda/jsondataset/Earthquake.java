package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Earthquake {
private String type;
private Metadata metadata;
private List<Features> features;
private List<Double> bbox;

}
