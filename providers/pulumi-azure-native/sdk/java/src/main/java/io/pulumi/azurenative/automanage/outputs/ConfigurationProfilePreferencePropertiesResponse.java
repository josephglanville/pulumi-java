// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.outputs;

import io.pulumi.azurenative.automanage.outputs.ConfigurationProfilePreferenceAntiMalwareResponse;
import io.pulumi.azurenative.automanage.outputs.ConfigurationProfilePreferenceVmBackupResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationProfilePreferencePropertiesResponse {
    private final @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware;
    private final @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup;

    @OutputCustomType.Constructor({"antiMalware","vmBackup"})
    private ConfigurationProfilePreferencePropertiesResponse(
        @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware,
        @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup) {
        this.antiMalware = antiMalware;
        this.vmBackup = vmBackup;
    }

    public Optional<ConfigurationProfilePreferenceAntiMalwareResponse> getAntiMalware() {
        return Optional.ofNullable(this.antiMalware);
    }
    public Optional<ConfigurationProfilePreferenceVmBackupResponse> getVmBackup() {
        return Optional.ofNullable(this.vmBackup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfilePreferencePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware;
        private @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfilePreferencePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiMalware = defaults.antiMalware;
    	      this.vmBackup = defaults.vmBackup;
        }

        public Builder setAntiMalware(@Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware) {
            this.antiMalware = antiMalware;
            return this;
        }

        public Builder setVmBackup(@Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup) {
            this.vmBackup = vmBackup;
            return this;
        }

        public ConfigurationProfilePreferencePropertiesResponse build() {
            return new ConfigurationProfilePreferencePropertiesResponse(antiMalware, vmBackup);
        }
    }
}
