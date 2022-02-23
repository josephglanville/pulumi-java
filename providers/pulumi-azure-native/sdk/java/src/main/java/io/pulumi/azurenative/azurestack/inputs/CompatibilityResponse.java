// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Product compatibility
 * 
 */
public final class CompatibilityResponse extends io.pulumi.resources.InvokeArgs {

    public static final CompatibilityResponse Empty = new CompatibilityResponse();

    /**
     * Full error message if any compatibility issues are found
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Tells if product is compatible with current device
     * 
     */
    @InputImport(name="isCompatible")
      private final @Nullable Boolean isCompatible;

    public Optional<Boolean> getIsCompatible() {
        return this.isCompatible == null ? Optional.empty() : Optional.ofNullable(this.isCompatible);
    }

    /**
     * List of all issues found
     * 
     */
    @InputImport(name="issues")
      private final @Nullable List<String> issues;

    public List<String> getIssues() {
        return this.issues == null ? List.of() : this.issues;
    }

    /**
     * Short error message if any compatibility issues are found
     * 
     */
    @InputImport(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    public CompatibilityResponse(
        @Nullable String description,
        @Nullable Boolean isCompatible,
        @Nullable List<String> issues,
        @Nullable String message) {
        this.description = description;
        this.isCompatible = isCompatible;
        this.issues = issues;
        this.message = message;
    }

    private CompatibilityResponse() {
        this.description = null;
        this.isCompatible = null;
        this.issues = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompatibilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean isCompatible;
        private @Nullable List<String> issues;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(CompatibilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.isCompatible = defaults.isCompatible;
    	      this.issues = defaults.issues;
    	      this.message = defaults.message;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIsCompatible(@Nullable Boolean isCompatible) {
            this.isCompatible = isCompatible;
            return this;
        }

        public Builder setIssues(@Nullable List<String> issues) {
            this.issues = issues;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }
        public CompatibilityResponse build() {
            return new CompatibilityResponse(description, isCompatible, issues, message);
        }
    }
}
