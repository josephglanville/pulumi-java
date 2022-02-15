// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConsortiumResponse {
    private final @Nullable String name;
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"name","protocol"})
    private ConsortiumResponse(
        @Nullable String name,
        @Nullable String protocol) {
        this.name = name;
        this.protocol = protocol;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsortiumResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsortiumResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public ConsortiumResponse build() {
            return new ConsortiumResponse(name, protocol);
        }
    }
}