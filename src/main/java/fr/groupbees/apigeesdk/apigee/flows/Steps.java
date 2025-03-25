package fr.groupbees.apigeesdk.apigee.flows;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import fr.groupbees.apigeesdk.apigee.policies.Policy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Steps {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Step")
    @JsonProperty(value = "step")
    private LinkedList<Step> steps = new LinkedList<>();

    public void appendSteps(final Step... step) {
        this.steps.addAll(Arrays.asList(step));
    }

    public void appendSteps(final Policy... policy) {
        this.steps.addAll(Arrays.stream(policy).map(Step::new).collect(Collectors.toList()));
    }

    public void prependSteps(final Step... steps) {
        LinkedList<Step> newSteps = new LinkedList<>();
        newSteps.addAll(Arrays.asList(steps));
        newSteps.addAll(this.steps);
        this.steps = newSteps;
    }

    public void prependSteps(final Policy... policy) {
        LinkedList<Step> newSteps = Arrays.stream(policy).map(Step::new).collect(Collectors.toCollection(LinkedList::new));
        newSteps.addAll(this.steps);
        this.steps = newSteps;
    }

}
