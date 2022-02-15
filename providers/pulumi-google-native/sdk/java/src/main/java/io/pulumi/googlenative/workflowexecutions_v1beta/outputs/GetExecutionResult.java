// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.workflowexecutions_v1beta.outputs.ErrorResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetExecutionResult {
    private final String argument;
    private final String callLogLevel;
    private final String endTime;
    private final ErrorResponse error;
    private final String name;
    private final String result;
    private final String startTime;
    private final String state;
    private final String workflowRevisionId;

    @OutputCustomType.Constructor({"argument","callLogLevel","endTime","error","name","result","startTime","state","workflowRevisionId"})
    private GetExecutionResult(
        String argument,
        String callLogLevel,
        String endTime,
        ErrorResponse error,
        String name,
        String result,
        String startTime,
        String state,
        String workflowRevisionId) {
        this.argument = Objects.requireNonNull(argument);
        this.callLogLevel = Objects.requireNonNull(callLogLevel);
        this.endTime = Objects.requireNonNull(endTime);
        this.error = Objects.requireNonNull(error);
        this.name = Objects.requireNonNull(name);
        this.result = Objects.requireNonNull(result);
        this.startTime = Objects.requireNonNull(startTime);
        this.state = Objects.requireNonNull(state);
        this.workflowRevisionId = Objects.requireNonNull(workflowRevisionId);
    }

    public String getArgument() {
        return this.argument;
    }
    public String getCallLogLevel() {
        return this.callLogLevel;
    }
    public String getEndTime() {
        return this.endTime;
    }
    public ErrorResponse getError() {
        return this.error;
    }
    public String getName() {
        return this.name;
    }
    public String getResult() {
        return this.result;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public String getState() {
        return this.state;
    }
    public String getWorkflowRevisionId() {
        return this.workflowRevisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExecutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String argument;
        private String callLogLevel;
        private String endTime;
        private ErrorResponse error;
        private String name;
        private String result;
        private String startTime;
        private String state;
        private String workflowRevisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExecutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argument = defaults.argument;
    	      this.callLogLevel = defaults.callLogLevel;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.result = defaults.result;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.workflowRevisionId = defaults.workflowRevisionId;
        }

        public Builder setArgument(String argument) {
            this.argument = Objects.requireNonNull(argument);
            return this;
        }

        public Builder setCallLogLevel(String callLogLevel) {
            this.callLogLevel = Objects.requireNonNull(callLogLevel);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setError(ErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setWorkflowRevisionId(String workflowRevisionId) {
            this.workflowRevisionId = Objects.requireNonNull(workflowRevisionId);
            return this;
        }

        public GetExecutionResult build() {
            return new GetExecutionResult(argument, callLogLevel, endTime, error, name, result, startTime, state, workflowRevisionId);
        }
    }
}