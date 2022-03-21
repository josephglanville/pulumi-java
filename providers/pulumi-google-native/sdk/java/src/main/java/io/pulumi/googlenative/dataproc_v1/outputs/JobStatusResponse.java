// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobStatusResponse {
    /**
     * Optional. Output only. Job state details, such as an error description if the state is ERROR.
     * 
     */
    private final String details;
    /**
     * A state message specifying the overall job state.
     * 
     */
    private final String state;
    /**
     * The time when this state was entered.
     * 
     */
    private final String stateStartTime;
    /**
     * Additional state information, which includes status reported by the agent.
     * 
     */
    private final String substate;

    @CustomType.Constructor
    private JobStatusResponse(
        @CustomType.Parameter("details") String details,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateStartTime") String stateStartTime,
        @CustomType.Parameter("substate") String substate) {
        this.details = details;
        this.state = state;
        this.stateStartTime = stateStartTime;
        this.substate = substate;
    }

    /**
     * Optional. Output only. Job state details, such as an error description if the state is ERROR.
     * 
    */
    public String getDetails() {
        return this.details;
    }
    /**
     * A state message specifying the overall job state.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The time when this state was entered.
     * 
    */
    public String getStateStartTime() {
        return this.stateStartTime;
    }
    /**
     * Additional state information, which includes status reported by the agent.
     * 
    */
    public String getSubstate() {
        return this.substate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String details;
        private String state;
        private String stateStartTime;
        private String substate;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder details(String details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateStartTime(String stateStartTime) {
            this.stateStartTime = Objects.requireNonNull(stateStartTime);
            return this;
        }
        public Builder substate(String substate) {
            this.substate = Objects.requireNonNull(substate);
            return this;
        }        public JobStatusResponse build() {
            return new JobStatusResponse(details, state, stateStartTime, substate);
        }
    }
}
