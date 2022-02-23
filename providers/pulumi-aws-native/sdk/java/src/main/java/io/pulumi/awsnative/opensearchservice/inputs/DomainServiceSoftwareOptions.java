// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainServiceSoftwareOptions extends io.pulumi.resources.InvokeArgs {

    public static final DomainServiceSoftwareOptions Empty = new DomainServiceSoftwareOptions();

    @InputImport(name="automatedUpdateDate")
      private final @Nullable String automatedUpdateDate;

    public Optional<String> getAutomatedUpdateDate() {
        return this.automatedUpdateDate == null ? Optional.empty() : Optional.ofNullable(this.automatedUpdateDate);
    }

    @InputImport(name="cancellable")
      private final @Nullable Boolean cancellable;

    public Optional<Boolean> getCancellable() {
        return this.cancellable == null ? Optional.empty() : Optional.ofNullable(this.cancellable);
    }

    @InputImport(name="currentVersion")
      private final @Nullable String currentVersion;

    public Optional<String> getCurrentVersion() {
        return this.currentVersion == null ? Optional.empty() : Optional.ofNullable(this.currentVersion);
    }

    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="newVersion")
      private final @Nullable String newVersion;

    public Optional<String> getNewVersion() {
        return this.newVersion == null ? Optional.empty() : Optional.ofNullable(this.newVersion);
    }

    @InputImport(name="optionalDeployment")
      private final @Nullable Boolean optionalDeployment;

    public Optional<Boolean> getOptionalDeployment() {
        return this.optionalDeployment == null ? Optional.empty() : Optional.ofNullable(this.optionalDeployment);
    }

    @InputImport(name="updateAvailable")
      private final @Nullable Boolean updateAvailable;

    public Optional<Boolean> getUpdateAvailable() {
        return this.updateAvailable == null ? Optional.empty() : Optional.ofNullable(this.updateAvailable);
    }

    @InputImport(name="updateStatus")
      private final @Nullable String updateStatus;

    public Optional<String> getUpdateStatus() {
        return this.updateStatus == null ? Optional.empty() : Optional.ofNullable(this.updateStatus);
    }

    public DomainServiceSoftwareOptions(
        @Nullable String automatedUpdateDate,
        @Nullable Boolean cancellable,
        @Nullable String currentVersion,
        @Nullable String description,
        @Nullable String newVersion,
        @Nullable Boolean optionalDeployment,
        @Nullable Boolean updateAvailable,
        @Nullable String updateStatus) {
        this.automatedUpdateDate = automatedUpdateDate;
        this.cancellable = cancellable;
        this.currentVersion = currentVersion;
        this.description = description;
        this.newVersion = newVersion;
        this.optionalDeployment = optionalDeployment;
        this.updateAvailable = updateAvailable;
        this.updateStatus = updateStatus;
    }

    private DomainServiceSoftwareOptions() {
        this.automatedUpdateDate = null;
        this.cancellable = null;
        this.currentVersion = null;
        this.description = null;
        this.newVersion = null;
        this.optionalDeployment = null;
        this.updateAvailable = null;
        this.updateStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainServiceSoftwareOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String automatedUpdateDate;
        private @Nullable Boolean cancellable;
        private @Nullable String currentVersion;
        private @Nullable String description;
        private @Nullable String newVersion;
        private @Nullable Boolean optionalDeployment;
        private @Nullable Boolean updateAvailable;
        private @Nullable String updateStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainServiceSoftwareOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedUpdateDate = defaults.automatedUpdateDate;
    	      this.cancellable = defaults.cancellable;
    	      this.currentVersion = defaults.currentVersion;
    	      this.description = defaults.description;
    	      this.newVersion = defaults.newVersion;
    	      this.optionalDeployment = defaults.optionalDeployment;
    	      this.updateAvailable = defaults.updateAvailable;
    	      this.updateStatus = defaults.updateStatus;
        }

        public Builder setAutomatedUpdateDate(@Nullable String automatedUpdateDate) {
            this.automatedUpdateDate = automatedUpdateDate;
            return this;
        }

        public Builder setCancellable(@Nullable Boolean cancellable) {
            this.cancellable = cancellable;
            return this;
        }

        public Builder setCurrentVersion(@Nullable String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setNewVersion(@Nullable String newVersion) {
            this.newVersion = newVersion;
            return this;
        }

        public Builder setOptionalDeployment(@Nullable Boolean optionalDeployment) {
            this.optionalDeployment = optionalDeployment;
            return this;
        }

        public Builder setUpdateAvailable(@Nullable Boolean updateAvailable) {
            this.updateAvailable = updateAvailable;
            return this;
        }

        public Builder setUpdateStatus(@Nullable String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public DomainServiceSoftwareOptions build() {
            return new DomainServiceSoftwareOptions(automatedUpdateDate, cancellable, currentVersion, description, newVersion, optionalDeployment, updateAvailable, updateStatus);
        }
    }
}
