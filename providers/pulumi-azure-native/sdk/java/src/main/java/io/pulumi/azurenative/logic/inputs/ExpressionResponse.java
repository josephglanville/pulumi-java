// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AzureResourceErrorInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The expression.
 * 
 */
public final class ExpressionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExpressionResponse Empty = new ExpressionResponse();

    /**
     * The azure resource error info.
     * 
     */
    @InputImport(name="error")
      private final @Nullable AzureResourceErrorInfoResponse error;

    public Optional<AzureResourceErrorInfoResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    /**
     * The sub expressions.
     * 
     */
    @InputImport(name="subexpressions")
      private final @Nullable List<ExpressionResponse> subexpressions;

    public List<ExpressionResponse> getSubexpressions() {
        return this.subexpressions == null ? List.of() : this.subexpressions;
    }

    /**
     * The text.
     * 
     */
    @InputImport(name="text")
      private final @Nullable String text;

    public Optional<String> getText() {
        return this.text == null ? Optional.empty() : Optional.ofNullable(this.text);
    }

    @InputImport(name="value")
      private final @Nullable Object value;

    public Optional<Object> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ExpressionResponse(
        @Nullable AzureResourceErrorInfoResponse error,
        @Nullable List<ExpressionResponse> subexpressions,
        @Nullable String text,
        @Nullable Object value) {
        this.error = error;
        this.subexpressions = subexpressions;
        this.text = text;
        this.value = value;
    }

    private ExpressionResponse() {
        this.error = null;
        this.subexpressions = List.of();
        this.text = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureResourceErrorInfoResponse error;
        private @Nullable List<ExpressionResponse> subexpressions;
        private @Nullable String text;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.subexpressions = defaults.subexpressions;
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder setError(@Nullable AzureResourceErrorInfoResponse error) {
            this.error = error;
            return this;
        }

        public Builder setSubexpressions(@Nullable List<ExpressionResponse> subexpressions) {
            this.subexpressions = subexpressions;
            return this;
        }

        public Builder setText(@Nullable String text) {
            this.text = text;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }
        public ExpressionResponse build() {
            return new ExpressionResponse(error, subexpressions, text, value);
        }
    }
}
