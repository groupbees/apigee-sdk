package fr.groupbees.apigeesdk.problem;

import fr.groupbees.apigeesdk.utils.ErrorConstants;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class AppProblem extends AbstractThrowableProblem {

    public AppProblem(String msg) {
        super(ErrorConstants.DEFAULT_TYPE, "App Error", Status.INTERNAL_SERVER_ERROR, msg);
    }

}
