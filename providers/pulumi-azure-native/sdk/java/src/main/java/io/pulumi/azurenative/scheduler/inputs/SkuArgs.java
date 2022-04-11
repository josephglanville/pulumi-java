// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.SkuDefinition;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * Gets or set the SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<SkuDefinition> name;

    public Output<SkuDefinition> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public SkuArgs(@Nullable Output<SkuDefinition> name) {
        this.name = name;
    }

    private SkuArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SkuDefinition> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<SkuDefinition> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable SkuDefinition name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public SkuArgs build() {
            return new SkuArgs(name);
        }
    }
}
