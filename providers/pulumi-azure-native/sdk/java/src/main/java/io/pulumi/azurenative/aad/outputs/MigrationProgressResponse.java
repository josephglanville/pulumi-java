// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrationProgressResponse {
    /**
     * Completion Percentage
     * 
     */
    private final @Nullable Double completionPercentage;
    /**
     * Progress Message
     * 
     */
    private final @Nullable String progressMessage;

    @CustomType.Constructor
    private MigrationProgressResponse(
        @CustomType.Parameter("completionPercentage") @Nullable Double completionPercentage,
        @CustomType.Parameter("progressMessage") @Nullable String progressMessage) {
        this.completionPercentage = completionPercentage;
        this.progressMessage = progressMessage;
    }

    /**
     * Completion Percentage
     * 
    */
    public Optional<Double> getCompletionPercentage() {
        return Optional.ofNullable(this.completionPercentage);
    }
    /**
     * Progress Message
     * 
    */
    public Optional<String> getProgressMessage() {
        return Optional.ofNullable(this.progressMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double completionPercentage;
        private @Nullable String progressMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionPercentage = defaults.completionPercentage;
    	      this.progressMessage = defaults.progressMessage;
        }

        public Builder completionPercentage(@Nullable Double completionPercentage) {
            this.completionPercentage = completionPercentage;
            return this;
        }
        public Builder progressMessage(@Nullable String progressMessage) {
            this.progressMessage = progressMessage;
            return this;
        }        public MigrationProgressResponse build() {
            return new MigrationProgressResponse(completionPercentage, progressMessage);
        }
    }
}
