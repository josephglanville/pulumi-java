// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar.deeply_nested_module;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    @Import(name="baz")
      private final @Nullable Output<String> baz;

    public Output<String> getBaz() {
        return this.baz == null ? Output.empty() : this.baz;
    }

    public ResourceArgs(@Nullable Output<String> baz) {
        this.baz = baz;
    }

    private ResourceArgs() {
        this.baz = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> baz;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baz = defaults.baz;
        }

        public Builder baz(@Nullable Output<String> baz) {
            this.baz = Output.ofNullable(baz).asSecret();
            return this;
        }
        public Builder baz(@Nullable String baz) {
            this.baz = Output.ofNullable(baz).asSecret();
            return this;
        }        public ResourceArgs build() {
            return new ResourceArgs(baz);
        }
    }
}
