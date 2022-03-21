// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a change made to a configuration.
 * 
 */
public final class MutationRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final MutationRecordResponse Empty = new MutationRecordResponse();

    /**
     * When the change occurred.
     * 
     */
    @Import(name="mutateTime", required=true)
      private final String mutateTime;

    public String getMutateTime() {
        return this.mutateTime;
    }

    /**
     * The email address of the user making the change.
     * 
     */
    @Import(name="mutatedBy", required=true)
      private final String mutatedBy;

    public String getMutatedBy() {
        return this.mutatedBy;
    }

    public MutationRecordResponse(
        String mutateTime,
        String mutatedBy) {
        this.mutateTime = Objects.requireNonNull(mutateTime, "expected parameter 'mutateTime' to be non-null");
        this.mutatedBy = Objects.requireNonNull(mutatedBy, "expected parameter 'mutatedBy' to be non-null");
    }

    private MutationRecordResponse() {
        this.mutateTime = null;
        this.mutatedBy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutationRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mutateTime;
        private String mutatedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(MutationRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mutateTime = defaults.mutateTime;
    	      this.mutatedBy = defaults.mutatedBy;
        }

        public Builder mutateTime(String mutateTime) {
            this.mutateTime = Objects.requireNonNull(mutateTime);
            return this;
        }
        public Builder mutatedBy(String mutatedBy) {
            this.mutatedBy = Objects.requireNonNull(mutatedBy);
            return this;
        }        public MutationRecordResponse build() {
            return new MutationRecordResponse(mutateTime, mutatedBy);
        }
    }
}
