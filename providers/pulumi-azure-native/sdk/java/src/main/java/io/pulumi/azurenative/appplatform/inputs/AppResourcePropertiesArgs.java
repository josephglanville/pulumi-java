// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.PersistentDiskArgs;
import io.pulumi.azurenative.appplatform.inputs.TemporaryDiskArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * App resource properties payload
 * 
 */
public final class AppResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppResourcePropertiesArgs Empty = new AppResourcePropertiesArgs();

    /**
     * Name of the active deployment of the App
     * 
     */
    @Import(name="activeDeploymentName")
      private final @Nullable Output<String> activeDeploymentName;

    public Output<String> getActiveDeploymentName() {
        return this.activeDeploymentName == null ? Output.empty() : this.activeDeploymentName;
    }

    /**
     * Fully qualified dns Name.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> getFqdn() {
        return this.fqdn == null ? Output.empty() : this.fqdn;
    }

    /**
     * Indicate if only https is allowed.
     * 
     */
    @Import(name="httpsOnly")
      private final @Nullable Output<Boolean> httpsOnly;

    public Output<Boolean> getHttpsOnly() {
        return this.httpsOnly == null ? Output.empty() : this.httpsOnly;
    }

    /**
     * Persistent disk settings
     * 
     */
    @Import(name="persistentDisk")
      private final @Nullable Output<PersistentDiskArgs> persistentDisk;

    public Output<PersistentDiskArgs> getPersistentDisk() {
        return this.persistentDisk == null ? Output.empty() : this.persistentDisk;
    }

    /**
     * Indicates whether the App exposes public endpoint
     * 
     */
    @Import(name="public")
      private final @Nullable Output<Boolean> $public;

    public Output<Boolean> get$public() {
        return this.$public == null ? Output.empty() : this.$public;
    }

    /**
     * Temporary disk settings
     * 
     */
    @Import(name="temporaryDisk")
      private final @Nullable Output<TemporaryDiskArgs> temporaryDisk;

    public Output<TemporaryDiskArgs> getTemporaryDisk() {
        return this.temporaryDisk == null ? Output.empty() : this.temporaryDisk;
    }

    public AppResourcePropertiesArgs(
        @Nullable Output<String> activeDeploymentName,
        @Nullable Output<String> fqdn,
        @Nullable Output<Boolean> httpsOnly,
        @Nullable Output<PersistentDiskArgs> persistentDisk,
        @Nullable Output<Boolean> $public,
        @Nullable Output<TemporaryDiskArgs> temporaryDisk) {
        this.activeDeploymentName = activeDeploymentName;
        this.fqdn = fqdn;
        this.httpsOnly = httpsOnly == null ? Output.ofNullable(false) : httpsOnly;
        this.persistentDisk = persistentDisk;
        this.$public = $public;
        this.temporaryDisk = temporaryDisk;
    }

    private AppResourcePropertiesArgs() {
        this.activeDeploymentName = Output.empty();
        this.fqdn = Output.empty();
        this.httpsOnly = Output.empty();
        this.persistentDisk = Output.empty();
        this.$public = Output.empty();
        this.temporaryDisk = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDeploymentName;
        private @Nullable Output<String> fqdn;
        private @Nullable Output<Boolean> httpsOnly;
        private @Nullable Output<PersistentDiskArgs> persistentDisk;
        private @Nullable Output<Boolean> $public;
        private @Nullable Output<TemporaryDiskArgs> temporaryDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(AppResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeploymentName = defaults.activeDeploymentName;
    	      this.fqdn = defaults.fqdn;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.persistentDisk = defaults.persistentDisk;
    	      this.$public = defaults.$public;
    	      this.temporaryDisk = defaults.temporaryDisk;
        }

        public Builder activeDeploymentName(@Nullable Output<String> activeDeploymentName) {
            this.activeDeploymentName = activeDeploymentName;
            return this;
        }
        public Builder activeDeploymentName(@Nullable String activeDeploymentName) {
            this.activeDeploymentName = Output.ofNullable(activeDeploymentName);
            return this;
        }
        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Output.ofNullable(fqdn);
            return this;
        }
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = Output.ofNullable(httpsOnly);
            return this;
        }
        public Builder persistentDisk(@Nullable Output<PersistentDiskArgs> persistentDisk) {
            this.persistentDisk = persistentDisk;
            return this;
        }
        public Builder persistentDisk(@Nullable PersistentDiskArgs persistentDisk) {
            this.persistentDisk = Output.ofNullable(persistentDisk);
            return this;
        }
        public Builder $public(@Nullable Output<Boolean> $public) {
            this.$public = $public;
            return this;
        }
        public Builder $public(@Nullable Boolean $public) {
            this.$public = Output.ofNullable($public);
            return this;
        }
        public Builder temporaryDisk(@Nullable Output<TemporaryDiskArgs> temporaryDisk) {
            this.temporaryDisk = temporaryDisk;
            return this;
        }
        public Builder temporaryDisk(@Nullable TemporaryDiskArgs temporaryDisk) {
            this.temporaryDisk = Output.ofNullable(temporaryDisk);
            return this;
        }        public AppResourcePropertiesArgs build() {
            return new AppResourcePropertiesArgs(activeDeploymentName, fqdn, httpsOnly, persistentDisk, $public, temporaryDisk);
        }
    }
}
