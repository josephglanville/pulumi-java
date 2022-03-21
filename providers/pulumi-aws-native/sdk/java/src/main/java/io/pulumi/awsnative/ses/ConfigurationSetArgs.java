// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetArgs Empty = new ConfigurationSetArgs();

    /**
     * The name of the configuration set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ConfigurationSetArgs(@Nullable Output<String> name) {
        this.name = name;
    }

    private ConfigurationSetArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public ConfigurationSetArgs build() {
            return new ConfigurationSetArgs(name);
        }
    }
}
