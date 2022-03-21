// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.enums.AptSettingsType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Apt patching is completed by executing `apt-get update && apt-get upgrade`. Additional options can be set to control how this is executed.
 * 
 */
public final class AptSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AptSettingsArgs Empty = new AptSettingsArgs();

    /**
     * List of packages to exclude from update. These packages will be excluded
     * 
     */
    @Import(name="excludes")
      private final @Nullable Output<List<String>> excludes;

    public Output<List<String>> getExcludes() {
        return this.excludes == null ? Output.empty() : this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field cannot be specified with any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePackages")
      private final @Nullable Output<List<String>> exclusivePackages;

    public Output<List<String>> getExclusivePackages() {
        return this.exclusivePackages == null ? Output.empty() : this.exclusivePackages;
    }

    /**
     * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<AptSettingsType> type;

    public Output<AptSettingsType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public AptSettingsArgs(
        @Nullable Output<List<String>> excludes,
        @Nullable Output<List<String>> exclusivePackages,
        @Nullable Output<AptSettingsType> type) {
        this.excludes = excludes;
        this.exclusivePackages = exclusivePackages;
        this.type = type;
    }

    private AptSettingsArgs() {
        this.excludes = Output.empty();
        this.exclusivePackages = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AptSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> excludes;
        private @Nullable Output<List<String>> exclusivePackages;
        private @Nullable Output<AptSettingsType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AptSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.type = defaults.type;
        }

        public Builder excludes(@Nullable Output<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }
        public Builder excludes(@Nullable List<String> excludes) {
            this.excludes = Output.ofNullable(excludes);
            return this;
        }
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }
        public Builder exclusivePackages(@Nullable Output<List<String>> exclusivePackages) {
            this.exclusivePackages = exclusivePackages;
            return this;
        }
        public Builder exclusivePackages(@Nullable List<String> exclusivePackages) {
            this.exclusivePackages = Output.ofNullable(exclusivePackages);
            return this;
        }
        public Builder exclusivePackages(String... exclusivePackages) {
            return exclusivePackages(List.of(exclusivePackages));
        }
        public Builder type(@Nullable Output<AptSettingsType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable AptSettingsType type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public AptSettingsArgs build() {
            return new AptSettingsArgs(excludes, exclusivePackages, type);
        }
    }
}
