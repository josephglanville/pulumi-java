// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BoolEqualsAdvancedFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final BoolEqualsAdvancedFilterResponse Empty = new BoolEqualsAdvancedFilterResponse();

    @InputImport(name="key")
    private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    @InputImport(name="operatorType", required=true)
    private final String operatorType;

    public String getOperatorType() {
        return this.operatorType;
    }

    @InputImport(name="value")
    private final @Nullable Boolean value;

    public Optional<Boolean> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public BoolEqualsAdvancedFilterResponse(
        @Nullable String key,
        String operatorType,
        @Nullable Boolean value) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.value = value;
    }

    private BoolEqualsAdvancedFilterResponse() {
        this.key = null;
        this.operatorType = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoolEqualsAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable Boolean value;

        public Builder() {
    	      // Empty
        }

        public Builder(BoolEqualsAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder setValue(@Nullable Boolean value) {
            this.value = value;
            return this;
        }

        public BoolEqualsAdvancedFilterResponse build() {
            return new BoolEqualsAdvancedFilterResponse(key, operatorType, value);
        }
    }
}
