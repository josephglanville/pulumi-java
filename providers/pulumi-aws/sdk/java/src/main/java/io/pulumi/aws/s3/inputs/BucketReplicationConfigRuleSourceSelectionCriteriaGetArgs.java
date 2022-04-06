// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs Empty = new BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs();

    /**
     * A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * 
     */
    @Import(name="replicaModifications")
      private final @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs> replicaModifications;

    public Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs> getReplicaModifications() {
        return this.replicaModifications == null ? Output.empty() : this.replicaModifications;
    }

    /**
     * A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
     * 
     */
    @Import(name="sseKmsEncryptedObjects")
      private final @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs> sseKmsEncryptedObjects;

    public Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs> getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects == null ? Output.empty() : this.sseKmsEncryptedObjects;
    }

    public BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs(
        @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs> replicaModifications,
        @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs> sseKmsEncryptedObjects) {
        this.replicaModifications = replicaModifications;
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    private BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs() {
        this.replicaModifications = Output.empty();
        this.sseKmsEncryptedObjects = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs> replicaModifications;
        private @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs> sseKmsEncryptedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaModifications = defaults.replicaModifications;
    	      this.sseKmsEncryptedObjects = defaults.sseKmsEncryptedObjects;
        }

        public Builder replicaModifications(@Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs> replicaModifications) {
            this.replicaModifications = replicaModifications;
            return this;
        }
        public Builder replicaModifications(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsGetArgs replicaModifications) {
            this.replicaModifications = Output.ofNullable(replicaModifications);
            return this;
        }
        public Builder sseKmsEncryptedObjects(@Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs> sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }
        public Builder sseKmsEncryptedObjects(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = Output.ofNullable(sseKmsEncryptedObjects);
            return this;
        }        public BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs build() {
            return new BucketReplicationConfigRuleSourceSelectionCriteriaGetArgs(replicaModifications, sseKmsEncryptedObjects);
        }
    }
}