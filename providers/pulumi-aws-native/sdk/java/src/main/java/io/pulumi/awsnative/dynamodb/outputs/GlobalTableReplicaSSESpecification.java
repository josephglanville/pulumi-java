// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlobalTableReplicaSSESpecification {
    private final String kMSMasterKeyId;

    @CustomType.Constructor
    private GlobalTableReplicaSSESpecification(@CustomType.Parameter("kMSMasterKeyId") String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    public String getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaSSESpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kMSMasterKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaSSESpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kMSMasterKeyId = defaults.kMSMasterKeyId;
        }

        public Builder kMSMasterKeyId(String kMSMasterKeyId) {
            this.kMSMasterKeyId = Objects.requireNonNull(kMSMasterKeyId);
            return this;
        }        public GlobalTableReplicaSSESpecification build() {
            return new GlobalTableReplicaSSESpecification(kMSMasterKeyId);
        }
    }
}
