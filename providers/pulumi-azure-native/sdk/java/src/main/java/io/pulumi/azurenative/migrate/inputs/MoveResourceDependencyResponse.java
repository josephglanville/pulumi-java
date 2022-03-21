// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.AutomaticResolutionPropertiesResponse;
import io.pulumi.azurenative.migrate.inputs.ManualResolutionPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the dependency of the move resource.
 * 
 */
public final class MoveResourceDependencyResponse extends io.pulumi.resources.InvokeArgs {

    public static final MoveResourceDependencyResponse Empty = new MoveResourceDependencyResponse();

    /**
     * Defines the properties for automatic resolution.
     * 
     */
    @Import(name="automaticResolution")
      private final @Nullable AutomaticResolutionPropertiesResponse automaticResolution;

    public Optional<AutomaticResolutionPropertiesResponse> getAutomaticResolution() {
        return this.automaticResolution == null ? Optional.empty() : Optional.ofNullable(this.automaticResolution);
    }

    /**
     * Defines the dependency type.
     * 
     */
    @Import(name="dependencyType")
      private final @Nullable String dependencyType;

    public Optional<String> getDependencyType() {
        return this.dependencyType == null ? Optional.empty() : Optional.ofNullable(this.dependencyType);
    }

    /**
     * Gets the source ARM ID of the dependent resource.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Gets or sets a value indicating whether the dependency is optional.
     * 
     */
    @Import(name="isOptional")
      private final @Nullable String isOptional;

    public Optional<String> getIsOptional() {
        return this.isOptional == null ? Optional.empty() : Optional.ofNullable(this.isOptional);
    }

    /**
     * Defines the properties for manual resolution.
     * 
     */
    @Import(name="manualResolution")
      private final @Nullable ManualResolutionPropertiesResponse manualResolution;

    public Optional<ManualResolutionPropertiesResponse> getManualResolution() {
        return this.manualResolution == null ? Optional.empty() : Optional.ofNullable(this.manualResolution);
    }

    /**
     * Gets the dependency resolution status.
     * 
     */
    @Import(name="resolutionStatus")
      private final @Nullable String resolutionStatus;

    public Optional<String> getResolutionStatus() {
        return this.resolutionStatus == null ? Optional.empty() : Optional.ofNullable(this.resolutionStatus);
    }

    /**
     * Defines the resolution type.
     * 
     */
    @Import(name="resolutionType")
      private final @Nullable String resolutionType;

    public Optional<String> getResolutionType() {
        return this.resolutionType == null ? Optional.empty() : Optional.ofNullable(this.resolutionType);
    }

    public MoveResourceDependencyResponse(
        @Nullable AutomaticResolutionPropertiesResponse automaticResolution,
        @Nullable String dependencyType,
        @Nullable String id,
        @Nullable String isOptional,
        @Nullable ManualResolutionPropertiesResponse manualResolution,
        @Nullable String resolutionStatus,
        @Nullable String resolutionType) {
        this.automaticResolution = automaticResolution;
        this.dependencyType = dependencyType;
        this.id = id;
        this.isOptional = isOptional;
        this.manualResolution = manualResolution;
        this.resolutionStatus = resolutionStatus;
        this.resolutionType = resolutionType;
    }

    private MoveResourceDependencyResponse() {
        this.automaticResolution = null;
        this.dependencyType = null;
        this.id = null;
        this.isOptional = null;
        this.manualResolution = null;
        this.resolutionStatus = null;
        this.resolutionType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourceDependencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutomaticResolutionPropertiesResponse automaticResolution;
        private @Nullable String dependencyType;
        private @Nullable String id;
        private @Nullable String isOptional;
        private @Nullable ManualResolutionPropertiesResponse manualResolution;
        private @Nullable String resolutionStatus;
        private @Nullable String resolutionType;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourceDependencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticResolution = defaults.automaticResolution;
    	      this.dependencyType = defaults.dependencyType;
    	      this.id = defaults.id;
    	      this.isOptional = defaults.isOptional;
    	      this.manualResolution = defaults.manualResolution;
    	      this.resolutionStatus = defaults.resolutionStatus;
    	      this.resolutionType = defaults.resolutionType;
        }

        public Builder automaticResolution(@Nullable AutomaticResolutionPropertiesResponse automaticResolution) {
            this.automaticResolution = automaticResolution;
            return this;
        }
        public Builder dependencyType(@Nullable String dependencyType) {
            this.dependencyType = dependencyType;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder isOptional(@Nullable String isOptional) {
            this.isOptional = isOptional;
            return this;
        }
        public Builder manualResolution(@Nullable ManualResolutionPropertiesResponse manualResolution) {
            this.manualResolution = manualResolution;
            return this;
        }
        public Builder resolutionStatus(@Nullable String resolutionStatus) {
            this.resolutionStatus = resolutionStatus;
            return this;
        }
        public Builder resolutionType(@Nullable String resolutionType) {
            this.resolutionType = resolutionType;
            return this;
        }        public MoveResourceDependencyResponse build() {
            return new MoveResourceDependencyResponse(automaticResolution, dependencyType, id, isOptional, manualResolution, resolutionStatus, resolutionType);
        }
    }
}
