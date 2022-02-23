// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontEndConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FrontEndConfigurationResponse Empty = new FrontEndConfigurationResponse();

    @InputImport(name="kind")
      private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    public FrontEndConfigurationResponse(@Nullable String kind) {
        this.kind = kind;
    }

    private FrontEndConfigurationResponse() {
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontEndConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontEndConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public FrontEndConfigurationResponse build() {
            return new FrontEndConfigurationResponse(kind);
        }
    }
}
