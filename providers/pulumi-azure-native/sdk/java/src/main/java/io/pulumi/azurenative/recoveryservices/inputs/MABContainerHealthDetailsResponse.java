// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MABContainerHealthDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MABContainerHealthDetailsResponse Empty = new MABContainerHealthDetailsResponse();

    @InputImport(name="code")
    private final @Nullable Integer code;

    public Optional<Integer> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="recommendations")
    private final @Nullable List<String> recommendations;

    public List<String> getRecommendations() {
        return this.recommendations == null ? List.of() : this.recommendations;
    }

    @InputImport(name="title")
    private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    public MABContainerHealthDetailsResponse(
        @Nullable Integer code,
        @Nullable String message,
        @Nullable List<String> recommendations,
        @Nullable String title) {
        this.code = code;
        this.message = message;
        this.recommendations = recommendations;
        this.title = title;
    }

    private MABContainerHealthDetailsResponse() {
        this.code = null;
        this.message = null;
        this.recommendations = List.of();
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MABContainerHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String message;
        private @Nullable List<String> recommendations;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(MABContainerHealthDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.recommendations = defaults.recommendations;
    	      this.title = defaults.title;
        }

        public Builder setCode(@Nullable Integer code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setRecommendations(@Nullable List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public MABContainerHealthDetailsResponse build() {
            return new MABContainerHealthDetailsResponse(code, message, recommendations, title);
        }
    }
}
