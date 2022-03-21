// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The action to take.
 * 
 */
public final class BucketLifecycleRuleItemActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketLifecycleRuleItemActionResponse Empty = new BucketLifecycleRuleItemActionResponse();

    /**
     * Target storage class. Required iff the type of the action is SetStorageClass.
     * 
     */
    @Import(name="storageClass", required=true)
      private final String storageClass;

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * Type of the action. Currently, only Delete and SetStorageClass are supported.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public BucketLifecycleRuleItemActionResponse(
        String storageClass,
        String type) {
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BucketLifecycleRuleItemActionResponse() {
        this.storageClass = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleItemActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String storageClass;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleItemActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageClass = defaults.storageClass;
    	      this.type = defaults.type;
        }

        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public BucketLifecycleRuleItemActionResponse build() {
            return new BucketLifecycleRuleItemActionResponse(storageClass, type);
        }
    }
}
