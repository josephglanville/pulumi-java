// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCompositeAlarmArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCompositeAlarmArgs Empty = new GetCompositeAlarmArgs();

    /**
     * The name of the Composite Alarm
     * 
     */
    @Import(name="alarmName", required=true)
      private final String alarmName;

    public String getAlarmName() {
        return this.alarmName;
    }

    public GetCompositeAlarmArgs(String alarmName) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
    }

    private GetCompositeAlarmArgs() {
        this.alarmName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompositeAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompositeAlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }        public GetCompositeAlarmArgs build() {
            return new GetCompositeAlarmArgs(alarmName);
        }
    }
}
