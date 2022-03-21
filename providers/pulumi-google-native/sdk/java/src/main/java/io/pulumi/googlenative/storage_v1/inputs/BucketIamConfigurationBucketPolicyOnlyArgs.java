// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The bucket's uniform bucket-level access configuration. The feature was formerly known as Bucket Policy Only. For backward compatibility, this field will be populated with identical information as the uniformBucketLevelAccess field. We recommend using the uniformBucketLevelAccess field to enable and disable the feature.
 * 
 */
public final class BucketIamConfigurationBucketPolicyOnlyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIamConfigurationBucketPolicyOnlyArgs Empty = new BucketIamConfigurationBucketPolicyOnlyArgs();

    /**
     * If set, access is controlled only by bucket-level or above IAM policies.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The deadline for changing iamConfiguration.bucketPolicyOnly.enabled from true to false in RFC 3339 format. iamConfiguration.bucketPolicyOnly.enabled may be changed from true to false until the locked time, after which the field is immutable.
     * 
     */
    @Import(name="lockedTime")
      private final @Nullable Output<String> lockedTime;

    public Output<String> getLockedTime() {
        return this.lockedTime == null ? Output.empty() : this.lockedTime;
    }

    public BucketIamConfigurationBucketPolicyOnlyArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> lockedTime) {
        this.enabled = enabled;
        this.lockedTime = lockedTime;
    }

    private BucketIamConfigurationBucketPolicyOnlyArgs() {
        this.enabled = Output.empty();
        this.lockedTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamConfigurationBucketPolicyOnlyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> lockedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamConfigurationBucketPolicyOnlyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.lockedTime = defaults.lockedTime;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder lockedTime(@Nullable Output<String> lockedTime) {
            this.lockedTime = lockedTime;
            return this;
        }
        public Builder lockedTime(@Nullable String lockedTime) {
            this.lockedTime = Output.ofNullable(lockedTime);
            return this;
        }        public BucketIamConfigurationBucketPolicyOnlyArgs build() {
            return new BucketIamConfigurationBucketPolicyOnlyArgs(enabled, lockedTime);
        }
    }
}
