// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCounterOptionsCustomFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigCounterOptionsCustomFieldArgs Empty = new LogConfigCounterOptionsCustomFieldArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public LogConfigCounterOptionsCustomFieldArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> value) {
        this.name = name;
        this.value = value;
    }

    private LogConfigCounterOptionsCustomFieldArgs() {
        this.name = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsCustomFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsCustomFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public LogConfigCounterOptionsCustomFieldArgs build() {
            return new LogConfigCounterOptionsCustomFieldArgs(name, value);
        }
    }
}
