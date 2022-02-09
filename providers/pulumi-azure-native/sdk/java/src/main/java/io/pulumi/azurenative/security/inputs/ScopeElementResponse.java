// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScopeElementResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScopeElementResponse Empty = new ScopeElementResponse();

    @InputImport(name="field")
    private final @Nullable String field;

    public Optional<String> getField() {
        return this.field == null ? Optional.empty() : Optional.ofNullable(this.field);
    }

    public ScopeElementResponse(@Nullable String field) {
        this.field = field;
    }

    private ScopeElementResponse() {
        this.field = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String field;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder setField(@Nullable String field) {
            this.field = field;
            return this;
        }

        public ScopeElementResponse build() {
            return new ScopeElementResponse(field);
        }
    }
}
