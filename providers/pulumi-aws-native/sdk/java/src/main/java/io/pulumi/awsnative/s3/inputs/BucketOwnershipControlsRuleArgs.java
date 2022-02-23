// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketOwnershipControlsRuleObjectOwnership;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketOwnershipControlsRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketOwnershipControlsRuleArgs Empty = new BucketOwnershipControlsRuleArgs();

    /**
     * Specifies an object ownership rule.
     * 
     */
    @InputImport(name="objectOwnership")
      private final @Nullable Input<BucketOwnershipControlsRuleObjectOwnership> objectOwnership;

    public Input<BucketOwnershipControlsRuleObjectOwnership> getObjectOwnership() {
        return this.objectOwnership == null ? Input.empty() : this.objectOwnership;
    }

    public BucketOwnershipControlsRuleArgs(@Nullable Input<BucketOwnershipControlsRuleObjectOwnership> objectOwnership) {
        this.objectOwnership = objectOwnership;
    }

    private BucketOwnershipControlsRuleArgs() {
        this.objectOwnership = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketOwnershipControlsRuleObjectOwnership> objectOwnership;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectOwnership = defaults.objectOwnership;
        }

        public Builder setObjectOwnership(@Nullable Input<BucketOwnershipControlsRuleObjectOwnership> objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }

        public Builder setObjectOwnership(@Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
            this.objectOwnership = Input.ofNullable(objectOwnership);
            return this;
        }
        public BucketOwnershipControlsRuleArgs build() {
            return new BucketOwnershipControlsRuleArgs(objectOwnership);
        }
    }
}
