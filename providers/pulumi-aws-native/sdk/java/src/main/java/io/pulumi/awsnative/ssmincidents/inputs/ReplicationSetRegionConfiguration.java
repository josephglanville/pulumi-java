// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The ReplicationSet regional configuration.
 * 
 */
public final class ReplicationSetRegionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ReplicationSetRegionConfiguration Empty = new ReplicationSetRegionConfiguration();

    @InputImport(name="sseKmsKeyId", required=true)
      private final String sseKmsKeyId;

    public String getSseKmsKeyId() {
        return this.sseKmsKeyId;
    }

    public ReplicationSetRegionConfiguration(String sseKmsKeyId) {
        this.sseKmsKeyId = Objects.requireNonNull(sseKmsKeyId, "expected parameter 'sseKmsKeyId' to be non-null");
    }

    private ReplicationSetRegionConfiguration() {
        this.sseKmsKeyId = null;
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

        public Builder setSseKmsKeyId(String sseKmsKeyId) {
            this.sseKmsKeyId = Objects.requireNonNull(sseKmsKeyId);
            return this;
        }
        public ReplicationSetRegionConfiguration build() {
            return new ReplicationSetRegionConfiguration(sseKmsKeyId);
        }
    }
}
