// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datafusion_v1.enums.VersionType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Data Fusion version. This proto message stores information about certain Data Fusion version, which is used for Data Fusion version upgrade.
 * 
 */
public final class VersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    /**
     * Represents a list of available feature names for a given version.
     * 
     */
    @Import(name="availableFeatures")
      private final @Nullable Output<List<String>> availableFeatures;

    public Output<List<String>> getAvailableFeatures() {
        return this.availableFeatures == null ? Codegen.empty() : this.availableFeatures;
    }

    /**
     * Whether this is currently the default version for Cloud Data Fusion
     * 
     */
    @Import(name="defaultVersion")
      private final @Nullable Output<Boolean> defaultVersion;

    public Output<Boolean> getDefaultVersion() {
        return this.defaultVersion == null ? Codegen.empty() : this.defaultVersion;
    }

    /**
     * Type represents the release availability of the version
     * 
     */
    @Import(name="type")
      private final @Nullable Output<VersionType> type;

    public Output<VersionType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * 
     */
    @Import(name="versionNumber")
      private final @Nullable Output<String> versionNumber;

    public Output<String> getVersionNumber() {
        return this.versionNumber == null ? Codegen.empty() : this.versionNumber;
    }

    public VersionArgs(
        @Nullable Output<List<String>> availableFeatures,
        @Nullable Output<Boolean> defaultVersion,
        @Nullable Output<VersionType> type,
        @Nullable Output<String> versionNumber) {
        this.availableFeatures = availableFeatures;
        this.defaultVersion = defaultVersion;
        this.type = type;
        this.versionNumber = versionNumber;
    }

    private VersionArgs() {
        this.availableFeatures = Codegen.empty();
        this.defaultVersion = Codegen.empty();
        this.type = Codegen.empty();
        this.versionNumber = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> availableFeatures;
        private @Nullable Output<Boolean> defaultVersion;
        private @Nullable Output<VersionType> type;
        private @Nullable Output<String> versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableFeatures = defaults.availableFeatures;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.type = defaults.type;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder availableFeatures(@Nullable Output<List<String>> availableFeatures) {
            this.availableFeatures = availableFeatures;
            return this;
        }
        public Builder availableFeatures(@Nullable List<String> availableFeatures) {
            this.availableFeatures = Codegen.ofNullable(availableFeatures);
            return this;
        }
        public Builder availableFeatures(String... availableFeatures) {
            return availableFeatures(List.of(availableFeatures));
        }
        public Builder defaultVersion(@Nullable Output<Boolean> defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Builder defaultVersion(@Nullable Boolean defaultVersion) {
            this.defaultVersion = Codegen.ofNullable(defaultVersion);
            return this;
        }
        public Builder type(@Nullable Output<VersionType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable VersionType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder versionNumber(@Nullable Output<String> versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public Builder versionNumber(@Nullable String versionNumber) {
            this.versionNumber = Codegen.ofNullable(versionNumber);
            return this;
        }        public VersionArgs build() {
            return new VersionArgs(availableFeatures, defaultVersion, type, versionNumber);
        }
    }
}
