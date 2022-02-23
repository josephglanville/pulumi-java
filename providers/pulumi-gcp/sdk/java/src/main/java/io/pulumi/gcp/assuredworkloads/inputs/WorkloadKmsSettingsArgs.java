// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.assuredworkloads.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WorkloadKmsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadKmsSettingsArgs Empty = new WorkloadKmsSettingsArgs();

    /**
     * Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    @InputImport(name="nextRotationTime", required=true)
      private final Input<String> nextRotationTime;

    public Input<String> getNextRotationTime() {
        return this.nextRotationTime;
    }

    /**
     * Required. Input only. Immutable. will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    @InputImport(name="rotationPeriod", required=true)
      private final Input<String> rotationPeriod;

    public Input<String> getRotationPeriod() {
        return this.rotationPeriod;
    }

    public WorkloadKmsSettingsArgs(
        Input<String> nextRotationTime,
        Input<String> rotationPeriod) {
        this.nextRotationTime = Objects.requireNonNull(nextRotationTime, "expected parameter 'nextRotationTime' to be non-null");
        this.rotationPeriod = Objects.requireNonNull(rotationPeriod, "expected parameter 'rotationPeriod' to be non-null");
    }

    private WorkloadKmsSettingsArgs() {
        this.nextRotationTime = Input.empty();
        this.rotationPeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadKmsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> nextRotationTime;
        private Input<String> rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadKmsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder setNextRotationTime(Input<String> nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }

        public Builder setNextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Input.of(Objects.requireNonNull(nextRotationTime));
            return this;
        }

        public Builder setRotationPeriod(Input<String> rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }

        public Builder setRotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Input.of(Objects.requireNonNull(rotationPeriod));
            return this;
        }
        public WorkloadKmsSettingsArgs build() {
            return new WorkloadKmsSettingsArgs(nextRotationTime, rotationPeriod);
        }
    }
}
