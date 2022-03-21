// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusArgs Empty = new JobStatusArgs();

    @Import(name="details")
      private final @Nullable Output<String> details;

    public Output<String> getDetails() {
        return this.details == null ? Output.empty() : this.details;
    }

    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    @Import(name="stateStartTime")
      private final @Nullable Output<String> stateStartTime;

    public Output<String> getStateStartTime() {
        return this.stateStartTime == null ? Output.empty() : this.stateStartTime;
    }

    @Import(name="substate")
      private final @Nullable Output<String> substate;

    public Output<String> getSubstate() {
        return this.substate == null ? Output.empty() : this.substate;
    }

    public JobStatusArgs(
        @Nullable Output<String> details,
        @Nullable Output<String> state,
        @Nullable Output<String> stateStartTime,
        @Nullable Output<String> substate) {
        this.details = details;
        this.state = state;
        this.stateStartTime = stateStartTime;
        this.substate = substate;
    }

    private JobStatusArgs() {
        this.details = Output.empty();
        this.state = Output.empty();
        this.stateStartTime = Output.empty();
        this.substate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> details;
        private @Nullable Output<String> state;
        private @Nullable Output<String> stateStartTime;
        private @Nullable Output<String> substate;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder details(@Nullable Output<String> details) {
            this.details = details;
            return this;
        }
        public Builder details(@Nullable String details) {
            this.details = Output.ofNullable(details);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder stateStartTime(@Nullable Output<String> stateStartTime) {
            this.stateStartTime = stateStartTime;
            return this;
        }
        public Builder stateStartTime(@Nullable String stateStartTime) {
            this.stateStartTime = Output.ofNullable(stateStartTime);
            return this;
        }
        public Builder substate(@Nullable Output<String> substate) {
            this.substate = substate;
            return this;
        }
        public Builder substate(@Nullable String substate) {
            this.substate = Output.ofNullable(substate);
            return this;
        }        public JobStatusArgs build() {
            return new JobStatusArgs(details, state, stateStartTime, substate);
        }
    }
}
