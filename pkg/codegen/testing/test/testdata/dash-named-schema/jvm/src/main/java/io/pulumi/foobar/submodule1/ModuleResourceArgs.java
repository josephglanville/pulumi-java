// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar.submodule1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.foobar.inputs.TopLevelArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModuleResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleResourceArgs Empty = new ModuleResourceArgs();

    @Import(name="thing")
      private final @Nullable Output<TopLevelArgs> thing;

    public Output<TopLevelArgs> getThing() {
        return this.thing == null ? Output.empty() : this.thing;
    }

    public ModuleResourceArgs(@Nullable Output<TopLevelArgs> thing) {
        this.thing = thing;
    }

    private ModuleResourceArgs() {
        this.thing = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopLevelArgs> thing;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thing = defaults.thing;
        }

        public Builder thing(@Nullable Output<TopLevelArgs> thing) {
            this.thing = thing;
            return this;
        }
        public Builder thing(@Nullable TopLevelArgs thing) {
            this.thing = Output.ofNullable(thing);
            return this;
        }        public ModuleResourceArgs build() {
            return new ModuleResourceArgs(thing);
        }
    }
}
