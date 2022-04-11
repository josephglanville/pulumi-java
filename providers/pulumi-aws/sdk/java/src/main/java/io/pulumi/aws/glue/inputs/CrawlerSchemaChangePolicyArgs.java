// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CrawlerSchemaChangePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerSchemaChangePolicyArgs Empty = new CrawlerSchemaChangePolicyArgs();

    /**
     * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
     * 
     */
    @Import(name="deleteBehavior")
      private final @Nullable Output<String> deleteBehavior;

    public Output<String> getDeleteBehavior() {
        return this.deleteBehavior == null ? Codegen.empty() : this.deleteBehavior;
    }

    /**
     * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
     * 
     */
    @Import(name="updateBehavior")
      private final @Nullable Output<String> updateBehavior;

    public Output<String> getUpdateBehavior() {
        return this.updateBehavior == null ? Codegen.empty() : this.updateBehavior;
    }

    public CrawlerSchemaChangePolicyArgs(
        @Nullable Output<String> deleteBehavior,
        @Nullable Output<String> updateBehavior) {
        this.deleteBehavior = deleteBehavior;
        this.updateBehavior = updateBehavior;
    }

    private CrawlerSchemaChangePolicyArgs() {
        this.deleteBehavior = Codegen.empty();
        this.updateBehavior = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerSchemaChangePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deleteBehavior;
        private @Nullable Output<String> updateBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerSchemaChangePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteBehavior = defaults.deleteBehavior;
    	      this.updateBehavior = defaults.updateBehavior;
        }

        public Builder deleteBehavior(@Nullable Output<String> deleteBehavior) {
            this.deleteBehavior = deleteBehavior;
            return this;
        }
        public Builder deleteBehavior(@Nullable String deleteBehavior) {
            this.deleteBehavior = Codegen.ofNullable(deleteBehavior);
            return this;
        }
        public Builder updateBehavior(@Nullable Output<String> updateBehavior) {
            this.updateBehavior = updateBehavior;
            return this;
        }
        public Builder updateBehavior(@Nullable String updateBehavior) {
            this.updateBehavior = Codegen.ofNullable(updateBehavior);
            return this;
        }        public CrawlerSchemaChangePolicyArgs build() {
            return new CrawlerSchemaChangePolicyArgs(deleteBehavior, updateBehavior);
        }
    }
}
