// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrationProgressResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationProgressResponse Empty = new MigrationProgressResponse();

    @InputImport(name="completionPercentage")
    private final @Nullable Double completionPercentage;

    public Optional<Double> getCompletionPercentage() {
        return this.completionPercentage == null ? Optional.empty() : Optional.ofNullable(this.completionPercentage);
    }

    @InputImport(name="progressMessage")
    private final @Nullable String progressMessage;

    public Optional<String> getProgressMessage() {
        return this.progressMessage == null ? Optional.empty() : Optional.ofNullable(this.progressMessage);
    }

    public MigrationProgressResponse(
        @Nullable Double completionPercentage,
        @Nullable String progressMessage) {
        this.completionPercentage = completionPercentage;
        this.progressMessage = progressMessage;
    }

    private MigrationProgressResponse() {
        this.completionPercentage = null;
        this.progressMessage = null;
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

        public Builder setCompletionPercentage(@Nullable Double completionPercentage) {
            this.completionPercentage = completionPercentage;
            return this;
        }

        public Builder setProgressMessage(@Nullable String progressMessage) {
            this.progressMessage = progressMessage;
            return this;
        }

        public MigrationProgressResponse build() {
            return new MigrationProgressResponse(completionPercentage, progressMessage);
        }
    }
}
