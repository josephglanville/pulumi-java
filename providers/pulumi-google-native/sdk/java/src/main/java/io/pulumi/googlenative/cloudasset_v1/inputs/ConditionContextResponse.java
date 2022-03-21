// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The IAM conditions context.
 * 
 */
public final class ConditionContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConditionContextResponse Empty = new ConditionContextResponse();

    /**
     * The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
     * 
     */
    @Import(name="accessTime", required=true)
      private final String accessTime;

    public String getAccessTime() {
        return this.accessTime;
    }

    public ConditionContextResponse(String accessTime) {
        this.accessTime = Objects.requireNonNull(accessTime, "expected parameter 'accessTime' to be non-null");
    }

    private ConditionContextResponse() {
        this.accessTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTime = defaults.accessTime;
        }

        public Builder accessTime(String accessTime) {
            this.accessTime = Objects.requireNonNull(accessTime);
            return this;
        }        public ConditionContextResponse build() {
            return new ConditionContextResponse(accessTime);
        }
    }
}
