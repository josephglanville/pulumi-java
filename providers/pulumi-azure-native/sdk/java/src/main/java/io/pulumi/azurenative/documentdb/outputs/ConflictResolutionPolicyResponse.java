// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConflictResolutionPolicyResponse {
    private final @Nullable String conflictResolutionPath;
    private final @Nullable String conflictResolutionProcedure;
    private final @Nullable String mode;

    @OutputCustomType.Constructor({"conflictResolutionPath","conflictResolutionProcedure","mode"})
    private ConflictResolutionPolicyResponse(
        @Nullable String conflictResolutionPath,
        @Nullable String conflictResolutionProcedure,
        @Nullable String mode) {
        this.conflictResolutionPath = conflictResolutionPath;
        this.conflictResolutionProcedure = conflictResolutionProcedure;
        this.mode = mode;
    }

    public Optional<String> getConflictResolutionPath() {
        return Optional.ofNullable(this.conflictResolutionPath);
    }
    public Optional<String> getConflictResolutionProcedure() {
        return Optional.ofNullable(this.conflictResolutionProcedure);
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConflictResolutionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conflictResolutionPath;
        private @Nullable String conflictResolutionProcedure;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ConflictResolutionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictResolutionPath = defaults.conflictResolutionPath;
    	      this.conflictResolutionProcedure = defaults.conflictResolutionProcedure;
    	      this.mode = defaults.mode;
        }

        public Builder setConflictResolutionPath(@Nullable String conflictResolutionPath) {
            this.conflictResolutionPath = conflictResolutionPath;
            return this;
        }

        public Builder setConflictResolutionProcedure(@Nullable String conflictResolutionProcedure) {
            this.conflictResolutionProcedure = conflictResolutionProcedure;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public ConflictResolutionPolicyResponse build() {
            return new ConflictResolutionPolicyResponse(conflictResolutionPath, conflictResolutionProcedure, mode);
        }
    }
}
