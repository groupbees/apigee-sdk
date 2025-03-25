package fr.groupbees.apigeesdk.apigee.policies.extension.messagelogging;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Label {

    @JacksonXmlProperty(localName = "Key")
    @JsonProperty(value = "key")
    private String key;

    @JacksonXmlProperty(localName = "Value")
    @JsonProperty(value = "value")
    private String value;

}
