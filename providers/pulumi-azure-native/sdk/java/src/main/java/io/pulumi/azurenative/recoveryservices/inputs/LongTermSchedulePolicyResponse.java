// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LongTermSchedulePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final LongTermSchedulePolicyResponse Empty = new LongTermSchedulePolicyResponse();

    @InputImport(name="schedulePolicyType", required=true)
    private final String schedulePolicyType;

    public String getSchedulePolicyType() {
        return this.schedulePolicyType;
    }

    public LongTermSchedulePolicyResponse(String schedulePolicyType) {
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType, "expected parameter 'schedulePolicyType' to be non-null");
    }

    private LongTermSchedulePolicyResponse() {
        this.schedulePolicyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedulePolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulePolicyType = defaults.schedulePolicyType;
        }

        public Builder setSchedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }

        public LongTermSchedulePolicyResponse build() {
            return new LongTermSchedulePolicyResponse(schedulePolicyType);
        }
    }
}
