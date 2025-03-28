package fr.groupbees.apigeesdk.apigee.policies.security.regexpprotection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JSONPath {

    @JacksonXmlProperty(localName = "Expression")
    @JsonProperty(value = "expression")
    private String expression;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Pattern")
    @JsonProperty(value = "pattern")
    private List<String> patterns;

}
