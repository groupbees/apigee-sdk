package fr.groupbees.apigeesdk.apigee.policies.extension.messagelogging;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudLogging {

    @JacksonXmlProperty(localName = "LogName")
    @JsonProperty(value = "logName")
    private String logName;

    @JacksonXmlProperty(localName = "Message")
    @JsonProperty(value = "message")
    private Message message;

    @JacksonXmlProperty(localName = "Labels")
    @JsonProperty(value = "labels")
    private Labels labels;

}
