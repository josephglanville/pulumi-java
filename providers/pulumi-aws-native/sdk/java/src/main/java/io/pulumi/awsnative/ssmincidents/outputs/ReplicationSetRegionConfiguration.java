// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReplicationSetRegionConfiguration {
    private final String sseKmsKeyId;

    @CustomType.Constructor
    private ReplicationSetRegionConfiguration(@CustomType.Parameter("sseKmsKeyId") String sseKmsKeyId) {
        this.sseKmsKeyId = sseKmsKeyId;
    }

    public String getSseKmsKeyId() {
        return this.sseKmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSetRegionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sseKmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSetRegionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sseKmsKeyId = defaults.sseKmsKeyId;
        }

        public Builder sseKmsKeyId(String sseKmsKeyId) {
            this.sseKmsKeyId = Objects.requireNonNull(sseKmsKeyId);
            return this;
        }        public ReplicationSetRegionConfiguration build() {
            return new ReplicationSetRegionConfiguration(sseKmsKeyId);
        }
    }
}
