// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JsonFieldResponse extends io.pulumi.resources.InvokeArgs {

    public static final JsonFieldResponse Empty = new JsonFieldResponse();

    @InputImport(name="sourceField")
    private final @Nullable String sourceField;

    public Optional<String> getSourceField() {
        return this.sourceField == null ? Optional.empty() : Optional.ofNullable(this.sourceField);
    }

    public JsonFieldResponse(@Nullable String sourceField) {
        this.sourceField = sourceField;
    }

    private JsonFieldResponse() {
        this.sourceField = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceField;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceField = defaults.sourceField;
        }

        public Builder setSourceField(@Nullable String sourceField) {
            this.sourceField = sourceField;
            return this;
        }

        public JsonFieldResponse build() {
            return new JsonFieldResponse(sourceField);
        }
    }
}
