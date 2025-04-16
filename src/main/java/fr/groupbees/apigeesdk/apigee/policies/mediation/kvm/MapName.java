package fr.groupbees.apigeesdk.apigee.policies.mediation.kvm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapName {

  @JacksonXmlProperty(isAttribute = true, localName = "ref")
  @JsonProperty(value = "ref")
  private String ref;

}
