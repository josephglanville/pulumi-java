// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionParameterArgs Empty = new ConnectionParameterArgs();

    @Import(name="isValueSecret")
      private final @Nullable Output<Boolean> isValueSecret;

    public Output<Boolean> getIsValueSecret() {
        return this.isValueSecret == null ? Output.empty() : this.isValueSecret;
    }

    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public ConnectionParameterArgs(
        @Nullable Output<Boolean> isValueSecret,
        Output<String> key,
        Output<String> value) {
        this.isValueSecret = isValueSecret;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ConnectionParameterArgs() {
        this.isValueSecret = Output.empty();
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isValueSecret;
        private Output<String> key;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isValueSecret = defaults.isValueSecret;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder isValueSecret(@Nullable Output<Boolean> isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public Builder isValueSecret(@Nullable Boolean isValueSecret) {
            this.isValueSecret = Output.ofNullable(isValueSecret);
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ConnectionParameterArgs build() {
            return new ConnectionParameterArgs(isValueSecret, key, value);
        }
    }
}
