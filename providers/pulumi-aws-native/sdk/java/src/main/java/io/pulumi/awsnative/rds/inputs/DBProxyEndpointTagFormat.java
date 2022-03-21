// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DBProxyEndpointTagFormat extends io.pulumi.resources.InvokeArgs {

    public static final DBProxyEndpointTagFormat Empty = new DBProxyEndpointTagFormat();

    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public DBProxyEndpointTagFormat(
        @Nullable String key,
        @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    private DBProxyEndpointTagFormat() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyEndpointTagFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyEndpointTagFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public DBProxyEndpointTagFormat build() {
            return new DBProxyEndpointTagFormat(key, value);
        }
    }
}
