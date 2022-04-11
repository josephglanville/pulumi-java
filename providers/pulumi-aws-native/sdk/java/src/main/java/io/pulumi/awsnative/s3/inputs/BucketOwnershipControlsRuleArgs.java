// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketOwnershipControlsRuleObjectOwnership;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketOwnershipControlsRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketOwnershipControlsRuleArgs Empty = new BucketOwnershipControlsRuleArgs();

    /**
     * Specifies an object ownership rule.
     * 
     */
    @Import(name="objectOwnership")
      private final @Nullable Output<BucketOwnershipControlsRuleObjectOwnership> objectOwnership;

    public Output<BucketOwnershipControlsRuleObjectOwnership> getObjectOwnership() {
        return this.objectOwnership == null ? Codegen.empty() : this.objectOwnership;
    }

    public BucketOwnershipControlsRuleArgs(@Nullable Output<BucketOwnershipControlsRuleObjectOwnership> objectOwnership) {
        this.objectOwnership = objectOwnership;
    }

    private BucketOwnershipControlsRuleArgs() {
        this.objectOwnership = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketOwnershipControlsRuleObjectOwnership> objectOwnership;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectOwnership = defaults.objectOwnership;
        }

        public Builder objectOwnership(@Nullable Output<BucketOwnershipControlsRuleObjectOwnership> objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }
        public Builder objectOwnership(@Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
            this.objectOwnership = Codegen.ofNullable(objectOwnership);
            return this;
        }        public BucketOwnershipControlsRuleArgs build() {
            return new BucketOwnershipControlsRuleArgs(objectOwnership);
        }
    }
}
